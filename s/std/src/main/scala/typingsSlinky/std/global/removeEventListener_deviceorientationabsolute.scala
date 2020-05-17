package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.deviceorientationabsolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_deviceorientationabsolute extends js.Object {
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
}

