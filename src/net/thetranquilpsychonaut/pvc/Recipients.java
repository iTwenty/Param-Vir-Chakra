package net.thetranquilpsychonaut.pvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by itwenty on 1/5/14.
 * This class is the primary data source of the application.
 * All the PVCRecipients and ArrayLists used throughout the app have a static declaration here.
 */
public class Recipients
{
    /**
     *  This ArrayList gets modified whenever a user initiates a search
     */
    public static       ArrayList<PVCRecipient> mutableRecipientsList   = new ArrayList<PVCRecipient>();
    /**
     * This ArrayList remains immutable throughout the app life cycle.
     */
    public static final ArrayList<PVCRecipient> immutableRecipientsList = new ArrayList<PVCRecipient>();

    // Now follows the declaration of each individual PVCRecipient
    static PVCRecipient one = new PVCRecipient(
        "Major", // Rank
        "Som Nath Sharma", // Name
        "IC-521", // Award Number
        "4th Battalion, Kumaon Regiment", //Regiment
        new GregorianCalendar( 1947, Calendar.NOVEMBER, 3 ), //Award Date
        "Badgam, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1923, Calendar.JANUARY, 31 ), // Birth Date
        new GregorianCalendar( 1947, Calendar.NOVEMBER, 3 ), // Death Date
        "Dadh, Kangra, Himachal Pradesh", // Birth Place
        "On 3rd. November 1947 Maj. Sharma's Coy was ordered on a fighting patrol to Badgam Village in Srinagar (Kashmir) Valley. He reached his objective at first light on 3rd. November, 1947, and took up a position south of Badgam Village. At 1100 hours, enemy estimated strength 700 attacked his Coy position being brought to bear on the Coy position from three sides, the Coy began to sustain heavy casualties.\n" +
            "\n" +
            "Maj. Sharma fully realizing the gravity of the situation and the direct threat that would result to both Srinagar and the aerodrome if the enemy attacking him was not held until reinforcements could be rushed up to close up the gap leading to Srinagar via Hum Hom, urged his Coy to fight the enemy - tenaciously with extreme bravery. In order to do this, he rushed across the open ground to his sections exposing himself to heavy and active fire.\n" +
            "\n" +
            "He took a very active part in directing the fire of his sections on to the ever-advancing enemy. He exposed himself to the full fury of the enemy's fire and laid out air-strips in order to guide the aircraft on to the targets in full view of the enemy.\n" +
            "\n" +
            "Realising that casualties had affected the efficiency of his light automatics, this officer, whose right hand was in plaster, personally commenced filling LMG magazines and issuing them to LMG gunners. A mortar shell landing amongst his ammunition resulted in an explosion that killed him.\n" +
            "\n" +
            "Maj. Sharma's Coy held on to its position and the remnants withdrew when almost completely surrounded. His inspiring example had resulted in the enemy being delayed for six hours and reinforcements permitted to get into position in Hum Hom to stem the tide of the enemy's advance.\n" +
            "\n" +
            "His leadership, gallantry and tenacious defence was such that his men were inspired to fight the enemy outnumbered by them seven to one for six hours, one hour of which was after this gallant officer had been killed.\n" +
            "\n" +
            "He has set an example of courage, with qualities unequalled in the history of the Indian Army. His last message to Brigade HQ received a few moments before he was killed was \"The enemy are only 50 yards from us. We are heavily outnumbered. We are under devastating fire. I shall not withdraw an inch but will fight to the last man and the last round.",
        R.drawable.major_somnath_sharma // Image
    );

    static PVCRecipient two = new PVCRecipient(
        "Lance Naik", // Rank
        "Karam Singh", // Name
        "IC-22356", // Award Number
        "1st Battalion, Sikh Regiment", // Regiment
        new GregorianCalendar( 1948, Calendar.OCTOBER, 13 ), // Award Date
        "Tithwal, Kashmir", // Award Place
        Boolean.FALSE, // Posthumous?
        new GregorianCalendar( 1915, Calendar.SEPTEMBER, 15 ), // Birth Date
        new GregorianCalendar( 1993, Calendar.JANUARY, 20 ), // Death Date
        "Barnala, Punjab", // Birth Place
        "Tithwal in Jammu and Kashmir was captured on 23 May 1948. After that date, the enemy made numerous attempts to recapture Richmar Gali, and thence Tithwal. On 13 October 1948, coinciding with Id, the enemy decided to launch a brigade attack to retake Richmar Gali, and bypassing Tithwal, advance into the Srinagar Valley . Lance Naik Karam Singh was commanding a section at Richmar Gali.\n" +
            "\n" +
            "The enemy commenced its attack with heavy shelling of guns and mortars. The fire was so accurate that not a single bunker in the platoon locality was left unscathed.\n" +
            "\n" +
            "Communication trenches caved in. Bravely, Lance Naik karam Singh went from bunker to bunker, giving succor to the wounded and urging the men to fight.\n" +
            "\n" +
            "The enemy launched eight separate attacks that day. In one such attack, the enemy managed to obtain a foothold in the platoon locality. Immediately, Lance Naik Karam Singh, who was severely wounded by then, with a few men, hurled himself in a counter-attack and evicted the enemy after a close quarter encounter which accounted for many enemy dead, having been dispatched by the bayonet.\n" +
            "\n" +
            "Lance Naik Karam Singh proved himself to be a dauntless leader of men in crisis. Nothing could subdue him and no amount of fire or hardship could break his spirit.",
        R.drawable.lance_naik_karam_singh // Image
    );

