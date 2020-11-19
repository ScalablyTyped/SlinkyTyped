package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_message extends js.Object {
  
  def apply(eventName: message, handler: MessageEvent): Unit = js.native
  def apply(eventName: message, handler: MessageEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(eventName: message, handler: MessageEvent, element: Window): Unit = js.native
  def apply(eventName: message, handler: MessageEvent, element: Window, options: Options): Unit = js.native
}
