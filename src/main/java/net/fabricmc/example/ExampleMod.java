package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	public static final ExampleBlock EXAMPLE_BLOCK = new ExampleBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));

	public static final Identifier PROF_NORMAN_SOUND_1_ID = new Identifier("tutorial:profnorman1");
	public static SoundEvent PROF_NORMAN_SOUND_1_EVENT = new SoundEvent(PROF_NORMAN_SOUND_1_ID);
//
//	public static final Identifier PROF_NORMAN_SOUND_2_ID = new Identifier("tutorial:profnorman2");
//	public static SoundEvent PROF_NORMAN_SOUND_2_EVENT = new SoundEvent(PROF_NORMAN_SOUND_2_ID);

	public static final Identifier PROF_NORMAN_SOUND_3_ID = new Identifier("tutorial:profnorman3");
	public static SoundEvent PROF_NORMAN_SOUND_3_EVENT = new SoundEvent(PROF_NORMAN_SOUND_3_ID);

	@Override
	public void onInitialize() {
		Registry.register(
				Registry.BLOCK,
				new Identifier("tutorial", "example_block"),
				EXAMPLE_BLOCK);

		Registry.register(
				Registry.ITEM,
				new Identifier("tutorial", "example_block"),
				new BlockItem(EXAMPLE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

		Registry.register(Registry.SOUND_EVENT, PROF_NORMAN_SOUND_1_ID, PROF_NORMAN_SOUND_1_EVENT);
//		Registry.register(Registry.SOUND_EVENT, PROF_NORMAN_SOUND_2_ID, PROF_NORMAN_SOUND_2_EVENT);
		Registry.register(Registry.SOUND_EVENT, PROF_NORMAN_SOUND_3_ID, PROF_NORMAN_SOUND_3_EVENT);
	}
}