    static PVCRecipient three = new PVCRecipient(
        "2nd Lieutenant", // Rank
        "Rama Raghoba Rane", // Name
        "SS-14246", // Award Number
        "Corps of Engineers", //Regiment
        new GregorianCalendar( 1948, Calendar.APRIL, 8 ), //Award Date
        "Naushera, Kashmir", // Award Place
        Boolean.FALSE, // Posthumous?
        new GregorianCalendar( 1918, Calendar.JUNE, 26 ), // Birth Date
        new GregorianCalendar( 1994, Calendar.JULY, 11 ), // Death Date
        "Chendia, Karwar, Karnataka", // Birth Place
        "On 8 April 1948, Second Lieutenant Rama Raghoba Rane, Bombay Engineers, was ordered to be in charge of the mine and roadblock clearing party at Mile 26 on the Naushera-Rajouri road which passes through very hilly country.\n" +
            "\n" +
            "At 1100 hours, on that date near Nadpur South, just as Second Lieutenant Rane and his party were waiting near the tanks to start the work of clearing the mines ahead, the enemy started heavy mortaring on the area, with the result that two men of the mine-clearing party were killed and five others including Second Lieutenant Rane were wounded. The officer at once reorganized his party and started work for the tanks to go on to their position. Throughout the day he was near the tanks under heavy enemy machine-gun and mortar fire.\n" +
            "\n" +
            "After the capture of Barwali Ridge at about 1630 hours, although knowing that the enemy had not been completely cleared of the area, Second Lieutenant Rane took his party ahead and started making a diversion for the tanks to proceed. He worked on till 2200 hours that night in full view of the enemy and under heavy machine-gun fire.\n" +
            "\n" +
            "On 9 April he again started work at 0600 hours and worked on till 1500hrs when the diversion was ready for the tanks to proceed. As the armoured column advanced, he got into the leading carrier and proceeded ahead. After proceeding about half a mile he came across a roadblock made of pine trees. He at once dismounted and blasted the trees away. The advance continued. Another 300 yards and the same story was repeated. By this time it was getting on to 1700 hours. The road was curving round the hill like a snake. The next roadblock was a demolished culvert. Second Lieutenant Rane again got on with the job. Before he could start work, the enemy opened up with their machine-guns, but with super courage and leadership he made a diversion and the column proceeded ahead. The roadblocks were becoming numerous but he blasted his way through. It was now 1815 hours, and light was fading fast. The carrier came across a formidable roadblock of five big pine trees surrounded by mines and covered by machine-gun fire. He started removing the mines and was determined to clear the roadblock but the armoured column commander appreciating the situation got the column into a harbour area.\n" +
            "\n" +
            "On 10 April 1948 at 0445 hours, Second Lieutenant Rane again started work on the roadblock in spite of machine-gun fire with the support of one troops of tanks. With sheer will power he cleared this roadblock by 0630hours. The next thousand yards was a mass of roadblocks and blasted embankments. That was not all. The enemy had the whole area covered with machine-gun fire but with superhuman efforts, in spite of having been wounded, with cool courage and exemplary leadership and complete disregard for personal life, he cleared the road by 1030 hours.\n" +
            "\n" +
            "The armoured column proceeded ahead and got off the road into the riverbed of the Tawi but Second Lieutenant Rane continued clearing the road for the administrative column. The tanks reached Chingas by 1400 hours. Second Lieutenant Rane appreciating that the opening of the road was most vital, continued working without rest or food till 2100 hours that night.\n" +
            "\n" +
            "On 11 April 1948, he again started work at 0600 hours and opened the road to Chingas by 1100 hours. He worked on that night till 2200 hours clearing the road ahead.",
        R.drawable.second_lieutenant_rama_raghoba_rane // Image
    );

    static PVCRecipient four = new PVCRecipient(
        "Naik", // Rank
        "Jadu Nath Singh", // Name
        "27373", // Award Number
        "1st Battalion, Rajput Regiment", //Regiment
        new GregorianCalendar( 1948, Calendar.FEBRUARY, 6 ), //Award Date
        "Naushera, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1916, Calendar.NOVEMBER, 21 ), // Birth Date
        new GregorianCalendar( 1948, Calendar.FEBRUARY, 6 ), // Death Date
        "Shahjahanpur, Uttar Pradesh", // Birth Place
        "At No 2 picquet on Taindhar on 6 February 1948, No 27373 NaikJadunath Singh was in command of a forward section post, which bore the full brunt of the enemy attack. Nine men against overwhelming odds garrisoned the little post. The enemy launched its attack in successive waves and with great ferocity to overcome this post. The first wave swept up to the post in a furious attack. Displaying great valour and superb qualities of leadership NaidkJadunath Singh so used the small force at his disposal that the enemy retired in utter confusion. Four of his men were wounded but NaikJadunath Singh again showed his qualities of good leadership by reorganizing the battered force under him, for meeting another onslaught. His coolness and courage were of such an order that the men rallied and were ready for the second attack which came with greater determination and in larger number than the preceding one. Though hopelessly outnumbered, this post under the gallant leadership of NaikJadunath Singh resisted. All were wounded, and Naik Jadunath Singh, though wounded in the right arm, personally took over the Bren gun from the wounded Bren gunner. The enemy was right on the walls of the post but Naik Jadunath Singh once again showed outstanding ability and valour of the highest order in action. \n" +
            "\n" +
            "By his complete disregard for his personal safety and example of coolness and courage, he encouraged his men to fight. His fire was so devastating, that what looked like impending defeat was turned into a victory and the enemy retreated in chaos leaving the dead and wounded littered on the ground. With this act of supreme heroism and outstanding example of leadership and determination, NaikJadunath Singh saved the post from the second assault. By this time, all men in the post were casualties. The enemy put in his third and final attack in undiminished numbers and determination to capture this post. NaikJadunath Singh, now wounded, prepared literally single-handed to give battle for the third time. With greatcourage and determination, he came out of the sangar and finally with the Sten gun, made a most magnificent single-handed charge on the advancing enemy, who, completely taken by surprise, fled in disorder. NaikJadunath Singh, however, met his gallant death in his third and last charge when two bullets hit him in the head and chest. Thus, charging single-handedly at the advancing enemy, this Non-Commissioned Officer, performed the highest act of gallantry and self-sacrifice and by so doing saved his section-nay, his whole picquet from being overrun by the enemy at the most critical stage in the battle for the defence of Nushera",
        R.drawable.naik_jadunath_singh // Image
    );

