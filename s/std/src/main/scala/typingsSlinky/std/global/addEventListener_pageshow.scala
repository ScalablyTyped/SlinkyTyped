package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.pageshow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_pageshow extends js.Object {
  
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
