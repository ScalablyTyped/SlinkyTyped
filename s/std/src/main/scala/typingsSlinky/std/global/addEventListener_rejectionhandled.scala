package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.rejectionhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_rejectionhandled extends js.Object {
  
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
