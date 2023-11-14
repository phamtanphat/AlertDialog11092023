package com.example.alertdialog11092023.design_pattern_builder

interface PizzaBuilder {
    fun setPizza(pizzaEnum: PizzaEnum): PizzaBuilder
    fun setSalad(salad: SaladEnum): PizzaBuilder
    fun setWater(water: WaterEnum): PizzaBuilder
    fun setDessert(dessertEnum: DessertEnum): PizzaBuilder
    fun build(): PizzaStore
}