    static PVCRecipient five = new PVCRecipient(
        "Company Havildar Major", // Rank
        "Piru Singh Shekhawat", // Name
        "2831592", // Award Number
        "6th Battalion, Rajputana Rifles", //Regiment
        new GregorianCalendar( 1948, Calendar.JULY, 18 ), //Award Date
        "Tithwal, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1918, Calendar.MAY, 20 ), // Birth Date
        new GregorianCalendar( 1948, Calendar.JULY, 18 ), // Death Date
        "Rampura Beri, Rajasthan", // Birth Place
        "South of Tithwal, ‘D’ Company, of which No 2831592 Piru Singh, was Havildar Major was detailed to attack and capture an enemy occupied hill feature. The enemy had well dug in positions and had sited his MMGs so as to cover all possible approaches. As the attack advanced, it was met with heavy MMG fire from both flanks. Volleys of grenades were hurled down from enemy bunkers. Company Havildar Major Piru Singh was then with the forward most Section of the company.\"\n" +
            "\n" +
            "\"Seeing more than half of the Section killed or wounded, he did not lose courage. With battle cries he encouraged the remaining men and rushed forward with great determination onto the nearest enemy MMG position. Grenade splinters ripping his clothes and wounding him at several places, he continued to advance without the least regard for his safety. He was on top of the MMG position wounding the gun crew with Sten gun fire. With complete disregard to his bleeding wounds he made a mad jump on the MMG crew bayoneting them to death, thus silencing the gun.\n" +
            "\n" +
            "\"By then he suddenly realized that he was the sole survivor of the section, the rest of them either dead or wounded. Another grenade thrown at him wounded him in the face. With blood dripping from his face wounds in his eyes, he crawled out of the trench, hurling grenades at the next enemy position.\"\n" +
            "\n" +
            "\"With a loud battle cry, he jumped on the occupants of the next trench bayoneting two to death. The ‘C’ Company Commander who was directing fire in support of the attacking company witnessed this action.\"\n" +
            "\n" +
            "\"As Havilder Major Piru Singh emerged out of the second trench to charge on the 3rd enemy bunker, he was hit in the head by a bullet and was seen dropping on the edge of the enemy trench. There was an explosion in the trench, which showed that his grenade had done its work. By then Company Havildar Major Piru Singh’s wounds had proved fatal.\"\n" +
            "\n" +
            "\"He had paid with his life for his singularly brave act, but he had left for the rest of his comrades an unique example of single-handed bravery and determined cold courage.",
        R.drawable.chm_piru_singh // Image
    );

