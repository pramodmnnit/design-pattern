package com.design.pattern.behavioraldesignpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {


  private final List<Channel> channelsList;

  public ChannelCollectionImpl() {
    channelsList = new ArrayList<>();
  }

  @Override
  public void addChannel(Channel channel) {
    this.channelsList.add(channel);
  }

  @Override
  public void removeChannel(Channel channel) {
    this.channelsList.remove(channel);
  }

  @Override
  public ChannelIterator iterator(ChannelTypeEnum type) {
    return new ChannelIteratorImpl(type, channelsList, 0);
  }

  static class ChannelIteratorImpl implements  ChannelIterator {

    private final ChannelTypeEnum type;
    private final List<Channel> channels;
    private  int position ;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels, int position) {
      this.type = type;
      this.channels = channels;
      this.position = position;
    }

    @Override
    public boolean hasNext() {

      while (position < channels.size()){
        Channel channel = channels.get(position);
        if(channel.getType() == type || type == ChannelTypeEnum.ALL){
          return true;
        } else {
          position++;
        }
      }
      return false;

    }

    @Override
    public Channel next() {
      Channel channel = channels.get(position);
      position++;
      return channel;
    }
  }
}
