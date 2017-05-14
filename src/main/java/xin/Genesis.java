/******************************************************************************
 * Copyright © 2013-2016 The Nxt Core Developers.                             *
 *                                                                            *
 * See the AUTHORS.txt, DEVELOPER-AGREEMENT.txt and LICENSE.txt files at      *
 * the top-level directory of this distribution for the individual copyright  *
 * holder information and the developer policies on copyright and licensing.  *
 *                                                                            *
 * Unless otherwise agreed in a custom licensing agreement, no part of the    *
 * Nxt software, including this file, may be copied, modified, propagated,    *
 * or distributed except according to the terms contained in the LICENSE.txt  *
 * file.                                                                      *
 *                                                                            *
 * Removal or modification of this copyright notice is prohibited.            *
 *                                                                            *
 ******************************************************************************/

  package xin;

 public final class Genesis {

     public static final long GENESIS_BLOCK_ID = Long.parseUnsignedLong("5886376434652814108");
     public static final long CREATOR_ID = Long.parseUnsignedLong("16362770385693468241");

     public static final byte[] CREATOR_PUBLIC_KEY = new byte[]{
       87, 60, -29, 27, -121, 26, -65, 50, -11, -36, -23, 37, 98, 21, 63, -16, 53, -124, 71, -95, 113, -95, 93, -111, 97, 83, -40, 76, 1, -107, -29, 122
     };

     public static final long[] GENESIS_RECIPIENTS = {
             Long.parseUnsignedLong("14982570416172345443"),
             Long.parseUnsignedLong("15099862080523557957")
     };

     public static final Long[] GENESIS_AMOUNTS = {
            8100000000L,
             900000000L
     };

     public static final byte[][] GENESIS_SIGNATURES = {
       { -7, -66, 76, -50, 69, -78, 13, 21, -125, 46, -98, -83, -46, -84, 71, 126, 16, 28, 61, 113, 117, 58, 113, 8, -128, -81, -72, -29, 104, -118, 42, 10, -126, -106, 69, -17, -27, -76, -91, 83, 38, 52, -103, 108, 92, -97, 66, -39, -25, -11, 107, 61, 123, -80, -11, 127, -78, 31, -67, -69, -11, -91, -43, -66 },
       { 104, -3, 43, -4, -47, 102, 72, -74, -12, -128, 12, 98, 105, 97, -37, -45, -79, 41, 50, 89, 30, -120, -76, -127, 36, -36, -32, -48, -43, -124, -117, 2, 74, -50, 85, -61, 51, -6, -101, 68, 64, -27, -7, -55, 13, -85, -17, -80, 32, 97, 5, 57, 54, -76, 55, 31, 123, -80, 109, 59, 119, 28, 56, -31 }
     };


     public static final byte[] GENESIS_BLOCK_SIGNATURE = new byte[]{
       52, -64, -51, -114, -41, 102, -15, 126, -56, 95, 126, 50, 76, -128, -36, -61, 5, 26, 73, 82, -7, 101, -64, 65, 17, 58, 60, 56, -90, -93, -109, 4, 35, -42, 104, 76, -34, 41, 67, 109, -54, -57, -84, 31, -58, -47, -35, -70, -2, 87, 94, 9, -82, -10, 86, -80, -38, 82, -13, -127, -108, 119, 106, 16
     };

     private Genesis() {
     } // never

 }
