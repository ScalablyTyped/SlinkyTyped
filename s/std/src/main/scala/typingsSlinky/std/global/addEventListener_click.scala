package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_click extends js.Object {
  
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _]
  ): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
