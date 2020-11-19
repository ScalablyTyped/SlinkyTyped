package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_readystatechange extends js.Object {
  
  def apply(eventName: readystatechange, handler: Event, element: Document): Unit = js.native
  def apply(eventName: readystatechange, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent): Unit = js.native
  def apply(
    eventName: readystatechange,
    handler: ProgressEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent, element: Window): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent, element: Window, options: Options): Unit = js.native
}
