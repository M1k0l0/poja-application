package com.poja.application.endpoint.event.consumer.model;

import com.poja.application.PojaGenerated;
import com.poja.application.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
