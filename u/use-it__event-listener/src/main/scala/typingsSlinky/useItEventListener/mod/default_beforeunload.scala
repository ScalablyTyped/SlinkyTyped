package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_beforeunload extends js.Object {
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent): Unit = js.native
  def apply(
    eventName: beforeunload,
    handler: BeforeUnloadEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window): Unit = js.native
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window, options: Options): Unit = js.native
}

