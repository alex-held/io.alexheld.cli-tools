fun main() {

    baz("git tool", "ist", "voll")
}


fun baz(vararg args: String) = if (args.size > 4)  System.out.println("Too many") else {
    for (a in args) System.out.println(a)
}


class A {
    init {
        System.out.println("A::init")
    }

    fun f() {
        System.out.println("A::f")
    }
}
