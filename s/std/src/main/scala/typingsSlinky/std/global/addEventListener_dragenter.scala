package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.dragenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragenter extends js.Object {
  
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
