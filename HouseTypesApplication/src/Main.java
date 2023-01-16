public class Main {
    public static void main(String[] args) {

        System.out.println("House Types: House, Villa, Summerhouse");

        //Houses
        House house1 = new House("House",1750000,135,3,1 );
        House house2 = new House("House", 949900,105,2,1);

        //Villas
        House villa1 = new House("Villa", 5750000,400,5,1);
        House villa2 = new House("Villa", 36000000, 400,4,1);

        //Summerhouses
        House summerhouse1 = new House("Summerhouse", 4500000,200,3,1);
        House summerhouse2 = new House("Summerhouse",4190000,235,5,1 );

        //Array of all house types
        House[] houses = new House[]{house1,house2,villa1,villa2,summerhouse1,summerhouse2};


        HouseManager houseManager = new HouseManager();
        System.out.println("Total price of houses: " + houseManager.getHousePrices(houses)); //Get house prices
        System.out.println("Total price of villas: " + houseManager.getVillaPrices(houses)); //Get villa prices
        System.out.println("Total price of summerhouses: " + houseManager.getSummerhousePrices(houses)); //Get summerhouse prices
        System.out.println("Total price of all house types: " + houseManager.getAllHousePrices(houses)); //Get all house types price
        System.out.println("Average square meters of houses: " + houseManager.getAverageSquareMetersOfHouses(houses)); //Get average square meters of houses
        System.out.println("Average square meters of villas: " + houseManager.getAverageSquareMetersOfVillas(houses)); //Get average square meters of villas
        System.out.println("Average square meters of summerhouses: " + houseManager.getAverageSquareMetersOfSummerhouses(houses)); //Get average square meters of summerhouses
        System.out.println("Average square meters of all house types: " + houseManager.getAverageSquareMetersOfAllHouses(houses)); //Get average square meters of all house types
        houseManager.filterByNumberOfRooms(houses); //Filter by number of rooms
    }
}