package typingsSlinky.videoJs.videoCoreMod.default.Component

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.videoJs.anon.Instantiable
import typingsSlinky.videoJs.anon.InstantiableClickableComponent
import typingsSlinky.videoJs.anon.InstantiableMenu
import typingsSlinky.videoJs.anon.InstantiableMenuButton
import typingsSlinky.videoJs.anon.InstantiableMenuItem
import typingsSlinky.videoJs.anon.InstantiableModalDialog
import typingsSlinky.videoJs.anon.InstantiableMouseTimeDisplay
import typingsSlinky.videoJs.anon.InstantiableSpacer
import typingsSlinky.videoJs.anon.InstantiableTimeToolTip
import typingsSlinky.videoJs.anon.TypeofComponent
import typingsSlinky.videoJs.anon.TypeofPlayer
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

@JSImport("video.js/dist/alt/video.core", "Component")
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
  def this(player: Player, options: js.UndefOr[scala.Nothing], ready: ReadyCallback) = this()
  def this(player: Player, options: ComponentOptions, ready: ReadyCallback) = this()
}

@JSImport("video.js/dist/alt/video.core", "Component")
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
        /* options */ js.UndefOr[scala.Nothing], 
        /* ready */ ReadyCallback, 
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
  def getComponent_Button(name: Button): Instantiable = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): InstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typingsSlinky.videoJs.videoJsStrings.Component): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): InstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): InstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): InstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): InstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): InstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typingsSlinky.videoJs.videoJsStrings.Player): TypeofPlayer = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): InstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): InstantiableTimeToolTip = js.native
  @JSName("getComponent")
  def getComponent_button(name: button_): Instantiable = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): InstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): InstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): InstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): InstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): InstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): InstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): TypeofPlayer = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): InstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): InstantiableTimeToolTip = js.native
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

