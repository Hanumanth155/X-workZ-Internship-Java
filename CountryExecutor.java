class CountryExecutor{

    public static void main(String[] args){
	
	/*String stateName = "India";
	String[] stateNames = Country.findStatesByCountry(stateName);
	Country.getStates(stateNames);
	
	stateName = "USA";
	stateNames = Country.findStatesByCountry(stateName);
	Country.getStates(stateNames);*/

        String[] countries = {
            "India","USA","Canada","Australia","Brazil","Germany","France","Italy","Japan","China",
            "Russia","Mexico","South Korea","North Korea","United Kingdom","Spain","Saudi Arabia","South Africa","Indonesia","Argentina",
            "Turkey","Pakistan","Bangladesh","Nepal","Sri Lanka","Bhutan","Maldives","Afghanistan","Iran","Iraq",
            "United Arab Emirates","Qatar","Oman","Kuwait","Israel","Egypt","Nigeria","Kenya","Ethiopia","Morocco",
            "Algeria","Tunisia","Ghana","Uganda","Thailand","Vietnam","Malaysia","Singapore","Philippines","New Zealand",
            "Switzerland","Netherlands","Belgium","Sweden","Norway","Denmark","Finland","Poland","Austria","Greece",
            "Portugal","Ireland","Czech Republic","Hungary","Romania","Bulgaria","Ukraine","Belarus","Chile","Colombia",
            "Peru","Venezuela","Ecuador","Bolivia","Paraguay","Uruguay","Panama","Costa Rica","Guatemala","Honduras",
            "El Salvador","Nicaragua","Cuba","Dominican Republic","Haiti","Jamaica","Iceland","Luxembourg","Slovakia","Slovenia",
            "Croatia","Serbia","Bosnia and Herzegovina","Montenegro","North Macedonia","Albania","Lithuania","Latvia","Estonia","Cambodia",
            "Laos","Myanmar","Mongolia","Kazakhstan","Uzbekistan","Turkmenistan","Kyrgyzstan","Tajikistan","Armenia","Azerbaijan",
            "Georgia","Jordan","Lebanon","Syria","Yemen","Libya","Sudan","South Sudan","Senegal","Ivory Coast",
            "Cameroon","Zimbabwe","Zambia","Tanzania","Mozambique","Madagascar","Angola","Namibia","Botswana","Malawi",
            "Rwanda","Burundi","Somalia","Eritrea","Djibouti","Sierra Leone","Liberia","Guinea","Guinea-Bissau","Gabon",
            "Republic of the Congo","Democratic Republic of the Congo","Central African Republic","Chad","Niger","Mali","Burkina Faso","Benin","Togo",
            "Mauritania","Cape Verde","Equatorial Guinea","Sao Tome and Principe","Lesotho","Eswatini","Comoros","Seychelles","Mauritius","Gambia",
            "Suriname","Guyana","Brunei","Papua New Guinea","Fiji","Solomon Islands","Vanuatu","Samoa","Tonga","Kiribati",
            "Micronesia","Palau","Marshall Islands","Malta","Cyprus","Andorra","Monaco","Liechtenstein","San Marino","Vatican City",
            "Timor-Leste","Bahamas","Barbados","Trinidad and Tobago","Grenada","Saint Lucia","Saint Vincent and the Grenadines",
            "Antigua and Barbuda","Dominica","Saint Kitts and Nevis","Belize","Western Sahara","Kosovo","Taiwan","Palestine"
        };

        for(String stateName : countries){
            String[] stateNames = Country.findStatesByCountry(stateName);
            Country.getStates(stateNames);
        }
    }
}
	
	


