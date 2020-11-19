package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_error extends js.Object {
  
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ErrorEvent, _]
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
