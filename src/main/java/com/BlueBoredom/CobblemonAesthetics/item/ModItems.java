package com.BlueBoredom.CobblemonAesthetics.item;

import com.BlueBoredom.CobblemonAesthetics.CobblemonAesth;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonAesth.MODID);

    public static final DeferredItem<Item> PINSIRCARDCA = ITEMS.register("pinsir_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCYTHERCARDCA = ITEMS.register("scyther_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULBASAURCARDCA = ITEMS.register("bulbasaur_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IVYSAURCARDCA = ITEMS.register("ivysaur_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VENUSAURCARDCA = ITEMS.register("venusaur_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIDOQUEENCARDCA = ITEMS.register("nidoqueen_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHARMANDERCARDCA = ITEMS.register("charmander_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHARMELEONCARDCA = ITEMS.register("charmeleon_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHARIZARDCARDCA = ITEMS.register("charizard_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PONYTACARDCA = ITEMS.register("ponyta_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAPIDASHCARDCA = ITEMS.register("rapidash_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLTRESCARDCA = ITEMS.register("moltres_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SQUIRTLECARDCA = ITEMS.register("squirtle_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARTORTLECARDCA = ITEMS.register("wartortle_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLASTOISECARDCA = ITEMS.register("blastoise_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARYUCARDCA = ITEMS.register("staryu_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARMIECARDCA = ITEMS.register("starmie_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARTICUNOCARDCA = ITEMS.register("articuno_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GASTLYCARDCA = ITEMS.register("gastly_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAUNTERCARDCA = ITEMS.register("haunter_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GENGARCARDCA = ITEMS.register("gengar_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLOWPOKECARDCA = ITEMS.register("slowpoke_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLOWBROCARDCA = ITEMS.register("slowbro_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEWTWOCARDCA = ITEMS.register("mewtwo_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHANSEYCARDCA = ITEMS.register("chansey_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRAGONITECARDCA = ITEMS.register("dragonite_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EEVEECARDCA = ITEMS.register("eevee_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KANGASKHANCARDCA = ITEMS.register("kangaskhan_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUKCARDCA = ITEMS.register("muk_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SNORLAXCARDCA = ITEMS.register("snorlax_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIKACHUCARDCA = ITEMS.register("pikachu_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAICHUCARDCA = ITEMS.register("raichu_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNEMITECARDCA = ITEMS.register("magnemite_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JOLTEONCARDCA = ITEMS.register("jolteon_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTABUZZCARDCA = ITEMS.register("electabuzz_cardca",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZAPDOSCARDCA = ITEMS.register("zapdos_cardca",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
