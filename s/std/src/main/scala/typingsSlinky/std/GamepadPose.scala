package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait GamepadPose extends js.Object {
  val angularAcceleration: scala.scalajs.js.typedarray.Float32Array | Null
  val angularVelocity: scala.scalajs.js.typedarray.Float32Array | Null
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val linearAcceleration: scala.scalajs.js.typedarray.Float32Array | Null
  val linearVelocity: scala.scalajs.js.typedarray.Float32Array | Null
  val orientation: scala.scalajs.js.typedarray.Float32Array | Null
  val position: scala.scalajs.js.typedarray.Float32Array | Null
}

@JSGlobal("GamepadPose")
@js.native
object GamepadPose extends Instantiable0[GamepadPose]

