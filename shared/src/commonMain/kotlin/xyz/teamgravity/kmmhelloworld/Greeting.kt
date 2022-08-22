package xyz.teamgravity.kmmhelloworld

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}