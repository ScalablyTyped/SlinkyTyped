package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.touchmove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_touchmove extends js.Object {
  
  def apply(eventName: touchmove, handler: TouchEvent): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Document): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Window): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Window, options: Options): Unit = js.native
}
