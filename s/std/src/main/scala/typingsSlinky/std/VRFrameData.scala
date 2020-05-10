package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
@js.native
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: js.typedarray.Float32Array = js.native
  val leftViewMatrix: js.typedarray.Float32Array = js.native
  val pose: VRPose = js.native
  val rightProjectionMatrix: js.typedarray.Float32Array = js.native
  val rightViewMatrix: js.typedarray.Float32Array = js.native
  val timestamp: Double = js.native
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData extends Instantiable0[VRFrameData]

