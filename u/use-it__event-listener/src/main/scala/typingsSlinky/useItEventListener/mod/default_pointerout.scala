package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.pointerout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_pointerout extends js.Object {
  
  def apply(eventName: pointerout, handler: PointerEvent): Unit = js.native
  def apply(eventName: pointerout, handler: PointerEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: pointerout, handler: PointerEvent, element: Document): Unit = js.native
  def apply(eventName: pointerout, handler: PointerEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: pointerout, handler: PointerEvent, element: Window): Unit = js.native
  def apply(eventName: pointerout, handler: PointerEvent, element: Window, options: Options): Unit = js.native
}
