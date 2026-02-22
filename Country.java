class Country {

    static String[] findStatesByCountry(String countryName) {

        if(countryName=="India"){
            String[] stateNames={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
            return stateNames;
        }

        else if(countryName=="USA"){
            String[] stateNames={"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
            return stateNames;
        }

        else if(countryName=="Canada"){
            String[] stateNames={"Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland and Labrador","Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"};
            return stateNames;
        }

        else if(countryName=="Australia"){
            String[] stateNames={"New South Wales","Queensland","South Australia","Tasmania","Victoria","Western Australia"};
            return stateNames;
        }

        else if(countryName=="Brazil"){
            String[] stateNames={"Acre","Alagoas","Amapa","Amazonas","Bahia","Ceara","Distrito Federal","Espirito Santo","Goias","Maranhao","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Para","Paraiba","Parana","Pernambuco","Piaui","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondonia","Roraima","Santa Catarina","Sao Paulo","Sergipe","Tocantins"};
            return stateNames;
        }

        else if(countryName=="Germany"){
            String[] stateNames={"Baden-Wurttemberg","Bavaria","Berlin","Brandenburg","Bremen","Hamburg","Hesse","Lower Saxony","Mecklenburg-Vorpommern","North Rhine-Westphalia","Rhineland-Palatinate","Saarland","Saxony","Saxony-Anhalt","Schleswig-Holstein","Thuringia"};
            return stateNames;
        }

        else if(countryName=="France"){
            String[] stateNames={"Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany","Centre-Val de Loire","Corsica","Grand Est","Hauts-de-France","Ile-de-France","Normandy","Nouvelle-Aquitaine","Occitanie","Pays de la Loire","Provence-Alpes-Cote d'Azur"};
            return stateNames;
        }

        else if(countryName=="Italy"){
            String[] stateNames={"Abruzzo","Basilicata","Calabria","Campania","Emilia-Romagna","Friuli Venezia Giulia","Lazio","Liguria","Lombardy","Marche","Molise","Piedmont","Apulia","Sardinia","Sicily","Tuscany","Trentino-Alto Adige","Umbria","Aosta Valley","Veneto"};
            return stateNames;
        }

        else if(countryName=="Japan"){
            String[] stateNames={"Hokkaido","Aomori","Iwate","Miyagi","Akita","Yamagata","Fukushima","Ibaraki","Tochigi","Gunma","Saitama","Chiba","Tokyo","Kanagawa","Niigata","Toyama","Ishikawa","Fukui","Yamanashi","Nagano","Gifu","Shizuoka","Aichi","Mie","Shiga","Kyoto","Osaka","Hyogo","Nara","Wakayama","Tottori","Shimane","Okayama","Hiroshima","Yamaguchi","Tokushima","Kagawa","Ehime","Kochi","Fukuoka","Saga","Nagasaki","Kumamoto","Oita","Miyazaki","Kagoshima","Okinawa"};
            return stateNames;
        }

        else if(countryName=="China"){
            String[] stateNames={"Anhui","Fujian","Gansu","Guangdong","Guizhou","Hainan","Hebei","Heilongjiang","Henan","Hubei","Hunan","Jiangsu","Jiangxi","Jilin","Liaoning","Qinghai","Shaanxi","Shandong","Shanxi","Sichuan","Yunnan","Zhejiang"};
            return stateNames;
        }

        else if(countryName=="Russia"){
            String[] stateNames={"Moscow","Saint Petersburg","Tatarstan","Bashkortostan","Chechnya","Dagestan","Sakha","Krasnodar","Primorsky","Sverdlovsk"};
            return stateNames;
        }

        else if(countryName=="Mexico"){
            String[] stateNames={"Aguascalientes","Baja California","Baja California Sur","Campeche","Chiapas","Chihuahua","Coahuila","Colima","Durango","Guanajuato","Guerrero","Hidalgo","Jalisco","Mexico State","Michoacan","Morelos","Nayarit","Nuevo Leon","Oaxaca","Puebla","Queretaro","Quintana Roo","San Luis Potosi","Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatan","Zacatecas"};
            return stateNames;
        }

        else if(countryName=="South Korea"){
            String[] stateNames={"Seoul","Busan","Daegu","Incheon","Gwangju","Daejeon","Ulsan","Sejong","Gyeonggi","Gangwon","North Chungcheong","South Chungcheong","North Jeolla","South Jeolla","North Gyeongsang","South Gyeongsang","Jeju"};
            return stateNames;
        }

        else if(countryName=="North Korea"){
            String[] stateNames={"Pyongyang","Rason","Nampo","Kaesong","North Pyongan","South Pyongan","Chagang","North Hamgyong","South Hamgyong","Ryanggang","North Hwanghae","South Hwanghae","Kangwon"};
            return stateNames;
        }

        else if(countryName=="United Kingdom"){
            String[] stateNames={"England","Scotland","Wales","Northern Ireland"};
            return stateNames;
        }

        else if(countryName=="Spain"){
            String[] stateNames={"Andalusia","Aragon","Asturias","Balearic Islands","Basque Country","Canary Islands","Cantabria","Castile-La Mancha","Castile and Leon","Catalonia","Extremadura","Galicia","La Rioja","Madrid","Murcia","Navarre","Valencia"};
            return stateNames;
        }

        else if(countryName=="Saudi Arabia"){
            String[] stateNames={"Riyadh","Makkah","Madinah","Eastern Province","Asir","Tabuk","Qassim","Hail","Najran","Jazan","Al Bahah","Al Jawf","Northern Borders"};
            return stateNames;
        }

        else if(countryName=="South Africa"){
            String[] stateNames={"Eastern Cape","Free State","Gauteng","KwaZulu-Natal","Limpopo","Mpumalanga","North West","Northern Cape","Western Cape"};
            return stateNames;
        }

        else if(countryName=="Indonesia"){
            String[] stateNames={"Aceh","Bali","Banten","Central Java","East Java","Jakarta","West Java","Papua","Riau","South Sulawesi"};
            return stateNames;
        }

        else if(countryName=="Argentina"){
            String[] stateNames={"Buenos Aires","Catamarca","Chaco","Chubut","Cordoba","Corrientes","Entre Rios","Formosa","Jujuy","La Pampa","La Rioja","Mendoza","Misiones","Neuquen","Rio Negro","Salta","San Juan","San Luis","Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego","Tucuman"};
            return stateNames;
        }

        else if(countryName=="Turkey"){
            String[] stateNames={"Ankara","Istanbul","Izmir","Bursa","Adana","Antalya","Konya","Gaziantep","Kayseri","Mersin"};
            return stateNames;
        }

        else if(countryName=="Pakistan"){
            String[] stateNames={"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan"};
            return stateNames;
        }

        else if(countryName=="Bangladesh"){
            String[] stateNames={"Dhaka","Chattogram","Khulna","Rajshahi","Barishal","Sylhet","Rangpur","Mymensingh"};
            return stateNames;
        }

        else if(countryName=="Nepal"){
            String[] stateNames={"Koshi","Madhesh","Bagmati","Gandaki","Lumbini","Karnali","Sudurpashchim"};
            return stateNames;
        }
		else if(countryName=="Sri Lanka"){
            String[] stateNames={"Western","Central","Southern","Northern","Eastern","North Western","North Central","Uva","Sabaragamuwa"};
            return stateNames;
        }

        else if(countryName=="Bhutan"){
            String[] stateNames={"Thimphu","Paro","Punakha","Wangdue Phodrang","Bumthang","Trongsa","Trashigang","Mongar","Samdrup Jongkhar","Haa"};
            return stateNames;
        }

        else if(countryName=="Maldives"){
            String[] stateNames={"Male","Addu","Fuvahmulah","Kulhudhuffushi","Thinadhoo","Naifaru","Mahibadhoo"};
            return stateNames;
        }

        else if(countryName=="Afghanistan"){
            String[] stateNames={"Kabul","Kandahar","Herat","Balkh","Nangarhar","Helmand","Kunduz","Badakhshan","Ghazni","Paktia"};
            return stateNames;
        }

        else if(countryName=="Iran"){
            String[] stateNames={"Tehran","Isfahan","Fars","Khorasan Razavi","East Azerbaijan","West Azerbaijan","Mazandaran","Kerman","Gilan","Khuzestan"};
            return stateNames;
        }

        else if(countryName=="Iraq"){
            String[] stateNames={"Baghdad","Basra","Nineveh","Erbil","Sulaymaniyah","Karbala","Najaf","Diyala","Anbar","Wasit"};
            return stateNames;
        }

        else if(countryName=="United Arab Emirates"){
            String[] stateNames={"Abu Dhabi","Dubai","Sharjah","Ajman","Fujairah","Ras Al Khaimah","Umm Al Quwain"};
            return stateNames;
        }

        else if(countryName=="Qatar"){
            String[] stateNames={"Doha","Al Rayyan","Al Wakrah","Al Khor","Umm Salal","Al Daayen","Al Shamal","Al Shahaniya"};
            return stateNames;
        }

        else if(countryName=="Oman"){
            String[] stateNames={"Muscat","Dhofar","Al Batinah North","Al Batinah South","Ad Dakhiliyah","Ash Sharqiyah North","Ash Sharqiyah South","Al Dhahirah","Al Wusta"};
            return stateNames;
        }

        else if(countryName=="Kuwait"){
            String[] stateNames={"Al Asimah","Hawalli","Farwaniya","Ahmadi","Jahra","Mubarak Al-Kabeer"};
            return stateNames;
        }

        else if(countryName=="Israel"){
            String[] stateNames={"Jerusalem","Tel Aviv","Haifa","Central","Northern","Southern"};
            return stateNames;
        }

        else if(countryName=="Egypt"){
            String[] stateNames={"Cairo","Alexandria","Giza","Dakahlia","Red Sea","Beheira","Fayoum","Gharbia","Ismailia","Luxor","Aswan"};
            return stateNames;
        }

        else if(countryName=="Nigeria"){
            String[] stateNames={"Lagos","Kano","Rivers","Oyo","Kaduna","Katsina","Sokoto","Plateau","Enugu","Anambra"};
            return stateNames;
        }

        else if(countryName=="Kenya"){
            String[] stateNames={"Nairobi","Mombasa","Kisumu","Nakuru","Kiambu","Uasin Gishu","Machakos","Meru","Nyeri","Kajiado"};
            return stateNames;
        }

        else if(countryName=="Ethiopia"){
            String[] stateNames={"Addis Ababa","Oromia","Amhara","Tigray","Somali","Afar","Sidama","Benishangul-Gumuz","Gambela","Harari"};
            return stateNames;
        }

        else if(countryName=="Morocco"){
            String[] stateNames={"Casablanca-Settat","Rabat-Sale-Kenitra","Marrakesh-Safi","Fes-Meknes","Tanger-Tetouan-Al Hoceima","Souss-Massa","Oriental","Draa-Tafilalet"};
            return stateNames;
        }

        else if(countryName=="Algeria"){
            String[] stateNames={"Algiers","Oran","Constantine","Annaba","Blida","Batna","Tlemcen","Bejaia","Setif","Tizi Ouzou"};
            return stateNames;
        }

        else if(countryName=="Tunisia"){
            String[] stateNames={"Tunis","Sfax","Sousse","Kairouan","Bizerte","Gabes","Ariana","Gafsa","Nabeul","Monastir"};
            return stateNames;
        }

        else if(countryName=="Ghana"){
            String[] stateNames={"Greater Accra","Ashanti","Western","Eastern","Central","Northern","Volta","Upper East","Upper West","Bono"};
            return stateNames;
        }

        else if(countryName=="Uganda"){
            String[] stateNames={"Kampala","Gulu","Mbarara","Jinja","Mbale","Arua","Masaka","Fort Portal","Hoima","Soroti"};
            return stateNames;
        }

        else if(countryName=="Thailand"){
            String[] stateNames={"Bangkok","Chiang Mai","Phuket","Chonburi","Khon Kaen","Nakhon Ratchasima","Udon Thani","Surat Thani","Songkhla","Ayutthaya"};
            return stateNames;
        }

        else if(countryName=="Vietnam"){
            String[] stateNames={"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong","Can Tho","Quang Ninh","Thanh Hoa","Nghe An","Binh Duong","Dong Nai"};
            return stateNames;
        }

        else if(countryName=="Malaysia"){
            String[] stateNames={"Johor","Kedah","Kelantan","Melaka","Negeri Sembilan","Pahang","Penang","Perak","Perlis","Sabah","Sarawak","Selangor"};
            return stateNames;
        }

        else if(countryName=="Singapore"){
            String[] stateNames={"Central","East","North","North-East","West"};
            return stateNames;
        }

        else if(countryName=="Philippines"){
            String[] stateNames={"Metro Manila","Cebu","Davao del Sur","Iloilo","Pangasinan","Batangas","Bulacan","Laguna","Rizal","Palawan"};
            return stateNames;
        }
		else if(countryName=="New Zealand"){
            String[] stateNames={"Auckland","Wellington","Canterbury","Otago","Waikato","Bay of Plenty","Northland","Taranaki","Hawke's Bay","Southland"};
            return stateNames;
        }

        else if(countryName=="Switzerland"){
            String[] stateNames={"Zurich","Geneva","Bern","Basel","Vaud","Aargau","St. Gallen","Lucerne","Ticino","Fribourg"};
            return stateNames;
        }

        else if(countryName=="Netherlands"){
            String[] stateNames={"North Holland","South Holland","Utrecht","Gelderland","North Brabant","Limburg","Overijssel","Flevoland","Groningen","Drenthe","Zeeland","Friesland"};
            return stateNames;
        }

        else if(countryName=="Belgium"){
            String[] stateNames={"Flanders","Wallonia","Brussels"};
            return stateNames;
        }

        else if(countryName=="Sweden"){
            String[] stateNames={"Stockholm","Vastra Gotaland","Skane","Uppsala","Orebro","Ostergotland","Halland","Jonkoping","Vasterbotten","Dalarna"};
            return stateNames;
        }

        else if(countryName=="Norway"){
            String[] stateNames={"Oslo","Viken","Vestland","Rogaland","Trondelag","Nordland","Innlandet","Agder","Troms og Finnmark"};
            return stateNames;
        }

        else if(countryName=="Denmark"){
            String[] stateNames={"Capital Region","Zealand","Southern Denmark","Central Denmark","North Denmark"};
            return stateNames;
        }

        else if(countryName=="Finland"){
            String[] stateNames={"Uusimaa","Southwest Finland","Pirkanmaa","North Ostrobothnia","Lapland","Central Finland","Satakunta","Kymenlaakso","South Karelia"};
            return stateNames;
        }

        else if(countryName=="Poland"){
            String[] stateNames={"Masovian","Silesian","Lesser Poland","Greater Poland","Pomeranian","Lower Silesian","Lodz","Podkarpackie","Lubelskie","West Pomeranian"};
            return stateNames;
        }

        else if(countryName=="Austria"){
            String[] stateNames={"Vienna","Lower Austria","Upper Austria","Styria","Tyrol","Carinthia","Salzburg","Vorarlberg","Burgenland"};
            return stateNames;
        }

        else if(countryName=="Greece"){
            String[] stateNames={"Attica","Central Macedonia","Crete","Thessaly","Western Greece","Epirus","Peloponnese","Ionian Islands","Aegean Islands"};
            return stateNames;
        }

        else if(countryName=="Portugal"){
            String[] stateNames={"Lisbon","Porto","Braga","Setubal","Aveiro","Coimbra","Faro","Madeira","Azores"};
            return stateNames;
        }

        else if(countryName=="Ireland"){
            String[] stateNames={"Dublin","Cork","Galway","Limerick","Waterford","Kerry","Mayo","Donegal","Clare"};
            return stateNames;
        }

        else if(countryName=="Czech Republic"){
            String[] stateNames={"Prague","Central Bohemian","South Bohemian","Plzen","Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove","South Moravian"};
            return stateNames;
        }

        else if(countryName=="Hungary"){
            String[] stateNames={"Budapest","Pest","Borsod-Abauj-Zemplen","Gyor-Moson-Sopron","Hajdu-Bihar","Csongrad","Fejer","Heves","Somogy"};
            return stateNames;
        }

        else if(countryName=="Romania"){
            String[] stateNames={"Bucharest","Cluj","Timis","Iasi","Constanta","Brasov","Prahova","Bihor","Arad"};
            return stateNames;
        }

        else if(countryName=="Bulgaria"){
            String[] stateNames={"Sofia","Plovdiv","Varna","Burgas","Ruse","Stara Zagora","Pleven","Sliven","Dobrich"};
            return stateNames;
        }

        else if(countryName=="Ukraine"){
            String[] stateNames={"Kyiv","Lviv","Kharkiv","Odessa","Dnipro","Zaporizhzhia","Vinnytsia","Poltava","Chernihiv"};
            return stateNames;
        }

        else if(countryName=="Belarus"){
            String[] stateNames={"Minsk","Brest","Grodno","Gomel","Mogilev","Vitebsk"};
            return stateNames;
        }

        else if(countryName=="Chile"){
            String[] stateNames={"Santiago Metropolitan","Valparaiso","Biobio","La Araucania","Los Lagos","Coquimbo","Antofagasta","Maule","Atacama"};
            return stateNames;
        }

        else if(countryName=="Colombia"){
            String[] stateNames={"Bogota","Antioquia","Valle del Cauca","Cundinamarca","Santander","Atlantico","Bolivar","Tolima","Boyaca"};
            return stateNames;
        }

        else if(countryName=="Peru"){
            String[] stateNames={"Lima","Cusco","Arequipa","La Libertad","Piura","Lambayeque","Junin","Ancash","Cajamarca"};
            return stateNames;
        }

        else if(countryName=="Venezuela"){
            String[] stateNames={"Caracas","Zulia","Miranda","Carabobo","Lara","Aragua","Bolivar","Tachira","Merida"};
            return stateNames;
        }

        else if(countryName=="Ecuador"){
            String[] stateNames={"Pichincha","Guayas","Azuay","Manabi","El Oro","Loja","Esmeraldas","Tungurahua","Chimborazo"};
            return stateNames;
        }

        else if(countryName=="Bolivia"){
            String[] stateNames={"La Paz","Santa Cruz","Cochabamba","Oruro","Potosi","Tarija","Beni","Pando","Chuquisaca"};
            return stateNames;
        }
		
		else if(countryName=="Paraguay"){
            String[] stateNames={"Asuncion","Alto Parana","Central","Itapua","Caaguazu","San Pedro","Cordillera","Guaira","Concepcion"};
            return stateNames;
        }

        else if(countryName=="Uruguay"){
            String[] stateNames={"Montevideo","Canelones","Maldonado","Salto","Paysandu","Rivera","Tacuarembo","Colonia","Soriano"};
            return stateNames;
        }

        else if(countryName=="Panama"){
            String[] stateNames={"Panama","Chiriqui","Colon","Cocle","Veraguas","Herrera","Los Santos","Bocas del Toro","Darien"};
            return stateNames;
        }

        else if(countryName=="Costa Rica"){
            String[] stateNames={"San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limon"};
            return stateNames;
        }

        else if(countryName=="Guatemala"){
            String[] stateNames={"Guatemala","Quetzaltenango","Escuintla","Alta Verapaz","Huehuetenango","Jutiapa","Peten","Chimaltenango"};
            return stateNames;
        }

        else if(countryName=="Honduras"){
            String[] stateNames={"Francisco Morazan","Cortes","Atlantida","Yoro","Colon","Olancho","Choluteca","Comayagua"};
            return stateNames;
        }

        else if(countryName=="El Salvador"){
            String[] stateNames={"San Salvador","La Libertad","Santa Ana","San Miguel","Usulutan","Sonsonate","Ahuachapan"};
            return stateNames;
        }

        else if(countryName=="Nicaragua"){
            String[] stateNames={"Managua","Leon","Masaya","Granada","Matagalpa","Chinandega","Esteli","Rivas"};
            return stateNames;
        }

        else if(countryName=="Cuba"){
            String[] stateNames={"Havana","Santiago de Cuba","Camaguey","Holguin","Villa Clara","Matanzas","Pinar del Rio"};
            return stateNames;
        }

        else if(countryName=="Dominican Republic"){
            String[] stateNames={"Santo Domingo","Santiago","La Vega","San Cristobal","La Romana","Puerto Plata","San Pedro de Macoris"};
            return stateNames;
        }

        else if(countryName=="Haiti"){
            String[] stateNames={"Ouest","Nord","Sud","Artibonite","Centre","Nord-Est","Sud-Est","Grand'Anse"};
            return stateNames;
        }

        else if(countryName=="Jamaica"){
            String[] stateNames={"Kingston","Saint Andrew","Saint Catherine","Clarendon","Manchester","Saint James","Saint Ann"};
            return stateNames;
        }

        else if(countryName=="Iceland"){
            String[] stateNames={"Capital Region","Southern Peninsula","Western Region","Westfjords","Northwest","Northeast","South"};
            return stateNames;
        }

        else if(countryName=="Luxembourg"){
            String[] stateNames={"Luxembourg","Diekirch","Grevenmacher"};
            return stateNames;
        }

        else if(countryName=="Slovakia"){
            String[] stateNames={"Bratislava","Kosice","Presov","Nitra","Zilina","Banska Bystrica","Trnava","Trencin"};
            return stateNames;
        }

        else if(countryName=="Slovenia"){
            String[] stateNames={"Ljubljana","Maribor","Celje","Kranj","Koper","Novo Mesto","Ptuj"};
            return stateNames;
        }

        else if(countryName=="Croatia"){
            String[] stateNames={"Zagreb","Split-Dalmatia","Primorje-Gorski Kotar","Osijek-Baranja","Istria","Zadar","Dubrovnik-Neretva"};
            return stateNames;
        }

        else if(countryName=="Serbia"){
            String[] stateNames={"Belgrade","Vojvodina","Sumadija","Nisava","Raska","Zlatibor","Kolubara"};
            return stateNames;
        }

        else if(countryName=="Bosnia and Herzegovina"){
            String[] stateNames={"Federation of Bosnia and Herzegovina","Republika Srpska","Brcko District"};
            return stateNames;
        }

        else if(countryName=="Montenegro"){
            String[] stateNames={"Podgorica","Niksic","Herceg Novi","Budva","Bar","Kotor","Bijelo Polje"};
            return stateNames;
        }

        else if(countryName=="North Macedonia"){
            String[] stateNames={"Skopje","Bitola","Kumanovo","Prilep","Tetovo","Ohrid","Strumica"};
            return stateNames;
        }

        else if(countryName=="Albania"){
            String[] stateNames={"Tirana","Durres","Vlore","Shkoder","Elbasan","Fier","Korçe"};
            return stateNames;
        }

        else if(countryName=="Lithuania"){
            String[] stateNames={"Vilnius","Kaunas","Klaipeda","Siauliai","Panevezys","Alytus","Marijampole"};
            return stateNames;
        }

        else if(countryName=="Latvia"){
            String[] stateNames={"Riga","Daugavpils","Liepaja","Jelgava","Jurmala","Ventspils","Rezekne"};
            return stateNames;
        }

        else if(countryName=="Estonia"){
            String[] stateNames={"Harju","Tartu","Ida-Viru","Parnu","Lääne-Viru","Viljandi","Saare"};
            return stateNames;
        }
		else if(countryName=="Cambodia"){
            String[] stateNames={"Phnom Penh","Siem Reap","Battambang","Kampong Cham","Kampot","Takeo","Prey Veng","Banteay Meanchey"};
            return stateNames;
        }

        else if(countryName=="Laos"){
            String[] stateNames={"Vientiane","Savannakhet","Champasak","Luang Prabang","Xieng Khouang","Oudomxay","Attapeu"};
            return stateNames;
        }

        else if(countryName=="Myanmar"){
            String[] stateNames={"Yangon","Mandalay","Bago","Shan","Kachin","Rakhine","Mon","Kayah","Kayen"};
            return stateNames;
        }

        else if(countryName=="Mongolia"){
            String[] stateNames={"Ulaanbaatar","Arkhangai","Bayan-Olgii","Bulgan","Darkhan-Uul","Dornod","Gobi-Altai"};
            return stateNames;
        }

        else if(countryName=="Kazakhstan"){
            String[] stateNames={"Almaty","Astana","Shymkent","Karaganda","Aktobe","Pavlodar","Kostanay"};
            return stateNames;
        }

        else if(countryName=="Uzbekistan"){
            String[] stateNames={"Tashkent","Samarkand","Bukhara","Andijan","Namangan","Fergana","Khorezm"};
            return stateNames;
        }

        else if(countryName=="Turkmenistan"){
            String[] stateNames={"Ashgabat","Ahal","Balkan","Dashoguz","Lebap","Mary"};
            return stateNames;
        }

        else if(countryName=="Kyrgyzstan"){
            String[] stateNames={"Bishkek","Osh","Chui","Issyk-Kul","Naryn","Talas","Batken"};
            return stateNames;
        }

        else if(countryName=="Tajikistan"){
            String[] stateNames={"Dushanbe","Sughd","Khatlon","Gorno-Badakhshan"};
            return stateNames;
        }

        else if(countryName=="Armenia"){
            String[] stateNames={"Yerevan","Shirak","Lori","Kotayk","Ararat","Tavush","Syunik"};
            return stateNames;
        }

        else if(countryName=="Azerbaijan"){
            String[] stateNames={"Baku","Ganja","Sumqayit","Lankaran","Shaki","Quba","Mingachevir"};
            return stateNames;
        }

        else if(countryName=="Georgia"){
            String[] stateNames={"Tbilisi","Adjara","Imereti","Kakheti","Kvemo Kartli","Samegrelo","Shida Kartli"};
            return stateNames;
        }

        else if(countryName=="Jordan"){
            String[] stateNames={"Amman","Irbid","Zarqa","Aqaba","Mafraq","Balqa","Karak"};
            return stateNames;
        }

        else if(countryName=="Lebanon"){
            String[] stateNames={"Beirut","Mount Lebanon","North","South","Bekaa","Nabatieh"};
            return stateNames;
        }

        else if(countryName=="Syria"){
            String[] stateNames={"Damascus","Aleppo","Homs","Hama","Latakia","Tartus","Raqqa","Deir ez-Zor"};
            return stateNames;
        }

        else if(countryName=="Yemen"){
            String[] stateNames={"Sanaa","Aden","Taiz","Hadhramaut","Ibb","Hodeidah","Marib"};
            return stateNames;
        }

        else if(countryName=="Libya"){
            String[] stateNames={"Tripoli","Benghazi","Misrata","Zawiya","Sabha","Sirte"};
            return stateNames;
        }

        else if(countryName=="Sudan"){
            String[] stateNames={"Khartoum","Gezira","Red Sea","White Nile","Blue Nile","Darfur","Kordofan"};
            return stateNames;
        }

        else if(countryName=="South Sudan"){
            String[] stateNames={"Juba","Central Equatoria","Eastern Equatoria","Western Equatoria","Upper Nile","Unity","Jonglei"};
            return stateNames;
        }

        else if(countryName=="Senegal"){
            String[] stateNames={"Dakar","Thiès","Saint-Louis","Kaolack","Ziguinchor","Tambacounda"};
            return stateNames;
        }

        else if(countryName=="Ivory Coast"){
            String[] stateNames={"Abidjan","Yamoussoukro","Bouake","Daloa","Korhogo","San Pedro"};
            return stateNames;
        }

        else if(countryName=="Cameroon"){
            String[] stateNames={"Yaounde","Douala","Littoral","Northwest","Southwest","Far North","Centre"};
            return stateNames;
        }

        else if(countryName=="Zimbabwe"){
            String[] stateNames={"Harare","Bulawayo","Manicaland","Mashonaland East","Mashonaland West","Masvingo","Midlands"};
            return stateNames;
        }

        else if(countryName=="Zambia"){
            String[] stateNames={"Lusaka","Copperbelt","Southern","Eastern","Western","Northern","Central"};
            return stateNames;
        }

        else if(countryName=="Tanzania"){
            String[] stateNames={"Dodoma","Dar es Salaam","Arusha","Mwanza","Mbeya","Morogoro","Tanga"};
            return stateNames;
        }
		else if(countryName=="Mozambique"){
            String[] stateNames={"Maputo","Sofala","Nampula","Zambezia","Tete","Gaza","Inhambane"};
            return stateNames;
        }

        else if(countryName=="Madagascar"){
            String[] stateNames={"Antananarivo","Toamasina","Fianarantsoa","Mahajanga","Toliara","Antsiranana"};
            return stateNames;
        }

        else if(countryName=="Angola"){
            String[] stateNames={"Luanda","Benguela","Huambo","Huila","Cabinda","Malanje","Uige"};
            return stateNames;
        }

        else if(countryName=="Namibia"){
            String[] stateNames={"Khomas","Erongo","Oshana","Oshikoto","Otjozondjupa","Kavango","Hardap"};
            return stateNames;
        }

        else if(countryName=="Botswana"){
            String[] stateNames={"Gaborone","Central","Kweneng","North-East","North-West","Southern","South-East"};
            return stateNames;
        }

        else if(countryName=="Malawi"){
            String[] stateNames={"Lilongwe","Blantyre","Mzuzu","Zomba","Kasungu","Mangochi","Salima"};
            return stateNames;
        }

        else if(countryName=="Rwanda"){
            String[] stateNames={"Kigali","Eastern","Western","Northern","Southern"};
            return stateNames;
        }

        else if(countryName=="Burundi"){
            String[] stateNames={"Gitega","Bujumbura","Ngozi","Rutana","Makamba","Kayanza","Kirundo"};
            return stateNames;
        }

        else if(countryName=="Somalia"){
            String[] stateNames={"Mogadishu","Puntland","Somaliland","Jubaland","Galmudug","Hirshabelle","South West"};
            return stateNames;
        }

        else if(countryName=="Eritrea"){
            String[] stateNames={"Asmara","Anseba","Debub","Gash-Barka","Maekel","Northern Red Sea","Southern Red Sea"};
            return stateNames;
        }

        else if(countryName=="Djibouti"){
            String[] stateNames={"Djibouti","Ali Sabieh","Dikhil","Tadjourah","Obock","Arta"};
            return stateNames;
        }

        else if(countryName=="Sierra Leone"){
            String[] stateNames={"Western Area","Northern","Eastern","Southern","North Western"};
            return stateNames;
        }

        else if(countryName=="Liberia"){
            String[] stateNames={"Monrovia","Bong","Nimba","Lofa","Grand Bassa","Margibi","Maryland"};
            return stateNames;
        }

        else if(countryName=="Guinea"){
            String[] stateNames={"Conakry","Kindia","Labe","Kankan","Nzerekore","Faranah","Boke"};
            return stateNames;
        }

        else if(countryName=="Guinea-Bissau"){
            String[] stateNames={"Bissau","Bafata","Gabu","Cacheu","Oio","Quinara","Tombali"};
            return stateNames;
        }

        else if(countryName=="Gabon"){
            String[] stateNames={"Libreville","Estuaire","Haut-Ogooue","Ogooue-Maritime","Ngounie","Nyanga","Woleu-Ntem"};
            return stateNames;
        }

        else if(countryName=="Republic of the Congo"){
            String[] stateNames={"Brazzaville","Pointe-Noire","Niari","Bouenza","Cuvette","Plateaux","Sangha"};
            return stateNames;
        }

        else if(countryName=="Democratic Republic of the Congo"){
            String[] stateNames={"Kinshasa","Katanga","Kivu","Kasai","Equateur","Bas-Congo","Orientale"};
            return stateNames;
        }

        else if(countryName=="Central African Republic"){
            String[] stateNames={"Bangui","Ombella-M'Poko","Ouaka","Nana-Mambere","Lobaye","Bamingui-Bangoran"};
            return stateNames;
        }

        else if(countryName=="Chad"){
            String[] stateNames={"N'Djamena","Logone Occidental","Mayo-Kebbi","Ouaddai","Salamat","Kanem"};
            return stateNames;
        }

        else if(countryName=="Niger"){
            String[] stateNames={"Niamey","Agadez","Diffa","Dosso","Maradi","Tahoua","Tillaberi","Zinder"};
            return stateNames;
        }

        else if(countryName=="Mali"){
            String[] stateNames={"Bamako","Kayes","Koulikoro","Sikasso","Segou","Mopti","Gao","Timbuktu"};
            return stateNames;
        }

        else if(countryName=="Burkina Faso"){
            String[] stateNames={"Ouagadougou","Bobo-Dioulasso","Kadiogo","Houet","Sanmatenga","Soum","Seno"};
            return stateNames;
        }

        else if(countryName=="Benin"){
            String[] stateNames={"Porto-Novo","Cotonou","Atlantique","Borgou","Mono","Zou","Oueme"};
            return stateNames;
        }

        else if(countryName=="Togo"){
            String[] stateNames={"Lome","Maritime","Plateaux","Centrale","Kara","Savanes"};
            return stateNames;
        }
		
		else if(countryName=="Mauritania"){
            String[] stateNames={"Nouakchott","Adrar","Assaba","Brakna","Gorgol","Guidimaka","Hodh Ech Chargui"};
            return stateNames;
        }

        else if(countryName=="Cape Verde"){
            String[] stateNames={"Praia","Sao Vicente","Santo Antao","Fogo","Sal","Boa Vista"};
            return stateNames;
        }

        else if(countryName=="Equatorial Guinea"){
            String[] stateNames={"Malabo","Bioko Norte","Bioko Sur","Centro Sur","Litoral","Wele-Nzas"};
            return stateNames;
        }

        else if(countryName=="Sao Tome and Principe"){
            String[] stateNames={"Sao Tome","Principe","Agua Grande","Lemba","Me-Zochi","Cantagalo"};
            return stateNames;
        }

        else if(countryName=="Lesotho"){
            String[] stateNames={"Maseru","Berea","Butha-Buthe","Leribe","Mafeteng","Mohale's Hoek","Qacha's Nek"};
            return stateNames;
        }

        else if(countryName=="Eswatini"){
            String[] stateNames={"Hhohho","Manzini","Shiselweni","Lubombo"};
            return stateNames;
        }

        else if(countryName=="Comoros"){
            String[] stateNames={"Grande Comore","Anjouan","Moheli"};
            return stateNames;
        }

        else if(countryName=="Seychelles"){
            String[] stateNames={"Mahe","Praslin","La Digue","Anse Boileau","Beau Vallon"};
            return stateNames;
        }

        else if(countryName=="Mauritius"){
            String[] stateNames={"Port Louis","Flacq","Moka","Pamplemousses","Plaines Wilhems","Riviere du Rempart"};
            return stateNames;
        }

        else if(countryName=="Gambia"){
            String[] stateNames={"Banjul","West Coast","North Bank","Lower River","Central River","Upper River"};
            return stateNames;
        }

        else if(countryName=="Suriname"){
            String[] stateNames={"Paramaribo","Nickerie","Wanica","Commewijne","Marowijne","Saramacca"};
            return stateNames;
        }

        else if(countryName=="Guyana"){
            String[] stateNames={"Georgetown","Barima-Waini","Cuyuni-Mazaruni","Demerara-Mahaica","East Berbice-Corentyne"};
            return stateNames;
        }

        else if(countryName=="Brunei"){
            String[] stateNames={"Brunei-Muara","Belait","Tutong","Temburong"};
            return stateNames;
        }

        else if(countryName=="Papua New Guinea"){
            String[] stateNames={"Port Moresby","Morobe","Madang","Eastern Highlands","Western Highlands","Oro"};
            return stateNames;
        }

        else if(countryName=="Fiji"){
            String[] stateNames={"Central","Western","Northern","Eastern","Rotuma"};
            return stateNames;
        }

        else if(countryName=="Solomon Islands"){
            String[] stateNames={"Honiara","Malaita","Western","Guadalcanal","Makira-Ulawa"};
            return stateNames;
        }

        else if(countryName=="Vanuatu"){
            String[] stateNames={"Port Vila","Sanma","Malampa","Shefa","Tafea","Penama"};
            return stateNames;
        }

        else if(countryName=="Samoa"){
            String[] stateNames={"Apia","Tuamasaga","Palauli","Satupaitea","Aiga-i-le-Tai"};
            return stateNames;
        }

        else if(countryName=="Tonga"){
            String[] stateNames={"Tongatapu","Vava'u","Ha'apai","Eua","Niuas"};
            return stateNames;
        }

        else if(countryName=="Kiribati"){
            String[] stateNames={"Tarawa","Gilbert Islands","Line Islands","Phoenix Islands"};
            return stateNames;
        }

        else if(countryName=="Micronesia"){
            String[] stateNames={"Yap","Chuuk","Pohnpei","Kosrae"};
            return stateNames;
        }

        else if(countryName=="Palau"){
            String[] stateNames={"Ngerulmud","Koror","Melekeok","Airai","Ngardmau"};
            return stateNames;
        }

        else if(countryName=="Marshall Islands"){
            String[] stateNames={"Majuro","Ebeye","Arno","Jaluit","Wotje"};
            return stateNames;
        }

        else if(countryName=="Malta"){
            String[] stateNames={"Valletta","Birkirkara","Sliema","Qormi","Mosta"};
            return stateNames;
        }

        else if(countryName=="Cyprus"){
            String[] stateNames={"Nicosia","Limassol","Larnaca","Famagusta","Paphos"};
            return stateNames;
        }
		
		else if(countryName=="Andorra"){
            String[] stateNames={"Andorra la Vella","Escaldes-Engordany","Encamp","La Massana","Ordino","Sant Julia de Loria","Canillo"};
            return stateNames;
        }

        else if(countryName=="Monaco"){
            String[] stateNames={"Monaco-Ville","Monte Carlo","La Condamine","Fontvieille"};
            return stateNames;
        }

        else if(countryName=="Liechtenstein"){
            String[] stateNames={"Vaduz","Schaan","Balzers","Triesen","Eschen","Mauren","Ruggell"};
            return stateNames;
        }

        else if(countryName=="San Marino"){
            String[] stateNames={"San Marino","Serravalle","Borgo Maggiore","Domagnano","Fiorentino","Acquaviva","Chiesanuova"};
            return stateNames;
        }

        else if(countryName=="Vatican City"){
            String[] stateNames={"Vatican City"};
            return stateNames;
        }

        else if(countryName=="Timor-Leste"){
            String[] stateNames={"Dili","Baucau","Bobonaro","Ermera","Liquica","Manufahi","Viqueque"};
            return stateNames;
        }

        else if(countryName=="Bahamas"){
            String[] stateNames={"New Providence","Grand Bahama","Abaco","Andros","Exuma","Eleuthera"};
            return stateNames;
        }

        else if(countryName=="Barbados"){
            String[] stateNames={"Saint Michael","Christ Church","Saint James","Saint Peter","Saint Lucy","Saint George"};
            return stateNames;
        }

        else if(countryName=="Trinidad and Tobago"){
            String[] stateNames={"Port of Spain","San Fernando","Chaguanas","Tobago","Arima","Point Fortin"};
            return stateNames;
        }

        else if(countryName=="Grenada"){
            String[] stateNames={"Saint George","Saint Andrew","Saint David","Saint Patrick","Carriacou"};
            return stateNames;
        }

        else if(countryName=="Saint Lucia"){
            String[] stateNames={"Castries","Vieux Fort","Soufriere","Dennery","Gros Islet"};
            return stateNames;
        }

        else if(countryName=="Saint Vincent and the Grenadines"){
            String[] stateNames={"Kingstown","Charlotte","Saint Andrew","Saint David","Grenadines"};
            return stateNames;
        }

        else if(countryName=="Antigua and Barbuda"){
            String[] stateNames={"Saint John","Saint Mary","Saint Paul","Saint Peter","Barbuda"};
            return stateNames;
        }

        else if(countryName=="Dominica"){
            String[] stateNames={"Roseau","Saint George","Saint Andrew","Saint David","Saint Patrick"};
            return stateNames;
        }

        else if(countryName=="Saint Kitts and Nevis"){
            String[] stateNames={"Basseterre","Saint George","Saint John","Saint Mary","Nevis"};
            return stateNames;
        }

        else if(countryName=="Belize"){
            String[] stateNames={"Belmopan","Belize","Cayo","Orange Walk","Corozal","Stann Creek","Toledo"};
            return stateNames;
        }

        else if(countryName=="Western Sahara"){
            String[] stateNames={"Laayoune","Dakhla","Smara","Boujdour"};
            return stateNames;
        }

        else if(countryName=="Kosovo"){
            String[] stateNames={"Pristina","Prizren","Peja","Gjakova","Mitrovica","Ferizaj"};
            return stateNames;
        }

        else if(countryName=="Taiwan"){
            String[] stateNames={"Taipei","New Taipei","Taichung","Tainan","Kaohsiung","Hsinchu"};
            return stateNames;
        }

        else if(countryName=="Palestine"){
            String[] stateNames={"Jerusalem","Gaza","Ramallah","Hebron","Nablus","Bethlehem"};
            return stateNames;
        }
		else{
			System.out.println("U have wrongly typed country name . Check Once.....");
		}
		return null;
		
	}
		
		
		public static void getStates(String[] stateNames){
	
	         for(String stateName:stateNames){
		       System.out.println(stateName);
			 }
		}
	




        
    
}