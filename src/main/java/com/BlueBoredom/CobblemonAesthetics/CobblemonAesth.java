package com.BlueBoredom.CobblemonAesthetics;

import com.BlueBoredom.CobblemonAesthetics.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CobblemonAesth.MODID)
public class CobblemonAesth {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "bluescobbleaesthetics";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CobblemonAesth(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.PINSIRCARDCA);
            event.accept(ModItems.SCYTHERCARDCA);
            event.accept(ModItems.BULBASAURCARDCA);
            event.accept(ModItems.IVYSAURCARDCA);
            event.accept(ModItems.VENUSAURCARDCA);
            event.accept(ModItems.NIDOQUEENCARDCA);
            event.accept(ModItems.CHARMANDERCARDCA);
            event.accept(ModItems.CHARMELEONCARDCA);
            event.accept(ModItems.CHARIZARDCARDCA);
            event.accept(ModItems.PONYTACARDCA);
            event.accept(ModItems.RAPIDASHCARDCA);
            event.accept(ModItems.MOLTRESCARDCA);
            event.accept(ModItems.SQUIRTLECARDCA);
            event.accept(ModItems.WARTORTLECARDCA);
            event.accept(ModItems.BLASTOISECARDCA);
            event.accept(ModItems.STARYUCARDCA);
            event.accept(ModItems.STARMIECARDCA);
            event.accept(ModItems.ARTICUNOCARDCA);
            event.accept(ModItems.GASTLYCARDCA);
            event.accept(ModItems.HAUNTERCARDCA);
            event.accept(ModItems.GENGARCARDCA);
            event.accept(ModItems.SLOWPOKECARDCA);
            event.accept(ModItems.SLOWBROCARDCA);
            event.accept(ModItems.MEWTWOCARDCA);
            event.accept(ModItems.CHANSEYCARDCA);
            event.accept(ModItems.DRAGONITECARDCA);
            event.accept(ModItems.EEVEECARDCA);
            event.accept(ModItems.KANGASKHANCARDCA);
            event.accept(ModItems.MUKCARDCA);
            event.accept(ModItems.SNORLAXCARDCA);
            event.accept(ModItems.PIKACHUCARDCA);
            event.accept(ModItems.RAICHUCARDCA);
            event.accept(ModItems.JOLTEONCARDCA);
            event.accept(ModItems.MAGNEMITECARDCA);
            event.accept(ModItems.ELECTABUZZCARDCA);
            event.accept(ModItems.ZAPDOSCARDCA);
            event.accept(ModItems.AERODACTYLCARDCA);
            event.accept(ModItems.HITMONLEECARDCA);
            event.accept(ModItems.DIGLETCARDCA);
            event.accept(ModItems.DUGTRIOCARDCA);
            event.accept(ModItems.MACHOKECARDCA);
            event.accept(ModItems.MACHAMPCARDCA);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
