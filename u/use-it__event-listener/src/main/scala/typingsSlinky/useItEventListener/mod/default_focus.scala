package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_focus extends js.Object {
  
  def apply(eventName: focus, handler: FocusEvent): Unit = js.native
  def apply(eventName: focus, handler: FocusEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: focus, handler: FocusEvent, element: Document): Unit = js.native
  def apply(eventName: focus, handler: FocusEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: focus, handler: FocusEvent, element: Window): Unit = js.native
  def apply(eventName: focus, handler: FocusEvent, element: Window, options: Options): Unit = js.native
}
