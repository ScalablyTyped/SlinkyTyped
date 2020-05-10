package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait GamepadPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  val hasOrientation: scala.Boolean = js.native
  val hasPosition: scala.Boolean = js.native
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  val orientation: js.typedarray.Float32Array | Null = js.native
  val position: js.typedarray.Float32Array | Null = js.native
}

@JSGlobal("GamepadPose")
@js.native
object GamepadPose extends Instantiable0[GamepadPose]

