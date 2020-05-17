package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
@js.native
trait Gamepad extends js.Object {
  val axes: js.Array[Double] = js.native
  val buttons: js.Array[org.scalajs.dom.experimental.gamepad.GamepadButton] = js.native
  val connected: scala.Boolean = js.native
  val hand: GamepadHand = js.native
  val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  val id: java.lang.String = js.native
  val index: Double = js.native
  val mapping: org.scalajs.dom.experimental.gamepad.GamepadMappingType = js.native
  val pose: GamepadPose | Null = js.native
  val timestamp: Double = js.native
}

object Gamepad {
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[org.scalajs.dom.experimental.gamepad.GamepadButton],
    connected: scala.Boolean,
    hand: GamepadHand,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: org.scalajs.dom.experimental.gamepad.GamepadMappingType,
    timestamp: Double
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  @scala.inline
  implicit class GamepadOps[Self <: org.scalajs.dom.experimental.gamepad.Gamepad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[org.scalajs.dom.experimental.gamepad.GamepadButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnected(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHand(value: GamepadHand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHapticActuators(value: js.Array[GamepadHapticActuator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hapticActuators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapping(value: org.scalajs.dom.experimental.gamepad.GamepadMappingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPose(value: GamepadPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(null)
        ret
    }
  }
  
}

