package typingsSlinky.webvrApi

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

