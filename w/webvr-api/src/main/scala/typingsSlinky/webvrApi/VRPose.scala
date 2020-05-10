package typingsSlinky.webvrApi

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  val orientation: js.typedarray.Float32Array | Null = js.native
  val position: js.typedarray.Float32Array | Null = js.native
  val timestamp: Double = js.native
}

@JSGlobal("VRPose")
@js.native
object VRPose extends Instantiable0[VRPose]

