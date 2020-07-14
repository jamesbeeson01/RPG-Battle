public class LarryKing extends Player {
  public void Player() {
    name = "Larry";
    hp = 150;
    strength = 15;
  }
  
  public void battleChoice() {
    public void battleChoice() {
      int choice = rand.nextInt(2);
      if (choice == 0) {
         System.out.println("Bill attacks!");
         attack();
      } else if (choice == 1) {
         System.out.println("Bill blocks!");
         block();
      } else {
         System.out.println("Larry takes a nap!");
      }
    }
  }
  
  //Print his face in console
  facePrint() {
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*/%&&&&&&&&&&&&&&&%(/*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*&&&&&&@&@&@@&&&&&&%%&&&&&&&&%//*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,/&@&&@&&@@@&&&&&&&&&&&&&&&%&&&&%%%%&&&&%##*/*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,(&@@@@@@&&&&@&&&%%%&%&&&&&%&&&%&%%%%##%%&%&%%%%(*,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,/&@@@@&@&&@&&%&&&&%%%#%&%&%%&%%%#######(((##%%&%%#(**/**,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,(&&@@&&&&&&%%%%###%#%%&%&%%%%#%%%%##(((////(((#%%&%%%##%#/,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,/#@@@&&&&&%##(/(//((###(#%##/#((#((//////*////(((%%%%%%%&&%/,,,,,,,,,,,,,********");
    System.out.println(",,,,,,,,,,,,,,,,,,*(&&&&&&&%#((///**/**/////*////*/////*/*///*///(((#%%%%%%&&&%/,,,,,,,,,,,,,,*,,,**");
    System.out.println(",,,,,,,,,,,,,,,,,*(%&&%%&&%#(////******,**,,*,,,,,***********////(/((#%&&%#%%&&%*,,,,,,,,,,,,,*,,,**");
    System.out.println(",,,,,,,,,,,,,,,**/#%&&%&%%#(////*******,,,,,*,,,,,*,***,*****/*////((##%%%%#%%&&%/,,,,,,,,,,,,*,,,,*");
    System.out.println(",,,,,,,,,,,,,***/(#%%%%#%#(//////**,**,,,,,,,,,.,,,*,,,,,**,***////((((##%%%#%%&&&*,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,***//#%%%%%%#(////*****,*,,,,,,,,,,,,,,,,,,,,*****////((((#%%%%%%%%%&&#*,,,,,,,,,,,,,,,,");
    System.out.println("*,,,**,,,,,*/##(%%%%%%####////****,,**,*,,,,,,,,,,,,*,*,***/****//((((((##%##%%&&&&///////*****,,,,,");
    System.out.println(",,,,,,**,,,*/##(%&&&%%#%#(/////,*,,**,,,,,*,,,,,,,,,,,*,,,******///((##%(#%%%&&&&&%(///////////////*");
    System.out.println(",,,,.,,/*,,,,*#%%%&&%&%%##////*/****,,,,,,,,,,,,,,,.,,,,,,***/***/(((#%%##%&%@@&&&%####((////(####(/");
    System.out.println(",,,***,,,*,,,,/%&&&&&&&@##(//*/*****,,,,,,,,,,,.,,,,,,.,,,,,******/(((####%%&%%&&&#//(##((/((######(");
    System.out.println("**,......,*,,.,(/(%%%%&&%#//*//*,,,,,,,,*,.,,,,,,,,,,,,,******,,*/(/((####%%%%%&&##(####(((###((####");
    System.out.println(".........,**,,,,,,*##((/&#/*********,,,,,*****,*,,,,,***////*(((%######(##@(#%%%%##((((///(#########");
    System.out.println("........,*,,,,,,...*(//((%&(***&%#@@@@@@@@@@@&&***/(#&@@&%&((&%#(((((((@&&(#&&%%##((((((((##((((((##");
    System.out.println(".....,,*,,,,,,*,,..,,***///&@/(/(%&#%%&&&(###(#@&**(&@&&%#/////((/#((###@###%%%%##((((((#####(///(##");
    System.out.println("***,,,,,,,,.,,.......*******@(##(/***/////(///*@*,,,*@%(//*/*/////////(@###%%%(((((((((((((((///////");
    System.out.println("....,,,,,,,,.........,,,**/*/&**/*******///,**@**,,,*(#(//*/(/(,******@(#%%%%#(((((((((((((((///////");
    System.out.println(",,,,,.,...............,,.,///,*@****,,*,,,,%@****,*,,////@@&%%%#(@@%%#%%%#%%((((((((((((((((((//////");
    System.out.println(",,.......................,**///**,,,*,,,,,,,*///*,,.,,*(//(**,*,****//((##%%((((((((((((((((((((////");
    System.out.println("..........................,,*//******,******,,,,*,.,.,*//(%#/(//////(((#%%@@@@%/(((((((((((((((((///");
    System.out.println("...........................,,*(/**/**///*/*****///****(&&%#*//((((/###%%%&@@@@@@#(((((((((((((((((//");
    System.out.println("...........................,*&(//(//***/***,,,,****#&&%#////*(#(/(**/#(%&@@@@@@@@@#(((((((((((((((((");
    System.out.println("....................*(&@@@&&@@&(//*,*/*******,*,****,,,*/##%%####/*/(%#&&@@@@@@@@@@@%(((((((((((((((");
    System.out.println(".............,*(&&&&&&@@@@@@@@@@//***,*,**/#(&/(/(**##%//(//(((/(*(/%#&&@@@@@@@@@@@@@@@@@@&#((((((((");
    System.out.println(".....,*/%&&&&&@@@@@@@@@@@@@@@@@&@%(***********,,**********(((//((/%(#&@@@@@@@@@@@@@@@@@@@@@@@@@&%(((");
    System.out.println("#&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@///********,*///******//////%%&%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@#/(/*********,,,*,,*//(##&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%&*/*/******,*/((%%&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%#%%&##(((&@&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@&@@@@@@@@@@@&&@@@@@@@@&@@@@@@&&@@@@@((#%%&@&@&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@&&&@@@@@@@@@&&@@@@@@@@&@@@@@@@&&&&@&&@%#&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@&@@@@@@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@&&@&@@@@@@&&&&@@@@@@&@@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&@@@@@@@@@@@@&");
    System.out.println("@@@@@@@@@@@@@@&&&&&@@&@&&@@@@@@@&@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@&&&");
    System.out.println("@@@@@@@@@@@@@@@&&&&&@&&&@@@@@@@@&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@&&&@@@@@&@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@&&&&@&&&&&@@@@@@@&@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@&&&@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@&&@&&&&&&@@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@&&&@@@@@@@@@@&&@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@&&&&&&&@@@@@@@&@@@@@@@@@&%&&&@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@&&&@@@@&@@@@@&&@@@");
    System.out.println("&@@@@@@@@@@@@@@@@@@&&&&&&&&&&@@@@&&@@@@@@@@@&&&&&@@@@@@@@@@@@@@@@@@@@@&&&@@@@@@@@@&&&@@@&@@@@@&&@@@@");
  }
}