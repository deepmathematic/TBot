import jdk.nashorn.internal.parser.Token;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.util.ArrayList;

public class TBot {
    public static void main(String[] args) throws  Exception {
        JDA jda = new JDABuilder("NjUyMzg2NzQ1NDAwNDI2NTI4.XeuGIw.kzIM-g2WMgExiFIvjcu-yaV6-mk").build();
        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new PrayTimeEvent());
        jda.addEventListener(new EmbedEvent());
        jda.addEventListener(new PlayCommand());

    }
}
