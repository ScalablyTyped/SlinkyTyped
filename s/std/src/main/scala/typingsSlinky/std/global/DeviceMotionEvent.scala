package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEventInit
import typingsSlinky.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEvent protected ()
  extends typingsSlinky.std.DeviceMotionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
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
      /* eventInitDict */ DeviceMotionEventInit, 
      org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

