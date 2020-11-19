package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.mouseout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_mouseout extends js.Object {
  
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _]
  ): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
