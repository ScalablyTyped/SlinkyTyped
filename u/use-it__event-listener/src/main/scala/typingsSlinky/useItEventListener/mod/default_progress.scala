package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_progress extends js.Object {
  def apply(eventName: progress, handler: ProgressEvent): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[Window],
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: progress, handler: typingsSlinky.std.ProgressEvent[EventTarget], element: Document): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[EventTarget],
    element: Document,
    options: Options
  ): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: progress, handler: typingsSlinky.std.ProgressEvent[Window], element: Window): Unit = js.native
  def apply(
    eventName: progress,
    handler: typingsSlinky.std.ProgressEvent[Window],
    element: Window,
    options: Options
  ): Unit = js.native
}

