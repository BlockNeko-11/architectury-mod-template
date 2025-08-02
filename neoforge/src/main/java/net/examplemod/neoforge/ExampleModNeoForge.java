package net.examplemod.neoforge;

// import io.github.erha134.mc.sparklib.data.forge.SDataGenerationForge;
import net.examplemod.ExampleMod;
import net.examplemod.client.ExampleModClient;
// import net.examplemod.data.ExampleModDataGeneration;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge(IEventBus bus, Dist dist) {
        ExampleMod.init();

        if (dist.isClient()) {
            ExampleModClient.initClient();
        }

        bus.addListener(this::onDataGen);
    }

    private void onDataGen(GatherDataEvent e) {
        // ExampleModDataGeneration.initDataGen(SDataGenerationForge.create(ExampleMod.MOD_ID, e));
    }
}
