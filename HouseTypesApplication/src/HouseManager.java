public class HouseManager {
    //Amount of houses
    public int amountOfHouse(House[] houses){
        int amount = 0;
        for(House house : houses)
            if(house.type =="House"){
                amount += 1;
            }
        return amount;
    }

    //Amount of villas
    public int amountOfVilla(House[] houses){
        int amount = 0;
        for(House house : houses)
            if(house.type =="Villa"){
                amount += 1;
            }
        return amount;
    }

    //Amount of summerhouses
    public int amountOfSummerhouse(House[] houses){
        int amount = 0;
        for(House house : houses)
            if(house.type =="Summerhouse"){
                amount += 1;
            }
        return amount;
    }
    //Get house prices
    public int getHousePrices(House[] houses){
        int totalPrice = 0;
        for (House house : houses)
            if (house.type == "House") {
                totalPrice += house.price;
            }
        return totalPrice;
    }
    //Get villa prices
    public int getVillaPrices(House[] houses){
        int totalPrice = 0;
        for (House house : houses)
            if (house.type == "Villa") {
                totalPrice += house.price;
            }
        return totalPrice;
    }
    //Get summerhouse prices
    public int getSummerhousePrices(House[] houses){
        int totalPrice = 0;
        for (House house : houses)
            if (house.type == "Summerhouse") {
                totalPrice += house.price;
            }
        return totalPrice;
    }
    //Get all house types price
    public int getAllHousePrices(House[] houses){
        int totalPrice = 0;
        for(int i=0; i<houses.length; i++){
                totalPrice += houses[i].price;
        }
        return totalPrice;
    }
    //Get average square meters of houses
    public int getAverageSquareMetersOfHouses(House[] houses){
        int averageSquareMeters = 0;
        for(int i=0; i<houses.length; i++){
            if(houses[i].type == "House"){
                averageSquareMeters += (houses[i].squareMeters);
            }
        }
        return averageSquareMeters/amountOfHouse(houses);
    }
    //Get average square meters of villas
    public int getAverageSquareMetersOfVillas(House[] houses){
        int averageSquareMeters = 0;
        for (House house : houses) {
            if (house.type == "Villa") {
                averageSquareMeters += (house.squareMeters);
            }
        }
        return averageSquareMeters/amountOfVilla(houses);
    }
    //Get average square meters of summerhouses
    public int getAverageSquareMetersOfSummerhouses(House[] houses){
        int averageSquareMeters = 0;
        for(int i=0; i<houses.length; i++){
            if(houses[i].type == "Summerhouse"){
                averageSquareMeters += (houses[i].squareMeters);
            }
        }
        return averageSquareMeters/amountOfSummerhouse(houses);
    }
    //Get average square meters of all house types
    public int getAverageSquareMetersOfAllHouses(House[] houses){
        int averageSquareMeters = 0;
        for(int i=0; i<houses.length; i++){
            averageSquareMeters += (houses[i].squareMeters);
        }
        return averageSquareMeters/houses.length;
    }

    //Filter by number of rooms
    public void filterByNumberOfRooms(House[] houses){
        for (House house : houses) {
            if((house.numberOfRooms + house.numberOfHalls) <= 3){
                System.out.println("This house is small." + " House type: " + house.type + " House price: " + house.price + " Number of rooms: " + house.numberOfRooms + " Number of halls: " + house.numberOfHalls);
            } else if (((house.numberOfRooms + house.numberOfHalls) > 3) && ((house.numberOfRooms + house.numberOfHalls) <= 5)) {
                System.out.println("This house is medium." + " House type: " + house.type + " House price: " + house.price + " Number of rooms: " + house.numberOfRooms + " Number of halls: " + house.numberOfHalls);
            }
            else{
                System.out.println("This house is large." + " House type: " + house.type + " House price: " + house.price + " Number of rooms: " + house.numberOfRooms + " Number of halls: " + house.numberOfHalls);
            }
        }
    }
}