    static PVCRecipient six = new PVCRecipient(
        "Captain", // Rank
        "Gurbachan Singh Salaria", // Name
        "IC-8947", // Award Number
        "3rd Battalion, 1st Gorkha Rifles (The Malaun Regiment)", //Regiment
        new GregorianCalendar( 1961, Calendar.DECEMBER, 5 ), //Award Date
        "Elizabethville, Katanga, Congo", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1935, Calendar.NOVEMBER, 29 ), // Birth Date
        new GregorianCalendar( 1961, Calendar.DECEMBER, 5 ), // Death Date
        "Gurdaspur, India", // Birth Place
        "On 5 December 1961, 3/1 Gorkha Rifles was ordered to clear a roadblock established by the gendarmerie at a strategic roundabout at Elizabethville, Katanga. The plan was that one company with 2 Swedish armoured cars would attack the position frontally and Captain Gurbachan Singh Salaria with two sections of Gorkhas and two Swedish armoured personnel carriers would advance towards this roadblock from the airfield to act as a cutting-off force.\n" +
            "\n" +
            "Captain Salaria with his small force arrived at a distance of 1500 yards from the roadblock at approximately 1312 hours on 5 December 1961 and came under heavy automatic and small-arms fire from an undetected enemy position dug in on his right flank. The enemy also had two armoured cars and about 90 men opposing Captain Salaria’s small force.\n" +
            "\n" +
            "Captain Salaria appreciating that he had run into a subsidiary roadblock and ambush and that this enemy force might reinforce the strategic roundabout and thus jeopardize the main operation, decided to remove this opposition. He led a charge with bayonets, khukris, and grenades supported by a rocket launcher. In this gallant engagement, Captain Salaria killed 40 of the enemy and knocked out the two armoured cars. This unexpected bold action completely demoralised the enemy who fled despite their numerical superiority and protected positions.\n" +
            "\n" +
            "Captain Salaria was wounded in his neck by a burst of automatic fire but continued to fight till he collapsed due to loss of blood. Captain Salaria’s gallant action prevented any enemy movement of the enemy force towards the main battle scene and thus contributed very largely to the success of the main battalion’s action at the roundabout and prevented the encirclement of UN Headquarters in Elizabethville. Captain Salaria subsequently died of his wounds.\n" +
            "\n" +
            "Captain Salaira’s personal example, utter disregard for personal safety and dauntless leadership inspired his small but gallant force of sixteen Gorkhas to hold on to their position, dominate the enemy and to inflict heavy casualties despite the enemy’s superiority in numbers and tactical position.\n" +
            "\n" +
            "Captain Gurbachan Singh Salaria’s leadership, courage, and unflinching devotion to duty and disregard for personal safety were in the best traditions of the Indian Army",
        R.drawable.captain_gurbachan_singh_salaria // Image
    );

    static PVCRecipient seven = new PVCRecipient(
        "Major", // Rank
        "Dhan Singh Thapa", // Name
        "IC-7990", // Award Number
        "1st Battalion, 8th Gorkha Rifles", //Regiment
        new GregorianCalendar( 1962, Calendar.OCTOBER, 28 ), //Award Date
        "Ladakh, India", // Award Place
        Boolean.FALSE, // Posthumous?
        new GregorianCalendar( 1828, Calendar.JUNE, 10 ), // Birth Date
        new GregorianCalendar( 2005, Calendar.SEPTEMBER, 6 ), // Death Date
        "Shimla, Himachal Pradesh", // Birth Place
        "( 3 Mechnised Infantry)\n" +
            "\n" +
            "Major Dhan Singh Thapa . On 20 October it was attacked by the Chinese in overwhelming strength after being subjected to intensive artillery and mortar bombardment. Under his gallant command, the greatly outnumbered post repulsed the attack, inflicting heavy casualties on the aggressors. The enemy attacked again in greater numbers after heavy shelling by artillery and mortar fire. Under the leadership of Major Thapa, his men repulsed this attack also with heavy losses to the enemy.\n" +
            "\n" +
            "The Chinese attacked for the third time, now with tanks to support the infantry. The post had already suffered large numbers of casualties in the earlier two attacks. Though considerably reduced in number it held out to the last. When it was finally overrun by overwhelming numbers of the enemy, Major Thapa got out of his trench and killed several of the enemy in hand-to-hand fighting before he was finally overpowered by Chinese soldiers.\n" +
            "\n" +
            "Major Thapa’s cool courage, conspicuous fighting qualities and leadership were in the highest traditions of our Army.",
        R.drawable.major_dhan_singh_thapa // Image
    );

    static PVCRecipient eight = new PVCRecipient(
        "Subedar", // Rank
        "Joginder Singh", // Name
        "JC-4547", // Award Number
        "1st Battalion, Sikh Regiment", //Regiment
        new GregorianCalendar( 1962, Calendar.OCTOBER, 23 ), //Award Date
        "Tongpen La, Northeast Frontier Agency, India", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1921, Calendar.SEPTEMBER, 26 ), // Birth Date
        new GregorianCalendar( 1962, Calendar.OCTOBER, 23 ), // Death Date
        "Moga, Punjab", // Birth Place
        "Subedar Joginder Singh was the commander of a platoon of the Sikh Regiment holding a defensive position at a ridge near Tongpen La in NEFA. At 0530 hours on 23 October 1962, the Chinese opened a very heavy attack on the Bumla axis with the intention of breaking through to Towang. The leading battalion of the enemy attacked the ridge in three waves, each about 200 strong. Subedar Joginder Singh and his men mowed down the first wave, and the enemy was temporarily halted by the heavy losses it suffered. Within a few minutes, a second wave came over and was dealt with similarly. But the platoon had, by then, lost half its men.\n" +
            "\n" +
            "\n" +
            " Subedar Joginder Singh was wounded in the thigh but refused to be evacuated. Under his inspiring leadership the platoon stubbornly held its ground and would not withdraw.\n" +
            "\n" +
            " Meanwhile the position was attacked for the third time. Subedar Joginder Singh himself manned a light machine-gun and shot down a number of the enemy. The Chinese however continued to advance despite heavy losses. When the situation became untenable Subedar Joginder Singh and the few men that were left in the position fixed bayonets and charged the advancing Chinese, bayoneting a number of them before he and his comrades were overpowered. Throughout this action, Subedar Joginder Singh displayed devotion to duty, inspiring leadership and bravery of the highest order.",
        R.drawable.subedar_joginder_singh // Image
    );

    static PVCRecipient nine = new PVCRecipient(
        "Major", // Rank
        "Shaitan Singh", // Name
        "IC-7990", // Award Number
        "13th Battalion, Kumaon Regiment", //Regiment
        new GregorianCalendar( 1962, Calendar.NOVEMBER, 18 ), //Award Date
        "Rezang La, Ladakh", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1924, Calendar.DECEMBER, 1 ), // Birth Date
        new GregorianCalendar( 1962, Calendar.NOVEMBER, 18 ), // Death Date
        "Jodhpur, Rajasthan", // Birth Place
        "Major Shaitan Singh was commanding a company of an infantry battalion deployed at Rezang La in the Chushul sector at a height of about 17,000 feet. The locality was isolated from the main defended sector and consisted of five platoon-defended position. On 18 November 1962, the Chinese forces subjected the company position to heavy artillery, mortar and small arms fire and attacked it in overwhelming strength in several successive waves. Against heavy odds, our troops beat back successive waves of enemy attack. During the action, Major Shaitan Singh dominated the scene of operations and moved at great personal risk from one platoon post to another, sustaining the morale of his hard-pressed platoon posts. While doing so he was seriously wounded but continued to encourage and lead his men who, following his brave example, fought gallantly and inflicted heavy casualties on the enemy. For every man lost to us, the enemy lost four or five. When Major Shaitan Singh fell disabled by wounds in his arms and abdomen, his men tried to evacuate him but they came under heavy machine-gun fire. Major Shaitan Singh then ordered his men to leave him to his fate in order to save their lives.\n" +
            "\n" +
            "Major Shaitan Singh’s supreme courage, leadership and exemplary devotion to duty inspired his company to fight almost to the last man.",
        R.drawable.major_shaitan_singh // Image
    );

    static PVCRecipient ten = new PVCRecipient(
        "Company Quarter Master Havildar", // Rank
        "Abdul Hamid", // Name
        "2639885", // Award Number
        "4th Battalion, The Grenadiers", //Regiment
        new GregorianCalendar( 1965, Calendar.SEPTEMBER, 10 ), //Award Date
        "Khem Karan Sector, Pakistan", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 19433, Calendar.JULY, 1 ), // Birth Date
        new GregorianCalendar( 1965, Calendar.SEPTEMBER, 10 ), // Death Date
        "Dhamupur, Ghazipur, Uttar Pradesh", // Birth Place
        "At 0800 hours on 10 September 1965 Pakistan forces launched an attack with a regiment of Patton tanks on a vital area ahead of village Cheema on the Bhikkiwind road in the Khem Karan Sector. Intense artillery shelling preceded the attack. The enemy tanks penetrated the forward position by 0900 hours. Realising the grave situation, Company Quartermaster Havildar Abdul Hamid who was commander of a RCL gun detachment moved out to a flanking position with his gun mounted on a jeep, under intense enemy shelling and tank fire. Taking an advantageous position, he knocked out the leading enemy tank and then swiftly changing his position, he sent another tank up in flames. By this time the enemy tanks in the area spotted him and brought his jeep under concentrated machine-gun and high explosive fire. Undeterred, Company Quartermaster Havildar Abdul Hamid kept on firing on yet another enemy tank with his recoilless gun. While doing so, he was mortally wounded by an enemy high explosive shell. \n" +
            "\n" +
            " Havildar Abdul Hamid’s brave action inspired his comrades to put up a gallant fight and to beat back the heavy tank assault by the enemy. His complete disregard for his personal safety during the operation and his sustained acts of bravery in the face of constant enemy fire were a shining example not only to his unit but also to the whole division and were in the highest traditions of the Indian Army.",
        R.drawable.cqmh_abdul_hamid // Image
    );

    static PVCRecipient eleven = new PVCRecipient(
        "Lt. Col.", // Rank
        "Ardeshir Burzorji Tarapore", // Name
        "IC-5565", // Award Number
        "17th Poona Horse", //Regiment
        new GregorianCalendar( 1965, Calendar.OCTOBER, 15 ), //Award Date
        "Phillora, Sialkot Sector, Pakistan", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1923, Calendar.AUGUST, 18 ), // Birth Date
        new GregorianCalendar( 1965, Calendar.SEPTEMBER, 16 ), // Death Date
        "Bombay, Bombay Presidency, British India", // Birth Place
        "On 11 September 1965, the Poona Horse Regiment under the command of Lieutenant Colonel Ardeshir Burzarji Tarapore was assigned the task of delivering the main armoured thrust for capturing Phillora in the Sialkot Sector in Pakistan . As a preliminary to making a surprise attack on Phillora from the rear, the regiment was thrusting between Philloira and Chawinda when it was suddenly counter attacked by the enemy’s heavy Armour from Wazirali. Lieutenant Colonel A. B. Tarapore who was then at the head of his regiment, defied the enemy’s charge, held his ground and gallantly attacked Philloira with one of his squadrons supported by an infantry battalion. Though under continuous enemy tank and artillery fire, Lieutenant Colonel A B Tarapore remained unperturbed throughout this action and when wounded refused to be evacuated.\n" +
            "\n" +
            "On 14 September 1965, though still wounded he again led his regiment to capture Wazirali. Such was his grit and determination that unmindful of his injury, he again gallantly led regiment and captured Jassoran and Butur-Dograndi on 16 September. His own tank was hit several times, but despite the odds he maintained his pivots in both these places and thereby allowed the supporting infantry to attack Chawinda from the rear.\n" +
            "\n" +
            "Inspired by his leadership, the regiment fiercely attacked the enemy heavy armour destroying approximately 60 enemy tanks at a cost of only 9 tank casualties, and when lieutenant Colonel A. B Tara pore was mortally wounded the regiment continue to defy the enemy.\n" +
            "\n" +
            "The valour displayed by lieutenant Colonel A.B. Tarapore in this heroic action, which lasted six days, was in keeping with the highest traditions of the Indian Army.",
        R.drawable.ltcol_ardeshir_burzorji_tarapore // Image
    );

    static PVCRecipient twelve = new PVCRecipient(
        "Lance Naik", // Rank
        "Albert Ekka", // Name
        "4239746", // Award Number
        "14th Battalion, Brigade of the Guards", //Regiment
        new GregorianCalendar( 1971, Calendar.DECEMBER, 1971 ), //Award Date
        "Gangasagar, Agartala Sector", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1942, Calendar.DECEMBER, 27 ), // Birth Date
        new GregorianCalendar( 1971, Calendar.DECEMBER, 3 ), // Death Date
        "Jari, Chainpur, Gumla", // Birth Place
        "Lance Naik Albert Ekka was in the left forward company of a battalion of the Brigade of Guards during their attack on the enemy defences at Gangasagar on the Eastern front. This was a well-fortified position held in strength by the enemy. The assaulting troops were subjected to intense shelling and heavy small-arms fire, but they charged onto the objective and were locked in bitter hand-to-hand combat. Lance Naik Albert Ekka noticed an enemy light machine-gun (LMG) inflicting heavy casualties on his company. With complete disregard for his personal safety, he charged the enemy bunker, bayoneted two enemy soldiers and silenced the LMG. Though seriously wounded in this encounter, he continued to fight alongside his comrades through the mile deep objective, clearing bunker after bunker with undaunted courage. Towards the northern end of the objective one enemy medium machine-gun (MMG) opened up from the second storey of a well-fortified building inflicting heavy casualties and holding up the attack. Once again this gallant soldier, without a thought for his personal safety, despite his serious injury and the heavy volume of enemy fire, crawled forward till he reached the building and lobbed a grenade into the bunker killing one enemy soldier and injuring the other. The MMG however continued to fire. With outstanding courage and determination Lance Naik Albert Ekka scaled a side wall and entering the bunker, bayoneted the enemy soldier who was still firing and thus silenced the machine-gun, saving further casualties to his company and ensuring the success of the attack. In this process however, he received serious injuries and succumbed to them after the capture of the objective.\n" +
            "\n" +
            "In this action, Lance Naik Albert Ekka displayed the most conspicuous valour and determination and made the supreme sacrifice in the best traditions of the Army.",
        R.drawable.lance_naik_albert_ekka // Image
    );

    static PVCRecipient thirteen = new PVCRecipient(
        "Flying Officer", // Rank
        "Nirmaljit Singh Sekhon", // Name
        "10877 F(P)", // Award Number
        "No.18 Squadron, Indian Air Forcet", //Regiment
        new GregorianCalendar( 1971, Calendar.DECEMBER, 14 ), //Award Date
        "Srinagar, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1943, Calendar.JULY, 17 ), // Birth Date
        new GregorianCalendar( 1971, Calendar.DECEMBER, 14 ), // Death Date
        "Isewal, Ludhiana, Punjab", // Birth Place
        "Flying Officer Nirmal Jit Singh Sekhon was a pilot of a Folland Gnat detachment based at Srinagar for the air defence of the valley against Pakistani air attacks. In accordance with the international agreement dating back to 1948, no air defence aircraft were based at Sirinagar, until the outbreak of hostilities with Pakistan. Flying Officer Sekhon was, therefore, unfamiliar with the terrain and was not acclimatised to the altitude of Srinagar, especially with the bitter cold and biting winds of the Kashmir winter. Nevertheless, from the outset of the war, he and his colleagues fought successive waves of intruding Pakistani aircraft with valour and determination, maintaining the high reputation of the Folland Gnat aircraft. On 14 December 1971, Srinagar Airfield was attacked by a wave of six enemy Sabre aircraft. Flying Officer Sekhon was on readiness duty at the time. However, he could not take off at once because of the clouds of dust raised by another aircraft which had just taken off. By the time the runway was fit for take-off, no fewer than six enemy aircraft were overhead, and strafing of the airfield was in progress. Nevertheless, in spite of the mortal danger of attempting to take off during an attack, and in spite of the odds against him. Flying Officer Sekhon took off and immediately engaged a pair of the attacking Sabres. In the fight that followed, at tree top height, he all but held his own, but was eventually overcome by sheer weight of numbers. His aircraft crashed and he was killed. In thus, sacrificing himself for the defence of Srinagar, Flying Officer Sekhon achieved his object, for the enemy aircraft fled from the scene of the battle without pressing home their attack against the town and the airfield. The sublime heroism, supreme gallantry, flying skill and determination, above and beyond the call of duty, displayed by Flying Officer Sekhon in the face of certain death, set new heights to Air Force traditions.",
        R.drawable.flying_officer_nirmaljit_singh_sekhon // Image
    );

    static PVCRecipient fourteen = new PVCRecipient(
        "2nd Lieutenant", // Rank
        "Arun Khetarpal", // Name
        "IC-25067", // Award Number
        "17th Poona Horse", //Regiment
        new GregorianCalendar( 1971, Calendar.DECEMBER, 16 ), //Award Date
        "Jarpal, Shakargarh Sector", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1950, Calendar.OCTOBER, 14 ), // Birth Date
        new GregorianCalendar( 1971, Calendar.DECEMBER, 16 ), // Death Date
        "Pune, Bombay State, India", // Birth Place
        "On 16 December 1971, the squadron Commander of ‘B’ Squadron, the Poona Horse asked for reinforcements as the Pakistani armour that was superior in strength, counter attacked at Jarpal, in the Shakargarh Sector. On hearing this transmission, 2nd Lt Khetarpal who was in ‘A’ Squadron, voluntarily moved along with his troop, to assist the other squadron. Enroute, while crossing the Basantar River, Second Lieutenant Arun Khetarpal and his troops came under fire from enemy strong points and RCL gun nests that were still holding out. Time was at a premium and as a critical situation was developing in the ‘B’ Squadron sector, Second Lieutenant Arun Khetarpal, threw caution to the winds and started attacking the impending enemy strong points by literally charging them, Overrunning the defence works with his tanks and capturing the enemy infantry and weapon crews at pistol point. In the course of one such daring attack one tank commander of his troop was killed. Second Lieutenant Arun Khetarpal continued to attack relentlessly until all enemy opposition was overcome and he broke through towards the ‘B’ Squadron position, just in time to see the enemy tanks pulling back after their initial probing attack on this squadron. He was so carried away by the wild enthusiasm of battle and the impetus of his own headlong dash that he started chasing the withdrawing tanks and even managed to shoot and destroy one. Soon thereafter, the enemy reformed with a squadron of armour for a second attack and this time they selected the sector held by Second Lieutenant Arun Khetarpal and two other tanks as the point for their main effort. A fierce tank fight ensued: ten enemy tanks were hit and destroyed of which Second Lieutenant Arun Khetarpal personally destroyed four, just then Second Lieutenant Arun Khetarpal was severely wounded. He was asked to abandon his tank but he realized that the enemy though badly decimated was continuing to advance in his sector of responsibility and if he abandoned his tank the enemy would break through, he gallantly fought on and destroyed another enemy tank. At this stage his tank received a second hit which resulted in the death of this gallant officer.\n" +
            "\n" +
            " Second Lieutenant Arun Khetarpal was dead but he had, by his intrepid valour saved the day; the enemy was denied the breakthrough he was so desperately seeking. Not one enemy tank got through.\n" +
            "\n" +
            " Second Lieutenant Arun Khetarpal had shown the best qualities of leadership, tenacity of purpose and the will to close in with the enemy. This was an act of courage and self-sacrifice far beyond the call of duty.",
        R.drawable.second_lieutenant_arun_khetarpal // Image
    );

    static PVCRecipient fifteen = new PVCRecipient(
        "Major", // Rank
        "Hoshiar Singh", // Name
        "IC-14608", // Award Number
        "3rd Battalion, The Grenadiers", //Regiment
        new GregorianCalendar( 1971, Calendar.DECEMBER, 17 ), //Award Date
        "Basantar River, Shakargarh Sector", // Award Place
        Boolean.FALSE, // Posthumous?
        new GregorianCalendar( 1937, Calendar.MAY, 5 ), // Birth Date
        new GregorianCalendar( 1998, Calendar.DECEMBER, 1998 ), // Death Date
        "Sisana,Sonipat, Haryana", // Birth Place
        "On 15 December 1971 a battalion of the Grenadiers was given the task of establishing a bridgehead across the Basantar river in the Shakargarh Sector. Major Hoshiar Singh was commanding the left forward company and he was ordered to capture the enemy locality of Jarpal. This was a well-fortified position and was held in strength by the enemy. During the assault, his company came under intense shelling and effective crossfire from enemy medium machine guns. Undeterred, he led the charge and captured the objective after a fierce hand-to hand fight. The enemy reacted and put in three counterattacks on 16 December 1971, two of them supported by armour, Major Hoshiar Singh unmindful of the heavy shelling and tank fire went from trench to trench, motivating his command and encouraging his men to stand fast and fight. Inspired by his courage and dauntless leadership, his company repulsed all the attacks inflicting heavy casualties on the enemy. Again, on 17 December 1971 the enemy made another attack with a battalion supported by heavy artillery fire. Though seriously wounded by enemy shelling, Major Hoshiar Singh again went from trench to trench moving about in the open with utter disregard to his personal safety when an enemy shell landed near the medium machine gun post injuring the crew and rendering it inoperative. Major Hoshiar Singh, realizing the importance of machine-gun fire, immediately rushed to the machine-gun pit and though seriously wounded himself, manned the gun inflicting heavy casualties on the enemy. The attack was successfully repulsed and the enemy retreated leaving behind 85 dead including their Commanding Officer and three other officers. Though seriously wounded, Major Hoshiar Singh refused to be evacuated till the ceasefire. Throughout this operation, Major Hoshiar Singh displayed most conspicuous gallantry, indomitable fighting spirit and leadership in the highest traditions of the Army.",
        R.drawable.major_hoshiar_singh // Image
    );

    static PVCRecipient sixteen = new PVCRecipient(
        "Naib Subedar", // Rank
        "Bana Singh", // Name
        "JC-155825", // Award Number
        "8th Battalion, Jammu and Kashmir Light Infantry", //Regiment
        new GregorianCalendar( 1987, Calendar.JUNE, 23 ), //Award Date
        "Siachen Glacier, Jammu and Kashmir", // Award Place
        Boolean.FALSE, // Posthumous?
        new GregorianCalendar( 1949, Calendar.JANUARY, 3 ), // Birth Date
        null, // Death Date
        "Kadyal, Jammu and Kashmir", // Birth Place
        "Naib Subedar Bana Singh volunteered to be a member of a task force constituted in June 1987 to clear an intrusion by an adversary in the Siachen Glacier area at an altitude of 21,000 feet. The post was virtually an impregnable glacier fortress with ice walls, 1500 feet high, on both sides. Naib Subedar Bana Singh led his men through an extremely difficult and hazardous route. He inspired them by his indomitable courage and leadership. The brave Naib Subedar and his men crawled and closed in on the adversary. Moving from trench to trench, lobbing hand grenades, and charging with the bayonet, he cleared the post all intruders.\n" +
            "Nb Subedar Bana Singh displayed the most conspicuous gallantry and leadership under the most adverse conditions.",
        R.drawable.naib_subedar_bana_singh // Image
    );

    static PVCRecipient seventeen = new PVCRecipient(
        "Major", // Rank
        "Ramaswamy Parameswaran", // Name
        "IC-32907", // Award Number
        "8th Battalion, Mahar Regiment", //Regiment
        new GregorianCalendar( 1987, Calendar.NOVEMBER, 25 ), //Award Date
        "Sri Lanka", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1946, Calendar.SEPTEMBER, 13 ), // Birth Date
        new GregorianCalendar( 1987, Calendar.NOVEMBER, 25 ), // Death Date
        "Mumbai, Maharashtra, India", // Birth Place
        "On 25 November 1987, when Major Ramaswamy Parameswaran was returning from search operation in Sri Lanka, late at night, his column was ambushed by a group of militants. With cool presence of mind, he encircled the militants from the rear and charged into them, taking them completely surprise. During the hand-to-hand combat, a militant shot him in the chest. Undaunted, Major Parameswaran snatched the rifle from the militant and shot him dead. Gravely wounded, he continued to give orders and inspired his command till he breathed his last. Five militants were killed and three rifles and two rocket launchers were recovered and the ambush was cleared .\n" +
            "\n" +
            "Major Ramaswamy Parameswaran displayed the most conspicuous gallantry and thought nothing of dying at his post.",
        R.drawable.major_ramaswamy_parameswaran // Image
    );

    static PVCRecipient eighteen = new PVCRecipient(
        "Lieutenant", // Rank
        "Manoj Kumar Pandey", // Name
        "IC-56959", // Award Number
        "1st Battalion, 11th Gorkha Rifles", //Regiment
        new GregorianCalendar( 1999, Calendar.JULY, 3 ), //Award Date
        "Juber Top, Kargil, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1975, Calendar.JUNE, 25 ), // Birth Date
        new GregorianCalendar( 3, Calendar.JULY, 1999 ), // Death Date
        "Sitapur, Uttar Pradesh", // Birth Place
        "Captain Manoj Kumar Panday took part in a series of boldly led attacks during ‘operation Vijay; forcing back the intruders with heavy losses in Batalik including the capture of Jabbar Top. On the night of 2/3 July 1999 during the advance to Khalubar as his platoon approached its final objective, it came under heavy and intense enemy fire from the surrounding heights. Captain Pandey was tasked to clear the interfering enemy positions to prevent his battalion from getting day lighted, being in a vulnerable position. He quickly moved his platoon to an advantageous position under intense enemy fire, sent one section to clear the enemy positions from the right and himself proceeded to clear the enemy positions from the left. Fearlessly assaulting the first enemy position, he killed two enemy personnel and destroyed the second position by killing two more. He was injured on the shoulder and legs while clearing the third position. Undaunted and without caring for his grievous injuries, he continued to lead the assault on the fourth position urging his men and destroyed the same with a grenade, even as he got a fatal burst on his forehead. This singular daredevil act of Captain Pandey provided the critical firm base for the companies, which finally led to capture of Khalubar. The officer, however, succumbed to his injuries.\n" +
            "\n" +
            "Captain Manoj Kumar Pandey, thus, displayed most conspicuous bravery, indomitable courage, outstanding leadership and devotion to duty and made the supreme sacrifice in the highest traditions of the Indian Army.",
        R.drawable.lt_manoj_kumar_pandey // Image
    );

    static PVCRecipient nineteen = new PVCRecipient(
        "Grenadier", // Rank
        "Yogendra Singh Yadav", // Name
        "2690572", // Award Number
        "18th Battalion, The Grenadiers", //Regiment
        new GregorianCalendar( 1999, Calendar.JULY, 4 ), //Award Date
        "Tiger Hill, Kargil, Kashmir", // Award Place
        Boolean.FALSE, // Posthumous?
        null, // Birth Date
        null, // Death Date
        "Bulandshahar, Uttar Pradesh", // Birth Place
        "Grenadier Yogender Singh Yadav was part of the leading team of a Ghatak Platoon tasked to capture Tiger Hill on the night of ¾ July 1999. The approach to the top was steep, snowbound and rocky. Grenadier Yogender Singh Yadav, unmindful of the danger involved, volunteered to lead and fix the rope for his team to climb up. On seeing the team, the enemy opened intense automatic, grenade, rocket and artillery fire killing the Commander and two of his colleagues and the platoon was stalled. Realising the gravity of the situation, Grenadier Yogender Singh Yadav crawled up to the enemy position to silence it and in the process sustained multiple bullet injuries. Unmindful of his injuries and in the hail of enemy bullets, Grenadier Yogender Singh Yadav continued climbing towards the enemy positions, lobbed grenades, continued firing from his weapons and killed four enemy soldiers in close combat an silenced the automatic fire. Despite multiple bullet injuries, he refused to be evacuated and continued the charge. Inspired by his gallant act, the platoon charged on the other positions with renewed punch and captured Tiger Hill Top. \n" +
            "\n" +
            " Grenadier Yogender Singh Yadav displayed the most conspicuous courage, indomitable gallantry, grit and determination under extreme adverse circumstances.",
        R.drawable.grenadier_yoginder_singh_yadav // Image
    );

    static PVCRecipient twenty = new PVCRecipient(
        "Rifleman", // Rank
        "Sanjay Kumar", // Name
        "13760533", // Award Number
        "13th Battalion, Jammu & Kashmir Rifles", //Regiment
        new GregorianCalendar( 1999, Calendar.JULY, 5 ), //Award Date
        "Area Flat Top, Kargil, Kashmir", // Award Place
        Boolean.FALSE, // Posthumous?
        null, // Birth Date
        null, // Death Date
        "Bilaspur, Himachal Pradesh", // Birth Place
        "Rifleman Sanjay Kumar volunteered to be the leading scout of the attacking column tasked to capture area Flat Top of Point 4875 in the Mushkoh Valley on 4 July 1999. During the attack when enemy automatic fire from one of the sangars posed stiff opposition and stalled the column, Rifleman Sanjay Kumar realizing the gravity of the situation and with utter disregard to his personal safety, charged at the enemy. In the ensuing hand-to- hand combat, he killed three of the intruders and was himself seriously injured. Despite his injuries, he charged onto the second sangar. Taken totally by surprise, the enemy left behind a Universal Machine Gun and started running. \n" +
            "\n" +
            "Rifleman Sanjay Kumar picked up the UMG and killed the fleeing enemy. Although bleeding profusely, he refused to be evacuated. The brave action on his part motivated his comrades and they took no notice of the treacherous terrain and charged onto the enemy and wrested the area Flat Top from the hands of the enemy. \n" +
            "\n" +
            " Rifleman Sanjay Kumar displayed most conspicuous gallantry, cool courage and devotion to duty of an exceptionally high order in the face of the enemy.",
        R.drawable.rifleman_sanjay_kumar // Image
    );

    static PVCRecipient twentyOne = new PVCRecipient(
        "Captain", // Rank
        "Vikram Batra", // Name
        "IC-57556", // Award Number
        "13th Battalion, Jammu & Kashmir Rifles", //Regiment
        new GregorianCalendar( 1999, Calendar.JULY, 6 ), //Award Date
        "Points 5140 & 4875, Kargil, Kashmir", // Award Place
        Boolean.TRUE, // Posthumous?
        new GregorianCalendar( 1974, Calendar.SEPTEMBER, 9 ), // Birth Date
        new GregorianCalendar( 1999, Calendar.JULY, 7 ), // Death Date
        "Palampur, Himachal Pradesh", // Birth Place
        "During ‘Operation Vijay’, on 20 June 1999, Captain VikramBatra, Commander Delta Company was tasked to attack Point 5140. Captain Batra with his company skirted around the feature from the East and maintaining surprise reached within assaulting distance of the enemy. Captain Batra reorganized his column and motivated his men to physically assault the enemy positions. Leading from the front, he in a daredevil assault, pounced on the enemy and killed four of them in a hand-to hand fight. On 7 July 1999, in another operation in the area Pt 4875, his company was tasked to clear a narrow feature with sharp cuttings on either side and heavily fortified enemy defences that covered the only approach to it. For speedy operation, Captain Batra assaulted the enemy position along a narrow ridge and engaged the enemy in a fierce hand –to-hand fight and killed five enemy soldiers at point blank range. Despite sustaining grave injuries, he crawled towards the enemy and hurled grenades clearing the position with utter disregard to his personal safety, leading from the front, he rallied his men and pressed on the attack and achieved a near impossible military task in the face of heavy enemy fire. The officer, however, succumbed to his injuries. Inspired by his daredevil act, his troops fell upon the enemy with vengeance, annihilated them and captured Point 4875. \n" +
            "\n" +
            " Captain VikramBatra, thus, displayed the most conspicuous personal bravery and leadership of the highest order in the face of the enemy and made the supreme sacrifice in the highest traditions of the Indian Army.",
        R.drawable.captain_vikram_batra // Image
    );

    /**
     * Fills the mutableRecipientsList with PVCRecipients
     */
    public static void fillMutableRecipientsList( )
    {
        mutableRecipientsList.add( one );
        mutableRecipientsList.add( two );
        mutableRecipientsList.add( three );
        mutableRecipientsList.add( four );
        mutableRecipientsList.add( five );
        mutableRecipientsList.add( six );
        mutableRecipientsList.add( seven );
        mutableRecipientsList.add( eight );
        mutableRecipientsList.add( nine );
        mutableRecipientsList.add( ten );
        mutableRecipientsList.add( eleven );
        mutableRecipientsList.add( twelve );
        mutableRecipientsList.add( thirteen );
        mutableRecipientsList.add( fourteen );
        mutableRecipientsList.add( fifteen );
        mutableRecipientsList.add( sixteen );
        mutableRecipientsList.add( seventeen );
        mutableRecipientsList.add( eighteen );
        mutableRecipientsList.add( nineteen );
        mutableRecipientsList.add( twenty );
        mutableRecipientsList.add( twentyOne );
    }

    /**
     * Fills the mutableRecipientsList with PVCRecipients
     */
    public static void fillImmutableRecipientsList( )
    {
        immutableRecipientsList.add( one );
        immutableRecipientsList.add( two );
        immutableRecipientsList.add( three );
        immutableRecipientsList.add( four );
        immutableRecipientsList.add( five );
        immutableRecipientsList.add( six );
        immutableRecipientsList.add( seven );
        immutableRecipientsList.add( eight );
        immutableRecipientsList.add( nine );
        immutableRecipientsList.add( ten );
        immutableRecipientsList.add( eleven );
        immutableRecipientsList.add( twelve );
        immutableRecipientsList.add( thirteen );
        immutableRecipientsList.add( fourteen );
        immutableRecipientsList.add( fifteen );
        immutableRecipientsList.add( sixteen );
        immutableRecipientsList.add( seventeen );
        immutableRecipientsList.add( eighteen );
        immutableRecipientsList.add( nineteen );
        immutableRecipientsList.add( twenty );
        immutableRecipientsList.add( twentyOne );
    }
}
