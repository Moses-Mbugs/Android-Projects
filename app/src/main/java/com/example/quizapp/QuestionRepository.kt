package com.example.quizapp

object QuestionRepository {
    val categories = mapOf(
        "Political" to listOf(
            Question(
                "The price of fuel hikes AGAIN. The ungrateful country is complaining huko on a social media APP. What do you do?",
                listOf("listen to them and try and find solutions.",
                    "Kwani is it your fault? You tell them if they feel they can't 'fikisha bei'  they can just go dig their own wells"),
                1
            ),

            Question(
                "Your husband ndio kusema but people don't seem to respect you. How do you command respect?",
                listOf("Resolve domestic issues at home. Why are we dragging a whole nation into your issues?",
                    "Get your husband to call for a press conference and make him declare his undying love in public."),
                2
            ),

            Question(
                "You are a staunch, tongue speak christian and you believe ni maombi that has gotten you where you are, which is a sit at the high " +
                        "table but enyewe you don't understand why a whole nation doesn't gerrit that you can just pray inflations and high taxes away. So you...",
                listOf("Decide to hold prayer meetings, invite numerous pastors at a government owned institution and even try to get one of those Mega church" +
                        " American Pastors to pray the spirit of disgruntle tax payers away",
                    "Find solutions within instead of playing with people's minds"), 1
            ),

            Question(
                "You used to hang out hapo kwa bypass ukikula nyama and one drink as you talk about hustling. kung'ang'ana and how bad the economy. " +
                        "kidogo kidogo kama mchezo you are now working for the government. what would you do?",
                listOf("Serve the people diligently and honestly.",
                    "Walala! Hizi tender I wasn't being awarded sasa ndio nitazikula. I will ask for kickbacks hapa pale and inflate the price of say wheelbarrows" +
                            " to 109,320 from 5000 shillings. "), 1
            ),

            Question(
                "You've got the perfect strategy, it's the bottoms up approach. You get many wananchi's excited because they finally see that 'it's all our time " +
                        "to eat'. Now you've been voted in. what will you do?",
                listOf("Increase taxes, even though salaries are not increasing, organizations are making as much money and the lack of jobs situation is at an all time high." +
                        " Si lazima serikali ipate pesa ama namna gani?",
                "Listen to the people and look for solutions of reducing the cost of living"), 1
            ),

            Question(
                "You are on live television. You say that the price of cooking oil has gone down but the Tv station has actually done its homework and found" +
                        " out that the price of cooking oil has not changed. what is your next statement?",
                listOf("Sema tu sorry and help find solutions",
                    "Deny and even continue to say that they should go to a particular place of the country to check the prices"),
                1
            ),

            Question(
                "Wananchi is complaining about the high cost of living. ",
                listOf("Empathisize, listen and resolve",
                    "Blame current government, speak ignorantly to the suffering watu's and then refuse to apologize."),
                1
            ),

            Question(
                "You go to a foreign country to represent your country. in your speech you include tigers as an animal" +
                        " found in Kenya. How do you redeem yourself",
                listOf("Blame your mother tongue for the error",
                    "Accept it was a mistake and visit more parks to find out more about the animals in your country"),
                1
            ),

            Question(
                "The economy ni ngumu. You are a leader in the government thats over taxing it's citizens. You address the people. what do you say?",
                listOf("\"I regret siring two children...I urge you to sire at least 7 per couple. God will provide for you\" ",
                    "Find solutions to ease the tax burden"), 1
            ),

            Question(
                "The media has huko dug up some information, it's making things at home very uncomfortable. The Mrs is pissed...It doesn't matter" +
                        " if you lead 40 million people. How do you make things easy on you?",
                listOf("Deal with your home matters at home and live rest of us 40 million out of your business.",
                    "Come on National television and declare you only have one wife as your wife stands next to you ready to pounce on anyone that " +
                            "isn't willing to tow the line"), 1
            ),

//10 questions

            Question(
                "During the campaigns you promised the Primary Toi's that they'll get Laptops. Now you are in power and want to stand on business what do you do?",
                listOf("Do the due dilligence of getting the right person to produce the laptops and award them the tender to ensure children get quality products as promised.",
                    "Produce the laptops using an organization tied to you and fake tenders so that it is believed to have been given to someone else."),
                1
            ),

            Question(
                "You work for the Kenya power  company in your country. You notice theres a tender opportunity for transformers what will you do?",
                listOf("Look for the best people that can produce good transformers",
                    "Get the cheapest and fake transformers at an affordable price then pocket the rest of the  money"),
                1
            ),

            Question(
                "You work at the ministry of land, your government just recently started the process of building a Railway. You are tasked with buying land " +
                        "from the people who were owning land where the railway would pass what would you do?",
                listOf("Do an audit of the people owning lands in the areas where the railway will pass and buy lands from them as instructed.",
                    "Buy land from the people owning land around and also purchase land that is already owned by the railway commission inorder to get money for yourself also"),
                1
            ),

            Question(
                "There's a Youth Empowerment programme in your country and good money like really good money has been allocated for the program.You are a state official" +
                        " tasked with ensuring this programme is successful what will you do?",
                listOf("Work closely with officals to ensure the money is put to good use. ",
                    "Stash the money in bags and gunias ata wewe pia uko na tumbo, kwani!"), 1
            ),

            Question(
                "You are one of the officials at the National Irrigation board, the goverment just flagged a multi billion food " +
                        "security programme, what will you do?",
                listOf("Work for the people to ensure theres food security for those in starvation prone areas",
                    "Collaborate with other officials and steal part of the money,the government never follows these things " +
                            "ata and you need to secure that kaploti anyway!"), 1
            ),

            Question(
                "The elections are coming up and you work at the electoral Board organization. You are tasked with the responsibility of " +
                        "giving tenders to organizations that will print ballot papers,  what will you do?",
                listOf("Do your research and go through tender applications to give it to the deserving person",
                    "Take bribes from a foreign organization and award them the tender "), 1
            ),

            Question(
                "You own a hotel at a prime place but there's one thing, The Hotel doesn't have a proper parking." +
                        " You remember you are an official with power what do you do?",
                listOf("aaah si theres a certain public school with a huge play ground just next here, I'll just take it and turn it to a parking lot and " +
                        "if they resist I'll just ensure the police use maximum force even if they are just children",
                    "Find alternative solution that will ensure my guests are satisfied so are my neighbors."),
                1
            ),

            Question(
                "You are a minister and there's a certain land in the forest that people seem to not care about what do you do?",
                listOf("You are a minister and there's a certain land in the forest that people seem to not care about what do you do?",
                    " Leave it alone and pitch ideas to the govrnment on how best the land can be utilised."),
                1
            ),

            Question(
                "You are finally the Agriculture Minister! What will you do?",
                listOf("Work diligently for the people of my country to ensure the agriculture sector is at its peak",
                    "Ask the cereal board to allocate me 1000 bags of maize"), 1
            ),

            Question(
                "A pandemic has just hit the world and the gorvernment has just allocated billions and tasked the organization you work for as a senior  " +
                        "officer with giving tenders to  supply medical supplies. what will you do?",
                listOf("Give the 300 billion tender who walk into the building and says she has the supplies without following the proper channel for tender allocation",
                    "follow the procedure and give the tender to the most suitable organization."),
                1
            ),

//20 questions

            Question(
                "You are a county official and purchase of wheelbarrows is needed what will you do?",
                listOf("Collaborate with fellow officals and purchase wheelbarrows at an exaggerated price of KSH109,000 each",
                    "Work with my team to purchase the best wheelbarrows at an affordable and reasonable price."),
                1
            ),

            Question(
                "You have victims who suffered from Elnino. The government allocates 5 billion to help the victims get back on their " +
                        "feet as a county official what will you do?",
                listOf("Serve diligently and ensure those in need of the money get the help they deserve",
                    "Taking kidogo money for myself and my colleagues doesn't sound like a bad idea. That money is a lot"),
                1
            ),

            Question(
                "You are a governor and promise parents you'll help their children get scholarships to study abroad. The parents have " +
                        "put their resources together and are ready to send their children to study what will you do?",
                listOf("Ati take other peoples children abroad i'll take some and then ensure I take my Kids and the children in my extended family.",
                    "Gather the resources the parents have gathered and see to it that every student whose parent participated has gone to further their studies."),
                1
            ),

            Question(
                "You are a tourism state official and have heard that over 15 billion has been allocated to build a college what will you do?",
                listOf("Ensure the tourism college  is build as was planned",
                    "Work with my team and ensure we inflate the prices so that we can pocket some money"),
                1
            ),

            Question(
                "You are a supply chain manager at the ministry of transport and tenders are approved by you? what will you do?",
                listOf("follow the right procedure of awardeing tenders and ensure the tenders are given to qualified personnels",
                    "Ensure the tenders are given to my organzation and the organizations belonging to my family members so that Ican have over 200 million to myself"),
                1
            ),

            Question(
                "You work with the ministry of health, to ensure taxpayers money is used to ensure they get quality treatment. what will you do?",
                listOf("Work with my team to steal 5 billion and deny claims of misappropriation of money as they wont have evidence",
                    "Ensure taxpayers money is used accordingly and can be accounted for to the last coin"),
                1
            ),

            Question(
                "You are finally an offical of the state and are required to visit neighbouring countries to support your cause at the international criminal court, what will you do?",
                listOf("Come up with a reasonable budget and use an alternative affordable means of transport to carry out my duties",
                    "Get a private jet worth 100 million and use millions of tax payers money to cater for my accomodation and that of my escorts"),
                1
            ),

            Question(
                "The government has taken on a foreign loan to fund major development projects. As a state official what will you do?",
                listOf("Work with my fellow team members to ensure we take out 215 billion, tutaambia watu it can't be accounted for and claim we used the money on infrastructure",
                    "Use the money to develop the country and make life expenses affordable for our citizens"),
                1
            ),

            Question(
                "You own aN NGO and finally landed a seat as the gorvenor to one of the big cities in your country. what will you do?",
                listOf("Let my NGO operate on its own and work for my count people diligently",
                    "Put some of the county money into the NGO account for rainy days when I retire"),
                1
            ),

            Question(
                "You are a top government official the gorventment has just allocated over 19 billion to fund the construction of two dams. What will you do?",
                listOf("Use the money and then lie about paying for goods and services ahead of the construction time to ensure smooth operations lakini wapi? ",
                    "Use the money to build the dam as was promised to the citizens of the country"),
                1
            ),

//30 questions

        ),
        "On the Road" to listOf(
            Question("You are driving a BMW X5 2022 edition. A Chapchap passes you fast. What do you do?",
                listOf("Shake your head and continue listening to your music",
                    "Accelerate and show them who is the king of the road"),1),

            Question(
                "A nduthi cuts you on the road. What will you do?",
                listOf("let the road rage burn. Chase him, Open your window and shout at him",
                    "Quietly be disgruntled by the Nduthi guy's lack of road safety and etiquette"),
                1
            ),

            Question(
                "You are a pedestrian, You need to catch a matatu on the other side of the road before it leaves you because if it does you will have to wait for a while to get the next one. What do you do",
                listOf("Run to the other side of the road as fast as you can. After all you are a Kenyan and Kenyans are known to be runners plus you've made your calculations and " +
                        "know that you will make it before oncoming traffic gets to you.",
                    "Wait for oncoming traffic to ease after all the matatus are plenty "), 1
            ),

            Question(
                "You are in CBD, You want to cross the road but that story with your BFF has shikad. You look left and right, there is no car coming. What do you do?",
                listOf("Continue with that juicy story",
                    "hang up and call when you cross the road"), 1
            ),
            Question(
                "You just came from the salon, You need to get to your date as fast as possible so you take a nduthi. The guy gives you a helmet, what do you do?",
                listOf("Geez! First of all that helmet stinks, secondly I don't know how many people have been in it. Thirdly, " +
                        "I didn't spend all that money to make my hair to mess my look with a helmet so no thank you I will pass on the helmet",
                    "be grugingly take that helmet and hope that you can restore your hair to its glory once you remove the helmet"),
                1
            ),

            Question(
                "You didn't carry your driving licence (bummer) a cop stops you. He is rather annoying seems like he just wants to frustrate you into bribing him. What do you do?",
                listOf("Aaaargh! These Kenyan cops. Just give him that 1k in your pocket and ask him to let go of you. After all who wants to spend a whole day at the courts waiting to be fined?",
                    "\"Sawa, tuende!\" You decide to follow the rules and follow him to the station."),
                1
            ),

            Question(
                "That person you met at the club jana is calling you. You were attracted to them and your extremely happy that they called you. However you are driving. What do you do?",
                listOf("I am careful always, I will pick up the all and keep it short anyway. After all there is traffic and we are going at 20KPH, what could possibly go wrong?",
                    "Hold your excitement until you safely park your car."), 1
            ),

            Question(
                "Kama kupanda ni popote then why is kushuka ni stage? Hoenestly I am too tired and this mat is insisting on dropping me at the stage. As a true Kenyan what should you do?",
                listOf("Cause chaos in the Matatu and demand that they drop you at your convinience after all kuna jam",
                    "Sit and wait to get to the designated bus stop"), 1
            ),

            Question(
                "Traffic lights are suggestions in Kenya. The guy behind you is hooting at you to skip the lights and keep it moving. What do you do?",
                listOf("Keep it moving, driving is an extreme sport in Kenya so where's the excitement if I can't jump the lights",
                    "Sit there and ignore the guy until the lights turn green."), 1
            ),

            Question(
                "Your friends are waiting for you in Vasha. They wekelead some nyama on the grill and it would be " +
                        "a pity if the meat got cold because you couldn't reach there on time. The roads are clear and your German machine can rocket you to Vasha in less than an hour. So, what would you do?",
                listOf("I can weave in and out of traffic plus I have a pretty fast car. ",
                    "I can microwave the meat when I get there."), 1
            ),

            Question(
                "Atleast at this time of the month the do not have alcoblow on our roads so if I leave the club a little drunk I should be able to get home soon. So...",
                listOf("I get into my car and drive home. After all si gari inajua njia? ",
                    "Get an uber or have a designated driver to take us home"), 1
            ),

//            Question("",
//                listOf("",
//                    ""),1,
//                ""),
//
//            Question("",
//                listOf("",
//                    ""),1,
//                ""),

        )
    )
}








//Question("",
//listOf("",
//""),1),
//
//Question("",
//listOf("",
//""),1),
//
//Question("",
//listOf("",
//""),1),