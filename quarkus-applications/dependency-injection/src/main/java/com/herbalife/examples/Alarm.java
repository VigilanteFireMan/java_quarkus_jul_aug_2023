package com.herbalife.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

public interface Alarm {
}

@ApplicationScoped
//@Default
@Named("soundAlarm")
class SoundAlarm implements Alarm {
}

@ApplicationScoped
//@Alternative
@Named("visualAlarm")
class VisualAlarm implements Alarm {
}
