package org.foo

class Bar {
    def script

    Bar(script) {
        this.script = script
    }

    def printMessage(String message) {
        script.echo message
    }
}
