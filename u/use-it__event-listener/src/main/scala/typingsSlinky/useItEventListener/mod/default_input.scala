package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_input extends js.Object {
  
  def apply(eventName: input, handler: Event): Unit = js.native
  def apply(eventName: input, handler: Event, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: input, handler: Event, element: Document): Unit = js.native
  def apply(eventName: input, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: input, handler: Event, element: Window): Unit = js.native
  def apply(eventName: input, handler: Event, element: Window, options: Options): Unit = js.native
}
