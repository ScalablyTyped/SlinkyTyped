package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
@js.native
trait Touch extends js.Object {
  val altitudeAngle: Double = js.native
  val azimuthAngle: Double = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val force: Double = js.native
  val identifier: Double = js.native
  val pageX: Double = js.native
  val pageY: Double = js.native
  val radiusX: Double = js.native
  val radiusY: Double = js.native
  val rotationAngle: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val target: org.scalajs.dom.raw.EventTarget = js.native
  val touchType: TouchType = js.native
}

@JSGlobal("Touch")
@js.native
object Touch
  extends Instantiable1[/* touchInitDict */ TouchInit, org.scalajs.dom.raw.Touch]

