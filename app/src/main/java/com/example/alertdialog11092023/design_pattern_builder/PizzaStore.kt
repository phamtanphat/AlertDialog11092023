package com.example.alertdialog11092023.design_pattern_builder

data class PizzaStore(
    var pizza: PizzaEnum?,
    var salad: SaladEnum?,
    var water: WaterEnum?,
    var dessert: DessertEnum?,
) {

    class Builder : PizzaBuilder {
        private var pizza: PizzaEnum? = null
        private var salad: SaladEnum? = null
        private var water: WaterEnum? = null
        private var dessert: DessertEnum? = null
        override fun setPizza(pizza: PizzaEnum): PizzaBuilder {
            this.pizza = pizza
            return this
        }

        override fun setSalad(salad: SaladEnum): PizzaBuilder {
            this.salad = salad
            return this
        }

        override fun setWater(water: WaterEnum): PizzaBuilder {
            this.water = water
            return this
        }

        override fun setDessert(dessert: DessertEnum): PizzaBuilder {
            this.dessert = dessert
            return this
        }

        override fun build(): PizzaStore {
            return PizzaStore(pizza, salad, water, dessert)
        }
    }
}