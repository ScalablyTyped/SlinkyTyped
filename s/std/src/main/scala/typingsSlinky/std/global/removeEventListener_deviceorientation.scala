package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.deviceorientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_deviceorientation extends js.Object {
  
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
}
