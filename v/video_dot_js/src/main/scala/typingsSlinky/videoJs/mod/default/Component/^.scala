package typingsSlinky.videoJs.mod.default.Component

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.videoJs.AnonInstantiable
import typingsSlinky.videoJs.AnonInstantiableClickableComponent
import typingsSlinky.videoJs.AnonInstantiableMenu
import typingsSlinky.videoJs.AnonInstantiableMenuButton
import typingsSlinky.videoJs.AnonInstantiableMenuItem
import typingsSlinky.videoJs.AnonInstantiableModalDialog
import typingsSlinky.videoJs.AnonInstantiableMouseTimeDisplay
import typingsSlinky.videoJs.AnonInstantiableSpacer
import typingsSlinky.videoJs.AnonInstantiableTimeToolTip
import typingsSlinky.videoJs.TypeofComponent
import typingsSlinky.videoJs.TypeofPlayer
import typingsSlinky.videoJs.mod.videojs.Component.ReadyCallback
import typingsSlinky.videoJs.mod.videojs.ComponentOptions
import typingsSlinky.videoJs.mod.videojs.Player
import typingsSlinky.videoJs.videoJsStrings.Button
import typingsSlinky.videoJs.videoJsStrings.ClickableComponent
import typingsSlinky.videoJs.videoJsStrings.Menu
import typingsSlinky.videoJs.videoJsStrings.MenuButton
import typingsSlinky.videoJs.videoJsStrings.MenuItem
import typingsSlinky.videoJs.videoJsStrings.ModalDialog
import typingsSlinky.videoJs.videoJsStrings.MouseTimeDisplay
import typingsSlinky.videoJs.videoJsStrings.Spacer
import typingsSlinky.videoJs.videoJsStrings.TimeTooltip
import typingsSlinky.videoJs.videoJsStrings.button_
import typingsSlinky.videoJs.videoJsStrings.clickablecomponent_
import typingsSlinky.videoJs.videoJsStrings.component_
import typingsSlinky.videoJs.videoJsStrings.menu_
import typingsSlinky.videoJs.videoJsStrings.menubutton_
import typingsSlinky.videoJs.videoJsStrings.menuitem_
import typingsSlinky.videoJs.videoJsStrings.modaldialog_
import typingsSlinky.videoJs.videoJsStrings.mouseTimeDisplay_
import typingsSlinky.videoJs.videoJsStrings.player_
import typingsSlinky.videoJs.videoJsStrings.spacer_
import typingsSlinky.videoJs.videoJsStrings.timeTooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Component")
@js.native
class ^ protected ()
  extends typingsSlinky.videoJs.mod.videojs.Component {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [options.children]
    *        An array of children objects to intialize this component with. Children objects have
    *        a name property that will be used if more than one component of the same type needs to be
    *        added.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  def this(player: Player) = this()
  def this(player: Player, options: ComponentOptions) = this()
  def this(player: Player, options: ComponentOptions, ready: ReadyCallback) = this()
}

@JSImport("video.js", "Component")
@js.native
object ^
  extends TopLevel[
      (/**
  * Creates an instance of this class.
  *
  * @param player
  *        The `Player` that this class should be attached to.
  *
  * @param [options]
  *        The key/value store of player options.
  *
  * @param [options.children]
  *        An array of children objects to intialize this component with. Children objects have
  *        a name property that will be used if more than one component of the same type needs to be
  *        added.
  *
  * @param [ready]
  *        Function that gets called when the `Component` is ready.
  */
Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.Component]) with (Instantiable2[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        typingsSlinky.videoJs.mod.videojs.Component
      ]) with (Instantiable3[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        /* ready */ ReadyCallback, 
        typingsSlinky.videoJs.mod.videojs.Component
      ])
    ] {
  def getComponent(name: String): TypeofComponent = js.native
  /**
    * Get a `Component` based on the name it was registered with.
    *
    * @param name
    *        The Name of the component to get.
    *
    * @return The `Component` that got registered under the given name.
    *
    * @deprecated In `videojs` 6 this will not return `Component`s that were not
    *             registered using {@link Component.registerComponent}. Currently we
    *             check the global `videojs` object for a `Component` name and
    *             return that if it exists.
    */
  @JSName("getComponent")
  def getComponent_Button(name: Button): AnonInstantiable = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): AnonInstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typingsSlinky.videoJs.videoJsStrings.Component): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): AnonInstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): AnonInstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): AnonInstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): AnonInstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): AnonInstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typingsSlinky.videoJs.videoJsStrings.Player): TypeofPlayer = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): AnonInstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): AnonInstantiableTimeToolTip = js.native
  @JSName("getComponent")
  def getComponent_button(name: button_): AnonInstantiable = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): AnonInstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): AnonInstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): AnonInstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): AnonInstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): AnonInstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): AnonInstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): TypeofPlayer = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): AnonInstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): AnonInstantiableTimeToolTip = js.native
  /**
    * Register a `Component` with `videojs` given the name and the component.
    *
    * > NOTE: {@link Tech}s should not be registered as a `Component`. {@link Tech}s
    *         should be registered using {@link Tech.registerTech} or
    *         {@link videojs:videojs.registerTech}.
    *
    * > NOTE: This function can also be seen on videojs as
    *         {@link videojs:videojs.registerComponent}.
    *
    * @param name
    *        The name of the `Component` to register.
    *
    * @param ComponentToRegister
    *        The `Component` class to register.
    *
    * @return The `Component` that was registered.
    */
  def registerComponent(name: String, ComponentToRegister: js.Any): js.Any = js.native
}

