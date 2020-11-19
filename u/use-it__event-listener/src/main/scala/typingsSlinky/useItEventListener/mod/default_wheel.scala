package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.WheelEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_wheel extends js.Object {
  
  def apply(eventName: wheel, handler: WheelEvent): Unit = js.native
  def apply(eventName: wheel, handler: WheelEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: wheel, handler: WheelEvent, element: Document): Unit = js.native
  def apply(eventName: wheel, handler: WheelEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: wheel, handler: WheelEvent, element: Window): Unit = js.native
  def apply(eventName: wheel, handler: WheelEvent, element: Window, options: Options): Unit = js.native
}
