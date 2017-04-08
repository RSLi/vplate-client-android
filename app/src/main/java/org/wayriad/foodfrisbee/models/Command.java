package org.wayriad.foodfrisbee.models;

/**
 * Created by rsli on 4/8/17.
 */

public enum Command
{
    FORWARD("forward"),
    STOP("stop"),
    BACK("back");

    String str;

    Command(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
