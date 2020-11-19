package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_unhandledrejection extends js.Object {
  
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
