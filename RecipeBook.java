class RecipeBook {

    static void getSteps() {
        System.out.println("Fetching recipe steps started");
        IngredientList.checkStock();
        System.out.println("Fetching recipe steps ended");
    }
}