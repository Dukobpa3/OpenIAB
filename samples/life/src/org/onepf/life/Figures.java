package org.onepf.life;

/**
 * Package org.onepf.life.
 * Author: Ruslan Sayfutdinov
 * Date: 13/03/13
 */
public abstract class Figures {
    public static final int[][] glider = new int[][]
            {{0, 1, 0},
             {0, 0, 1},
             {1, 1, 1}};

    public static final int[][] bigGlider = new int[][]
            {{0, 0, 0, 1, 0},
             {0, 0, 0, 0, 1},
             {1, 0, 0, 0, 1},
             {0, 1, 1, 1, 1}};

    public static final int[][] periodic = new int[][]
            {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
             {1, 1, 0, 1, 1, 1, 1, 0, 1, 1},
             {0, 0, 1, 0, 0, 0, 0, 1, 0, 0}};

    public static final int[][] robot = new int[][]
            {{0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0},
             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
             {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
             {1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1},
             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
             {0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0}};
}
