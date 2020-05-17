package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEventInit
import typingsSlinky.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent protected ()
  extends typingsSlinky.std.DeviceOrientationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends Instantiable1[
      /* type */ java.lang.String, 
      org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
    ]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

