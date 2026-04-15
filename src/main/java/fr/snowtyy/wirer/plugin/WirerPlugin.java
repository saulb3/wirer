package fr.snowtyy.wirer.plugin;

import fr.snowtyy.wirer.ServiceCollection;
import org.bukkit.plugin.Plugin;

/**
 * @author Snowtyy
 */
public interface WirerPlugin extends Plugin {

    void registerServices(ServiceCollection services);

}
