package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Window
import typingsSlinky.std.PromiseRejectionEvent
import typingsSlinky.useItEventListener.useItEventListenerStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_unhandledrejection extends js.Object {
  
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent): Unit = js.native
  def apply(
    eventName: unhandledrejection,
    handler: PromiseRejectionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window): Unit = js.native
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = js.native
}
