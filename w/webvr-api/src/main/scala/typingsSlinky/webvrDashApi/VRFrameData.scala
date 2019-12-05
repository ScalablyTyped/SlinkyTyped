package typingsSlinky.webvrDashApi

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRFrameData extends js.Object {
  val leftProjectionMatrix: scala.scalajs.js.typedarray.Float32Array
  val leftViewMatrix: scala.scalajs.js.typedarray.Float32Array
  val pose: VRPose
  val rightProjectionMatrix: scala.scalajs.js.typedarray.Float32Array
  val rightViewMatrix: scala.scalajs.js.typedarray.Float32Array
  val timestamp: Double
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData extends Instantiable0[VRFrameData]

