# Clear Effects
execute as @a[nbt={ActiveEffects:[{Id:12b,Amplifier:10b}]},nbt=!{Inventory:[{Slot:100b,id:"omiam:sandia_alloy_boots",Count:1b},{Slot:101b,id:"omiam:sandia_alloy_leggings",Count:1b},{Slot:102b,id:"omiam:sandia_alloy_chestplate",Count:1b},{Slot:103b,id:"omiam:sandia_alloy_helmet",Count:1b}]}] run effect clear @s minecraft:fire_resistance
execute as @a[nbt={ActiveEffects:[{Id:12b,Amplifier:10b}]},nbt=!{Inventory:[{Slot:100b,id:"omiam:magma_boots",Count:1b},{Slot:101b,id:"omiam:magma_leggings",Count:1b},{Slot:102b,id:"omiam:magma_chestplate",Count:1b},{Slot:103b,id:"omiam:magma_helmet",Count:1b}]}] run effect clear @s minecraft:fire_resistance
execute as @a[nbt={ActiveEffects:[{Id:13b,Amplifier:10b}]},nbt=!{Inventory:[{Slot:100b,id:"omiam:diving_boots",Count:1b},{Slot:101b,id:"omiam:diving_leggings",Count:1b},{Slot:102b,id:"omiam:diving_chestplate",Count:1b},{Slot:103b,id:"omiam:diving_helmet",Count:1b}]}] run effect clear @s minecraft:water_breathing
execute as @a[nbt={ActiveEffects:[{Id:16b,Amplifier:10b}]},nbt=!{Inventory:[{Slot:100b,id:"omiam:diving_boots",Count:1b},{Slot:101b,id:"omiam:diving_leggings",Count:1b},{Slot:102b,id:"omiam:diving_chestplate",Count:1b},{Slot:103b,id:"omiam:diving_helmet",Count:1b}]}] run effect clear @s minecraft:night_vision

# Give Effects
execute as @a[nbt={Inventory:[{Slot:100b,id:"omiam:sandia_alloy_boots",Count:1b},{Slot:101b,id:"omiam:sandia_alloy_leggings",Count:1b},{Slot:102b,id:"omiam:sandia_alloy_chestplate",Count:1b},{Slot:103b,id:"omiam:sandia_alloy_helmet",Count:1b}]}] run effect give @s minecraft:fire_resistance 99999 10 true
execute as @a[nbt={Inventory:[{Slot:100b,id:"omiam:magma_boots",Count:1b},{Slot:101b,id:"omiam:magma_leggings",Count:1b},{Slot:102b,id:"omiam:magma_chestplate",Count:1b},{Slot:103b,id:"omiam:magma_helmet",Count:1b}]}] run effect give @s minecraft:fire_resistance 99999 10 true
execute as @a[nbt={Inventory:[{Slot:100b,id:"omiam:diving_boots",Count:1b},{Slot:101b,id:"omiam:diving_leggings",Count:1b},{Slot:102b,id:"omiam:diving_chestplate",Count:1b},{Slot:103b,id:"omiam:diving_helmet",Count:1b}]}] run effect give @s minecraft:water_breathing 99999 10 true
execute as @a[nbt={Inventory:[{Slot:100b,id:"omiam:diving_boots",Count:1b},{Slot:101b,id:"omiam:diving_leggings",Count:1b},{Slot:102b,id:"omiam:diving_chestplate",Count:1b},{Slot:103b,id:"omiam:diving_helmet",Count:1b}]}] run effect give @s minecraft:night_vision 99999 10 true

# Loop
schedule function omiam:tick 1s