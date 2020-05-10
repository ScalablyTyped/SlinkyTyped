package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
@js.native
trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView = js.native
  val offset: js.typedarray.Float32Array = js.native
  val renderHeight: Double = js.native
  val renderWidth: Double = js.native
}

@JSGlobal("VREyeParameters")
@js.native
object VREyeParameters extends Instantiable0[VREyeParameters]

