package io.muoncore.newton.eventsource.muon;

import io.muoncore.newton.AggregateRoot;
import io.muoncore.newton.DocumentId;
import io.muoncore.newton.eventsource.AggregateConfiguration;

@AggregateConfiguration(context = "user")
public class MyTestAggregate extends AggregateRoot<DocumentId> {


}
