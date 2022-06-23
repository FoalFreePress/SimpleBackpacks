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
import net.shonx.simplebackpacks.common.item.BackpackItems;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, SimpleBackpacks.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BackpackItems.LEATHER_BACKPACK.get(), "Leather Backpack");
        add(BackpackItems.IRON_BACKPACK.get(), "Iron Backpack");
        add(BackpackItems.GOLD_BACKPACK.get(), "Gold Backpack");
        add(BackpackItems.DIAMOND_BACKPACK.get(), "Diamond Backpack");
        add(BackpackItems.NETHERITE_BACKPACK.get(), "Netherite Backpack");
    }

}
