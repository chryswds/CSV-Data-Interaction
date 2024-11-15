package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Provided CSV data
        String csvData = """
            1,Parsifal,Lefeaver,plefeaver0@scribd.com
            2,Ryley,Overshott,rovershott1@washington.edu
            3,Micheline,Rickford,mrickford2@delicious.com
            4,Massimo,Gove,mgove3@t.co
            5,Yance,Blasoni,yblasoni4@paypal.com
            6,Britte,MacCollom,bmaccollom5@google.cn
            7,Amalita,Fransemai,afransemai6@msn.com
            8,Daniel,Height,dheight7@cafepress.com
            9,Nickolaus,Poore,npoore8@1688.com
            10,Brittni,Fehners,bfehners9@newyorker.com
            11,Sullivan,Tipens,stipensa@google.com.au
            12,Julie,Bachelar,jbachelarb@cisco.com
            13,Ninetta,Jeannin,njeanninc@dell.com
            14,Blakelee,Dabney,bdabneyd@foxnews.com
            15,Ansell,Tomblett,atomblette@state.tx.us
            16,Elianore,Unwin,eunwinf@cisco.com
            17,Pate,Chick,pchickg@hud.gov
            18,Hunter,Dooland,hdoolandh@indiatimes.com
            19,Kristos,Letford,kletfordi@github.com
            20,Moira,Sindall,msindallj@ebay.com
            21,Alexei,Rome,aromek@china.com.cn
            22,Sibel,Dreschler,sdreschlerl@opensource.org
            23,Thorny,Thrussell,tthrussellm@wsj.com
            24,Dasie,Withrop,dwithropn@chicagotribune.com
            25,Vasily,Kenneford,vkennefordo@is.gd
            26,Harrietta,Leneham,hlenehamp@discovery.com
            27,Orland,Tiffney,otiffneyq@nbcnews.com
            28,Joellyn,Cogdon,jcogdonr@mashable.com
            29,Maddie,Chandler,mchandlers@spiegel.de
            30,Jack,Rawcliff,jrawclifft@de.vu
            31,Francisco,Krop,fkropu@nationalgeographic.com
            32,Burgess,Hankard,bhankardv@unesco.org
            33,Kynthia,Tierny,ktiernyw@privacy.gov.au
            34,Allis,Kira,akirax@phoca.cz
            35,Mara,Berecloth,mbereclothy@bbc.co.uk
            36,Kenneth,Ribbens,kribbensz@oaic.gov.au
            37,Neila,Morling,nmorling10@msn.com
            38,Gale,Hurlestone,ghurlestone11@forbes.com
            39,Rutter,Royste,rroyste12@360.cn
            40,Antonella,Bragginton,abragginton13@alexa.com
            41,Victoir,Whitebrook,vwhitebrook14@europa.eu
            42,Suzanne,Lux,slux15@psu.edu
            43,Deirdre,Fenelow,dfenelow16@photobucket.com
            44,Bethanne,Ridge,bridge17@instagram.com
            45,Sharron,Schustl,sschustl18@wikipedia.org
            46,Bobinette,Marion,bmarion19@apple.com
            47,Witty,Sherland,wsherland1a@elpais.com
            48,Sayer,Gatheridge,sgatheridge1b@shareasale.com
            49,Curry,Le Breton,clebreton1c@ucla.edu
            50,Symon,Aspray,saspray1d@google.es
            51,Lona,Paolozzi,lpaolozzi1e@jiathis.com
            52,Wallache,Kimbling,wkimbling1f@yahoo.co.jp
            53,Megen,Benoi,mbenoi1g@slashdot.org
            54,Mariellen,Grealey,mgrealey1h@posterous.com
            55,Fred,McCome,fmccome1i@diigo.com
            56,Davon,Johnikin,djohnikin1j@latimes.com
            57,Herman,Bratt,hbratt1k@time.com
            58,Shanon,Figgess,sfiggess1l@mlb.com
            59,Marianne,Symones,msymones1m@foxnews.com
            60,Paulie,Ashbridge,pashbridge1n@hibu.com
            61,Dominica,Barensky,dbarensky1o@webs.com
            62,Warden,Kleinhaus,wkleinhaus1p@technorati.com
            63,Ev,Wieprecht,ewieprecht1q@deviantart.com
            64,Clemmie,Phillis,cphillis1r@toplist.cz
            65,Bernice,Thorndale,bthorndale1s@opera.com
            66,Andriana,Delamaine,adelamaine1t@exblog.jp
            67,Bartolemo,Penhalewick,bpenhalewick1u@webeden.co.uk
            68,Nikola,Gartsyde,ngartsyde1v@free.fr
            69,Derick,Bockmaster,dbockmaster1w@mail.ru
            70,Colby,Reddihough,creddihough1x@pbs.org
            71,Phylis,Biford,pbiford1y@chronoengine.com
            72,Averyl,Shory,ashory1z@sakura.ne.jp
            73,Dorelle,Wooding,dwooding20@netlog.com
            74,Phillip,Bleas,pbleas21@hud.gov
            75,Marie-jeanne,Tejada,mtejada22@gravatar.com
            76,Cointon,d' Eye,cdeye23@mtv.com
            77,Rutledge,Van de Vlies,rvandevlies24@desdev.cn
            78,Susette,Titterington,stitterington25@godaddy.com
            79,Aveline,Plum,aplum26@comsenz.com
            80,Bev,Beccera,bbeccera27@psu.edu
            81,Frasco,Heinig,fheinig28@twitpic.com
            82,Isabeau,Eltone,ieltone29@weibo.com
            83,Rasla,Ramelot,rramelot2a@latimes.com
            84,Chaunce,Koppel,ckoppel2b@seesaa.net
            85,Karla,Mawson,kmawson2c@google.ru
            86,Gene,Passman,gpassman2d@wsj.com
            87,Bonni,Marking,bmarking2e@soundcloud.com
            88,Jocelyn,Surmeyer,jsurmeyer2f@comsenz.com
            89,Dolores,Giacoboni,dgiacoboni2g@noaa.gov
            90,Earle,Filkin,efilkin2h@bloglovin.com
            91,Hildegaard,Saffle,hsaffle2i@usgs.gov
            92,Clara,Lowings,clowings2j@icq.com
            93,Janis,Ridulfo,jridulfo2k@live.com
            94,Billie,Lightollers,blightollers2l@amazon.co.jp
            95,Lyn,Planque,lplanque2m@rambler.ru
            96,Rorie,De Filippis,rdefilippis2n@joomla.org
            97,Sheilah,Levi,slevi2o@csmonitor.com
            98,Marja,Tremmel,mtremmel2p@netlog.com
            99,Penny,Lory,plory2q@stanford.edu
            100,Jami,Clowser,jclowser2r@wix.com
        """;

        // Initialise a list to store person data from the CSV
        List<String[]> people = new ArrayList<>();

        // Split CSV data by lines and process each line
        String[] csvLines = csvData.split("\n");
        for (String line : csvLines) {
            // Split each line by commas
            String[] personInfo = line.trim().split(",");

            //If length == 4 (ID, First name, Last name, email) add this info to the array
            if (personInfo.length == 4) {
                people.add(personInfo);
            }
        }

        // Shuffle the list of people
        Collections.shuffle(people);


        // Define the number of teams and players per team
        int numTeams = 20;
        int teamPlayers = 5;

        // array of team names - OBS: ASKED CHATGPT TO CREATE 20 RANDOM TEAM NAMES
        String[] teamNames = {
                "The Thunderbolts", "The Black Panthers", "The Storm Chasers", "The Firehawks", "The Night Owls",
                "The Silver Serpents", "The Galactic Guardians", "The Red Dragons", "The Golden Eagles", "The Ice Titans",
                "The Electric Sharks", "The Wild Wolves", "The Crimson Kings", "The Mystic Falcons", "The Savage Tigers",
                "The Phoenix Force", "The Steel Titans", "The Viper Squadron", "The Alpha Wolves", "The Dark Knights"
        };


        //Arraylist that stores team and players per team
        ArrayList<String> teams = new ArrayList<>();

        //Iterates though the number of teams (20) to create each team
        for (int i = 0; i < numTeams; i++) {
            //adds team number and name
            teams.add("Team " + (i + 1) + " : " + teamNames[i]);
            for (int j = 0; j < teamPlayers; j++) {
                // remove and get the first person from the list of people
                String[] player = people.removeFirst();
                //The way player info will be displayed
                String playerInfo = "ID: " + player[0] + ", Name: " + player[1] + " " + player[2] + ", Email: " + player[3];
                teams.add(playerInfo);
            }
            //blank line between teams
            teams.add("");
        }

        //Print all information stored in the arraylist teams
        for (String info : teams) {
            System.out.println(info);
        }
    }
}




