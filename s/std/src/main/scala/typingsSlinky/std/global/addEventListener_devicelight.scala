package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.devicelight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicelight extends js.Object {
  
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
