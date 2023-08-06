package boost;

import arc.*;
import mindustry.game.EventType.*;
import mindustry.input.Binding;
import mindustry.mod.*;

import static mindustry.Vars.*;

public class Main extends Mod{
    public static boolean boost = false;

    public Main(){
        Events.run(Trigger.update, () -> {
            if (Core.input.keyRelease(Binding.boost)){
                boost = !boost;
            }
            player.boosting = boost;
        });
    }

}