package net.minecraft2.util;

import net.minecraft2.util.registry.RegistryNamespaced;

public class SoundEvent {
	public static final RegistryNamespaced<ResourceLocation, SoundEvent> REGISTRY
		= new RegistryNamespaced<ResourceLocation, SoundEvent>();
	private final ResourceLocation soundName;
	private static int soundEventId;
	public SoundEvent(ResourceLocation soundName) {
		this.soundName = soundName;
	}
	public static void registerSounds() {
		registerSound("ambient.cave");
		registerSound("block.stone.step");
		registerSound("block.stone.place");
		registerSound("block.stone.hit");
		registerSound("block.stone.fall");
		registerSound("block.stone.break");
	}
	private static void registerSound(String soundName) {
		ResourceLocation resourceLocation = new ResourceLocation(soundName);
		REGISTRY.register(soundEventId++, resourceLocation, new SoundEvent(resourceLocation));
	}
}
