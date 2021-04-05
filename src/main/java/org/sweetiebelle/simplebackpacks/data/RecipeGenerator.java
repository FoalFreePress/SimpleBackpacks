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

package org.sweetiebelle.simplebackpacks.data;

import java.util.function.Consumer;

import org.sweetiebelle.simplebackpacks.SimpleBackpacks;
import org.sweetiebelle.simplebackpacks.common.item.BackpackItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "SimpleBackpacks Recipe Generator";
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // @formatter:off
        // Leather Backpack
        ShapedRecipeBuilder.shaped(BackpackItems.LEATHER_BACKPACK.get())
        .define('W', ItemTags.WOOL)
        .define('L', Tags.Items.LEATHER)
        .define('C', Tags.Items.CHESTS_WOODEN)
        .pattern("WLW")
        .pattern("LCL")
        .pattern("WLW")
        .unlockedBy("has_item", has(Tags.Items.LEATHER))
        .save(consumer, SimpleBackpacks.of("leather_backpack"));

        // Iron Backpack
        SmithingRecipeBuilder.smithing(
                Ingredient.of(BackpackItems.LEATHER_BACKPACK.get()),
                Ingredient.of(Tags.Items.STORAGE_BLOCKS_IRON),
                BackpackItems.IRON_BACKPACK.get())
        .unlocks("has_leather_backpack", has(BackpackItems.LEATHER_BACKPACK.get()))
        .save(consumer, SimpleBackpacks.of("iron_backpack"));

        // Gold Backpack
        SmithingRecipeBuilder.smithing(
                Ingredient.of(BackpackItems.IRON_BACKPACK.get()),
                Ingredient.of(Tags.Items.STORAGE_BLOCKS_GOLD),
                BackpackItems.GOLD_BACKPACK.get())
        .unlocks("has_iron_backpack", has(BackpackItems.IRON_BACKPACK.get()))
        .save(consumer, SimpleBackpacks.of("gold_backpack"));

        // Diamond Backpack
        SmithingRecipeBuilder.smithing(
                Ingredient.of(BackpackItems.GOLD_BACKPACK.get()),
                Ingredient.of(Tags.Items.STORAGE_BLOCKS_DIAMOND),
                BackpackItems.DIAMOND_BACKPACK.get())
        .unlocks("has_gold_backpack", has(BackpackItems.GOLD_BACKPACK.get()))
        .save(consumer, SimpleBackpacks.of("diamond_backpack"));

        // Netherite Backpack
        SmithingRecipeBuilder.smithing(
                Ingredient.of(BackpackItems.DIAMOND_BACKPACK.get()),
                Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                BackpackItems.NETHERITE_BACKPACK.get())
        .unlocks("has_diamond_backpack", has(BackpackItems.DIAMOND_BACKPACK.get()))
        .save(consumer, SimpleBackpacks.of("netherite_backpack"));
        // @formatter:on
    }


}
