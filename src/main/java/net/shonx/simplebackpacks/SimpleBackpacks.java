/*
 * MIT License
 *
 * Copyright (c) 2020-2021 shroomdog27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.shonx.simplebackpacks;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.shonx.simplebackpacks.common.container.BackpackContainerTypes;
import net.shonx.simplebackpacks.common.item.BackpackItems;
import net.shonx.simplebackpacks.common.sounds.BackpackSounds;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimpleBackpacks.MODID)
@EventBusSubscriber(modid = SimpleBackpacks.MODID, bus = Bus.MOD)
public class SimpleBackpacks {

    public static final String MODID = "simplebackpacks";
    public static final Logger LOG = LogManager.getLogger();

    public SimpleBackpacks() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        BackpackItems.ITEMS.register(modBus);
        BackpackContainerTypes.CONTAINERS.register(modBus);
        BackpackSounds.SOUNDS.register(modBus);
    }

    public static ResourceLocation of(String name) {
        return new ResourceLocation(MODID, Objects.requireNonNull(name));
    }
}
