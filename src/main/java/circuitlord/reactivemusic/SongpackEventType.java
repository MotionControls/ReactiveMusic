package circuitlord.reactivemusic;

public enum SongpackEventType {

    MAIN_MENU,
    CREDITS,    //  TODO

    HOME,   //  TODO

    // Events
    BOSS,   //  TODO, Intended to activate when a boss is spawned.
            //  Not sure how I'll check for this, but atm thinking of checking if a hp bar is active.
            //  Not sure how to check for that but I'm sure I'll figure it out.

    // Time
    DAY,
    NIGHT,
    SUNRISE,
    SUNSET,

    // Weather
    RAIN,
    SNOW,   //  TODO

    // Dimension
    NETHER,
    END,
    OVERWORLD,

    // World Height
    UNDERWATER,
    UNDERGROUND,
    DEEP_UNDERGROUND,
    DEEP_MAX,   //  TODO, Intended to activate when you hit roughly the lowest possible height.
    HIGH_UP,
    HIGH_MAX,   //  TODO, Intended to activate when you hit the max possible height.

    // Entities
    MINECART,
    BOAT,
    HORSE,
    PIG,

    //Actions
    FISHING,
    DYING,
    PUMPKINHEAD,    //  TODO, Intended to activate when you put on a pumpkin.

    // Biomes
    // https://minecraft.fandom.com/wiki/Biome/ID
    FOREST,
    MOUNTAIN,
    DESERT, //  TODO
    BEACH,
    VOID,   //  TODO: Void :)
    PLAINS, //  TODO: Plains, Sunflower Plains
    SNOW_PLAINS,    //  TODO: Snowy Plains, Ice Spikes
    SWAMP,  //  TODO: Swamp, Mangrove Swamp
    SNOW_FOREST,    //  TODO: Snowy Taiga, Grove

    // Achievments
    //  TODO

    GENERIC
}
