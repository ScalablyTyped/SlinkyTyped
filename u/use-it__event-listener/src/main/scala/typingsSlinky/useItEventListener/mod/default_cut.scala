package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.useItEventListener.useItEventListenerStrings.cut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_cut extends js.Object {
  def apply(eventName: cut, handler: ClipboardEvent): Unit = js.native
  def apply(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: cut, handler: ClipboardEvent, element: Document): Unit = js.native
  def apply(eventName: cut, handler: ClipboardEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
}

