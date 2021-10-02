package net.fabricmc.example;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExampleBlock extends Block {
    public ExampleBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            world.playSound(player, player.getX(), player.getY(), player.getZ(), ExampleMod.PROF_NORMAN_SOUND_1_EVENT, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        return ActionResult.SUCCESS;
    }
}
