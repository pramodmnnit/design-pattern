package com.design.pattern.behavioraldesignpattern.iteratorpattern;
public interface ChannelCollection {
  void addChannel(Channel channel);
  void removeChannel(Channel channel);

  ChannelIterator iterator(ChannelTypeEnum type);
}
