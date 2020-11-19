package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.useItEventListener.useItEventListenerStrings.paste
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_paste extends js.Object {
  
  def apply(eventName: paste, handler: ClipboardEvent): Unit = js.native
  def apply(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: paste, handler: ClipboardEvent, element: Document): Unit = js.native
  def apply(eventName: paste, handler: ClipboardEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
}
