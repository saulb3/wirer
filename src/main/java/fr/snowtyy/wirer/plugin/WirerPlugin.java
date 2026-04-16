package fr.snowtyy.wirer.plugin;

import fr.snowtyy.wirer.ServiceCollection;
import fr.snowtyy.wirer.Wirer;
import org.bukkit.plugin.Plugin;

import java.util.Optional;

/**
 * @author Snowtyy
 */
public interface WirerPlugin extends Plugin {

    void registerServices(ServiceCollection services);

    default <T> Optional<T> getService(Class<T> tClass) {
        return Wirer.getProvider(this).get(tClass);
    }

}
