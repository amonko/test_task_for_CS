package com.cs.support;

import io.appium.java_client.service.local.flags.ServerArgument;

public enum Arguments implements ServerArgument {

    TIME_OUT("--command-timeout"),
    LOG_LEVEL("--log-level");

    private final String arguments;

    Arguments(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public String getArgument() {
        return arguments;
    }
}
