/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.gui.main.chat;

import net.java.sip.communicator.impl.gui.*;

/**
 * Defines the CSS style of an incoming chat message elements.
 *
 * @author Yana Stamcheva
 */
public class IncomingMessageStyle
{
    /**
     * The incoming message background image path.
     */
    private final static String INCOMING_MESSAGE_IMAGE_PATH
        = GuiActivator.getResources().getImageURL(
            "service.gui.lookandfeel.INCOMING_MESSAGE_BACKGROUND").toString();

    /**
     * The incoming message right image path.
     */
    private final static String INCOMING_MESSAGE_IMAGE_RIGHT_PATH
        = GuiActivator.getResources().getImageURL(
            "service.gui.lookandfeel.INCOMING_MESSAGE_BACKGROUND_RIGHT")
                .toString();

    /**
     * The incoming message indicator image path.
     */
    private final static String INCOMING_MESSAGE_INDICATOR_PATH
        = GuiActivator.getResources().getImageURL(
            "service.gui.lookandfeel.INCOMING_MESSAGE_INDICATOR").toString();

    /**
     * The incoming message round border image path.
     */
    private final static String INCOMING_MESSAGE_CURVES_PATH
        = GuiActivator.getResources().getImageURL(
            "service.gui.lookandfeel.INCOMING_MESSAGE_CURVES").toString();

    /**
     * The incoming message top image path.
     */
    private final static String INCOMING_MESSAGE_CURVES_TOP_PATH
        = GuiActivator.getResources().getImageURL(
            "service.gui.lookandfeel.INCOMING_MESSAGE_CURVES_TOP").toString();

    /**
     * Creates the global message style.
     *
     * @return the style attribute defining the global message style.
     */
    public static String createMessageStyle()
    {
        return "style=\""
                + "width:100%;"
                + "opacity:0.96;"
                + "\"";
    }

    /**
     * Creates the style of the table bubble right element.
     *
     * @return the style of the table bubble right element
     */
    public static String createTableBubbleMessageRightStyle()
    {
        return "style=\""
                + "width:8px;"
                + " background-image: url('"
                    +INCOMING_MESSAGE_IMAGE_RIGHT_PATH+"');"
                + " background-repeat: repeat-y;"
                + " background-position: top left;"
                + "\"";
    }

    /**
     * Creates the style of the table bubble (wrapping the message table).
     *
     * @return the style of the table bubble
     */
    public static String createTableBubbleStyle()
    {
        return "style=\""
                + "width:100%;"
                + " position:relative;"
                + "\"";
    }

    /**
     * Creates the style of the message table bubble.
     *
     * @return the style of the message table bubble
     */
    public static String createTableBubbleMessageStyle()
    {
        return "style=\""
                + "font-size:10px;"
                + " background-image: url('"+INCOMING_MESSAGE_IMAGE_PATH+"');"
                + " background-repeat: repeat-y;"
                + " background-position: top left;"
                + "\"";
    }

    /**
     * Creates the style of the table buuble bottom left corner.
     *
     * @return the style of the table buuble bottom left corner
     */
    public static String createTableBubbleBlStyle()
    {
        return "style=\""
                + "height:10px;"
                + " background-image: url('"+INCOMING_MESSAGE_CURVES_PATH+"');"
                + " background-repeat: no-repeat;"
                + " background-position: 0px -20px;"
                + "\"";
    }

    /**
     * Creates the style of the table buuble bottom right corner.
     *
     * @return the style of the table buuble bottom right corner
     */
    public static String createTableBubbleBrStyle()
    {
        return "style=\""
                + "width:8px;"
                + " height:10px;"
                + " background-image: url('"+INCOMING_MESSAGE_CURVES_PATH+"');"
                + " background-repeat: no-repeat;"
                + " background-position: -2999px -20px;"
                + "\"";
    }

    /**
     * Creates the style of the table buuble top left corner.
     *
     * @return the style of the table buuble top left corner
     */
    public static String createTableBubbleTlStyle()
    {
        return "style=\""
                + "height:23px;"
                + " background-image: url('"
                    +INCOMING_MESSAGE_CURVES_TOP_PATH+"');"
                + " background-repeat: no-repeat;"
                + " background-position: top left;"
                + "\"";
    }

    /**
     * Creates the style of the table buuble top right corner.
     *
     * @return the style of the table buuble top right corner
     */
    public static String createTableBubbleTrStyle()
    {
        return "style=\""
                + "width:6px;"
                + " height:23px;"
                + " background-image: url('"
                    +INCOMING_MESSAGE_CURVES_TOP_PATH+"');"
                + " background-repeat: no-repeat;"
                + " background-position: -2999px 0px;"
                + "\"";
    }

    /**
     * Creates the style of the indicator pointing to the avatar image.
     *
     * @return the style of the indicator pointing to the avatar image
     */
    public static String createIndicatorStyle()
    {
        return "style =\""
                + "width:9px;"
                + " height:19px;"
                + " background-image: url('"
                + INCOMING_MESSAGE_INDICATOR_PATH+"');"
                + " background-repeat: no-repeat;"
                + " background-position: top right;"
                + "\"";
    }

    /**
     * Creates the style of the avatar image.
     *
     * @return the style of the avatar image
     */
    public static String createAvatarStyle()
    {
        return "style=\"width:26px;"
                + " height:26px;"
                + " float:left;\"";
    }
}