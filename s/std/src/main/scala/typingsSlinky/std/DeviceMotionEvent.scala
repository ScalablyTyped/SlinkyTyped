package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
@js.native
trait DeviceMotionEvent extends Event_ {
  val acceleration: DeviceMotionEventAcceleration | Null = js.native
  val accelerationIncludingGravity: DeviceMotionEventAcceleration | Null = js.native
  val interval: Double = js.native
  val rotationRate: DeviceMotionEventRotationRate | Null = js.native
}

@JSGlobal("DeviceMotionEvent")
@js.native
object DeviceMotionEvent
  extends Instantiable1[
      /* type */ java.lang.String, 
      org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
    ]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEventInit, 
      org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

