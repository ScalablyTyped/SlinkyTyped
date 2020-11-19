package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicemotion extends js.Object {
  
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ]
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ Window, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
}
