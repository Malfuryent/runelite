package net.runelite.client.plugins.interfacestyles;

import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.plugins.interfacestyles.Skin;

@Singleton
public class InterfaceStylesSericeImpl implements InterfaceStylesService
{
    private final InterfaceStylesPlugin plugin;

    @Inject
    private InterfaceStylesSericeImpl(InterfaceStylesPlugin plugin){this.plugin = plugin;}

    @Override
    public Skin getSkin()
    {
        return plugin.getSkin();
    }
}
