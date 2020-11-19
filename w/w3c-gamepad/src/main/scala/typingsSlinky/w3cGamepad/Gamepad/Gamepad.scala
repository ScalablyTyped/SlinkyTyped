package typingsSlinky.w3cGamepad.Gamepad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gamepad extends js.Object {
  
  /**
    * Array of values for all axes of the gamepad. All axis values must be linearly normalized to the range [-1.0 .. 1.0]. As appropriate, -1.0 should correspond to "up" or "left", and 1.0 should correspond to "down" or "right". Axes that are drawn from a 2D input device should appear next to each other in the axes array, X then Y. It is recommended that axes appear in decreasing order of importance, such that element 0 and 1 typically represent the X and Y axis of a directional stick.
    * @readonly
    */
  var axes: js.Array[Double] = js.native
  
  /**
    * Array of values for all buttons of the gamepad. All button values must be linearly normalized to the range [0.0 .. 1.0]. 0.0 must mean fully unpressed, and 1.0 must mean fully pressed. It is recommended that buttons appear in decreasing importance such that the primary button, secondary button, tertiary button, and so on appear as elements 0, 1, 2, ... in the buttons array.
    * @readonly
    */
  var buttons: js.Array[GamepadButton] = js.native
  
  /**
    * Indicates whether the physical device represented by this object is still connected to the system. When a gamepad becomes unavailable, whether by being physically disconnected, powered off or otherwise unusable, the connected attribute must be set to false.
    * @readonly
    */
  var connected: Boolean = js.native
  
  /**
    * An identification string for the gamepad. This string identifies the brand or style of connected gamepad device. Typically, this will include the USB vendor and a product ID.
    * @readonly
    */
  var id: String = js.native
  
  /**
    * The index of the gamepad in the Navigator. When multiple gamepads are connected to a user agent, indices must be assigned on a first-come, first-serve basis, starting at zero. If a gamepad is disconnected, previously assigned indices must not be reassigned to gamepads that continue to be connected. However, if a gamepad is disconnected, and subsequently the same or a different gamepad is then connected, index entries must be reused.
    * @readonly
    */
  var index: Double = js.native
  
  /**
    * The mapping in use for this device. If the user agent has knowledge of the layout of the device, then it should indicate that a mapping is in use by setting this property to a known mapping name. Currently the only known mapping is "standard", which corresponds to the Standard Gamepad layout. If the user agent does not have knowledge of the device layout and is simply providing the controls as represented by the driver in use, then it must set the mapping property to an empty string.
    * @readonly
    */
  var mapping: String = js.native
  
  /**
    * Last time the data for this gamepad was updated. Timestamp is a monotonically increasing value that allows the author to determine if the axes and button data have been updated from the hardware, relative to a previously saved timestamp.
    * @readonly
    */
  var timestamp: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[GamepadButton],
    connected: Boolean,
    id: String,
    index: Double,
    mapping: String,
    timestamp: Double
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class GamepadOps[Self <: typingsSlinky.w3cGamepad.Gamepad.Gamepad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxesVarargs(value: Double*): Self = this.set("axes", js.Array(value :_*))
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: GamepadButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[GamepadButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
