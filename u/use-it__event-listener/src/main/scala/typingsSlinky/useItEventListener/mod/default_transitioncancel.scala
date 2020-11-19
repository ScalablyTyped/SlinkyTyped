package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.transitioncancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_transitioncancel extends js.Object {
  
  def apply(eventName: transitioncancel, handler: TransitionEvent): Unit = js.native
  def apply(
    eventName: transitioncancel,
    handler: TransitionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitioncancel, handler: TransitionEvent, element: Document): Unit = js.native
  def apply(eventName: transitioncancel, handler: TransitionEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitioncancel, handler: TransitionEvent, element: Window): Unit = js.native
  def apply(eventName: transitioncancel, handler: TransitionEvent, element: Window, options: Options): Unit = js.native
}
