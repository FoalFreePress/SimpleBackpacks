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

// https://github.com/hanetzer helped write this class!
package net.shonx.simplebackpacks.common.item;

import net.shonx.simplebackpacks.SimpleBackpacks;
import net.shonx.simplebackpacks.common.BackpackType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BackpackItems {
    private static final Item.Properties BACKPACK_PROPS = new Item.Properties().defaultDurability(0).stacksTo(1).tab(ItemGroup.TAB_TOOLS);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleBackpacks.MODID);;

    public static final RegistryObject<ItemBackpack> LEATHER_BACKPACK = ITEMS.register("leather_backpack", () -> new ItemBackpack(BACKPACK_PROPS, BackpackType.LEATHER));
    public static final RegistryObject<ItemBackpack> IRON_BACKPACK = ITEMS.register("iron_backpack", () -> new ItemBackpack(BACKPACK_PROPS, BackpackType.IRON));
    public static final RegistryObject<ItemBackpack> GOLD_BACKPACK = ITEMS.register("gold_backpack", () -> new ItemBackpack(BACKPACK_PROPS, BackpackType.GOLD));
    public static final RegistryObject<ItemBackpack> DIAMOND_BACKPACK = ITEMS.register("diamond_backpack", () -> new ItemBackpack(BACKPACK_PROPS, BackpackType.DIAMOND));
    public static final RegistryObject<ItemBackpack> NETHERITE_BACKPACK = ITEMS.register("netherite_backpack", () -> new ItemBackpack(BACKPACK_PROPS, BackpackType.NETHERITE));

}
