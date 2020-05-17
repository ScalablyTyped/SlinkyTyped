package typingsSlinky.winrtUwp.global.Windows.Gaming

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.gamepadadded
import typingsSlinky.winrtUwp.winrtUwpStrings.gamepadremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to game controller input. */
@JSGlobal("Windows.Gaming.Input")
@js.native
object Input extends js.Object {
  /** Represents a game controller. */
  @js.native
  abstract class Gamepad ()
    extends typingsSlinky.winrtUwp.Windows.Gaming.Input.Gamepad
  
  /** Contains information about an audio headset attached to a gamepad. */
  @js.native
  abstract class Headset ()
    extends typingsSlinky.winrtUwp.Windows.Gaming.Input.Headset
  
  /* static members */
  @js.native
  object Gamepad extends js.Object {
    /** The list of all connected gamepads. */
    var gamepads: IVectorView[typingsSlinky.winrtUwp.Windows.Gaming.Input.Gamepad] = js.native
    /** Signals when a new gamepad is connected. */
    @JSName("ongamepadadded")
    var ongamepadadded_Original: EventHandler[_] = js.native
    /** Signals when a gamepad is disconnected. */
    @JSName("ongamepadremoved")
    var ongamepadremoved_Original: EventHandler[_] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
    /** Signals when a new gamepad is connected. */
    def ongamepadadded(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Signals when a gamepad is disconnected. */
    def ongamepadremoved(ev: js.Any with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
  }
  
  /** Specifies the button type. */
  @js.native
  object GamepadButtons extends js.Object {
    /* 3 */ val a: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.a with Double = js.native
    /* 4 */ val b: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.b with Double = js.native
    /* 8 */ val dpadDown: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadDown with Double = js.native
    /* 9 */ val dpadLeft: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft with Double = js.native
    /* 10 */ val dpadRight: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadRight with Double = js.native
    /* 7 */ val dpadUp: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadUp with Double = js.native
    /* 11 */ val leftShoulder: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder with Double = js.native
    /* 13 */ val leftThumbstick: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick with Double = js.native
    /* 1 */ val menu: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.menu with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.none with Double = js.native
    /* 12 */ val rightShoulder: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder with Double = js.native
    /* 14 */ val rightThumbstick: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick with Double = js.native
    /* 2 */ val view: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.view with Double = js.native
    /* 5 */ val x: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.x with Double = js.native
    /* 6 */ val y: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.y with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons with Double] = js.native
  }
  
}

