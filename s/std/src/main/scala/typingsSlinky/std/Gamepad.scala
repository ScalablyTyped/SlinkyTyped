package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("Gamepad")
@js.native
object Gamepad
  extends Instantiable0[org.scalajs.dom.experimental.gamepad.Gamepad]

