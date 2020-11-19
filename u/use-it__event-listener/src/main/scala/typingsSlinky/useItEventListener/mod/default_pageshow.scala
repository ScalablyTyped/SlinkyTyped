package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Window
import typingsSlinky.std.PageTransitionEvent
import typingsSlinky.useItEventListener.useItEventListenerStrings.pageshow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_pageshow extends js.Object {
  
  def apply(eventName: pageshow, handler: PageTransitionEvent): Unit = js.native
  def apply(
    eventName: pageshow,
    handler: PageTransitionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: pageshow, handler: PageTransitionEvent, element: Window): Unit = js.native
  def apply(eventName: pageshow, handler: PageTransitionEvent, element: Window, options: Options): Unit = js.native
}
