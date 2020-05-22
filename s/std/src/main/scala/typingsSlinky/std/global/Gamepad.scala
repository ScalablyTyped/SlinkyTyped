package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.experimental.gamepad.GamepadMappingType
import typingsSlinky.std.GamepadHand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Gamepad")
@js.native
class Gamepad ()
  extends typingsSlinky.std.Gamepad {
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  /* CompleteClass */
  override val buttons: js.Array[org.scalajs.dom.experimental.gamepad.GamepadButton] = js.native
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  /* CompleteClass */
  override val hapticActuators: js.Array[typingsSlinky.std.GamepadHapticActuator] = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val index: Double = js.native
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  /* CompleteClass */
  override val pose: typingsSlinky.std.GamepadPose | Null = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("Gamepad")
@js.native
object Gamepad
  extends Instantiable0[org.scalajs.dom.experimental.gamepad.Gamepad]

