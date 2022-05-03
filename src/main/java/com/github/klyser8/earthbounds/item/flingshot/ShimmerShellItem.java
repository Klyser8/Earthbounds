package com.github.klyser8.earthbounds.item.flingshot;

import com.github.klyser8.earthbounds.entity.misc.ShimmerShellEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ShimmerShellItem extends Item implements Flingable {

    public ShimmerShellItem(Settings settings) {
        super(settings);
    }

    @Override
    public ProjectileEntity createFlingableEntity(World world, ItemStack stack, LivingEntity shooter) {
        Vec3d eyePos = shooter.getEyePos();
        Vec3d dir = shooter.getRotationVec(1).normalize();
        return new ShimmerShellEntity(
                eyePos.x + dir.x * 0.2,
                eyePos.y + dir.y * 0.2,
                eyePos.z + dir.z * 0.2, world, shooter);
    }

}
