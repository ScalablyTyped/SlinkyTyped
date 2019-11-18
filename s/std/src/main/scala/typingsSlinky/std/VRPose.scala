package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait VRPose extends js.Object {
  val angularAcceleration: scala.scalajs.js.typedarray.Float32Array | Null
  val angularVelocity: scala.scalajs.js.typedarray.Float32Array | Null
  val linearAcceleration: scala.scalajs.js.typedarray.Float32Array | Null
  val linearVelocity: scala.scalajs.js.typedarray.Float32Array | Null
  val orientation: scala.scalajs.js.typedarray.Float32Array | Null
  val position: scala.scalajs.js.typedarray.Float32Array | Null
  val timestamp: Double
}

@JSGlobal("VRPose")
@js.native
object VRPose extends Instantiable0[VRPose]

