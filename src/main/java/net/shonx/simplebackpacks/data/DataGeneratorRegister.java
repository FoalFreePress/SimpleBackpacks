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

package net.shonx.simplebackpacks.data;

import net.shonx.simplebackpacks.SimpleBackpacks;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = SimpleBackpacks.MODID, bus = Bus.MOD)
public class DataGeneratorRegister {

    @SubscribeEvent
    public static void onGatherdata(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        if (event.includeServer())
            genServer(generator, existingFileHelper);
        if (event.includeClient())
            genClient(generator, existingFileHelper);
        if (event.includeDev())
            genDev(generator, existingFileHelper);
        if (event.includeReports())
            genReports(generator, existingFileHelper);
    }

    private static void genServer(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        generator.addProvider(new RecipeGenerator(generator));
    }

    private static void genClient(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        generator.addProvider(new LanguageGenerator(generator));
        generator.addProvider(new ItemModelGenerator(generator, existingFileHelper));
    }

    private static void genDev(DataGenerator generator, ExistingFileHelper existingFileHelper) {

    }

    private static void genReports(DataGenerator generator, ExistingFileHelper existingFileHelper) {

    }
}
