package kdesign.creational.abstract

interface Plant

class OrangePlant : Plant

class ApplePlant : Plant

abstract class PlantFactory {
    abstract fun makePlant(): Plant

    companion object {
        inline fun <reified T : Plant> createFactory(): PlantFactory = when (T::class) {
            OrangePlant::class -> OrangeFactory()
            ApplePlant::class -> AppleFactory()
            else -> throw IllegalArgumentException()
        }
    }
}

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = ApplePlant()
}

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant()
}

fun main(args: Array<String>) {
    /*val plantFactory = PlantFactory.createFactory(OrangePlant::class)
    val plant = plantFactory.makePlant()
    println("Created plant: $plant")*/
}