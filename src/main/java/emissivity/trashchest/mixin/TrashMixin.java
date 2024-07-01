package emissivity.trashchest.mixin;

import emissivity.trashchest.TrashChest;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LootableContainerBlockEntity.class)
public class TrashMixin {
	@Inject(at = @At("HEAD"), method = "setStack")
	public void trashchest$deleteItem(int slot, ItemStack stack, CallbackInfo info) {
		LootableContainerBlockEntity blockEntity = (LootableContainerBlockEntity) (Object) this;
		if(blockEntity != null){
			if (blockEntity.getName().getString().equals("Trash")) {
				if(TrashChest.LOGGING)
					TrashChest.LOGGER.info("Deleted item {}", stack.getItem().getName());
				stack.setCount(0);
			}
		}
	}
}