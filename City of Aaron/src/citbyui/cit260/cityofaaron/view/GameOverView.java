/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.model.Game;

/**
 *
 * @author Meroko
 */
public class GameOverView {

    public GameOverView() {
    }

    void displayResults(Game game) {
        if (game.getThePlayer().isAlive() == false)
            System.out.println(
                    "   ********      **     ****     **** ********         *******   **      ** ******** *******  \n" +
                    "  **//////**    ****   /**/**   **/**/**/////         **/////** /**     /**/**///// /**////** \n" +
                    " **      //    **//**  /**//** ** /**/**             **     //**/**     /**/**      /**   /** \n" +
                    "/**           **  //** /** //***  /**/*******       /**      /**//**    ** /******* /*******  \n" +
                    "/**    ***** **********/**  //*   /**/**////        /**      /** //**  **  /**////  /**///**  \n" +
                    "//**  ////**/**//////**/**   /    /**/**            //**     **   //****   /**      /**  //** \n" +
                    " //******** /**     /**/**        /**/********       //*******     //**    /********/**   //**\n" +
                    "  ////////  //      // //         // ////////         ///////       //     //////// //     // \n\n" +
                    "Take to Heart The Lessons Learned and Strive To Improve Every Day.");
        else {
            System.out.println(
                    " **    **         *******         **     **                   **       **       **       ****     **\n" +
                    "//**  **         **/////**       /**    /**                  /**      /**      /**      /**/**   /**\n" +
                    " //****         **     //**      /**    /**                  /**   *  /**      /**      /**//**  /**\n" +
                    "  //**         /**      /**      /**    /**       *****      /**  *** /**      /**      /** //** /**\n" +
                    "   /**         /**      /**      /**    /**      /////       /** **/**/**      /**      /**  //**/**\n" +
                    "   /**         //**     **       /**    /**                  /**** //****      /**      /**   //****\n" +
                    "   /**          //*******        //*******                   /**/   ///**      /**      /**    //***\n" +
                    "   //            ///////          ///////                    //       //       //       //      /// \n\n" +
                    "You Have Persevered In The Face of Great Challenge, You Will Live to Be Remembered as The Greatest King of Your People!"
            );
            
        }
    }
    
}
