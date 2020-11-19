package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Window
import typingsSlinky.std.PageTransitionEvent
import typingsSlinky.useItEventListener.useItEventListenerStrings.pagehide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_pagehide extends js.Object {
  
  def apply(eventName: pagehide, handler: PageTransitionEvent): Unit = js.native
  def apply(
    eventName: pagehide,
    handler: PageTransitionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: pagehide, handler: PageTransitionEvent, element: Window): Unit = js.native
  def apply(eventName: pagehide, handler: PageTransitionEvent, element: Window, options: Options): Unit = js.native
}
