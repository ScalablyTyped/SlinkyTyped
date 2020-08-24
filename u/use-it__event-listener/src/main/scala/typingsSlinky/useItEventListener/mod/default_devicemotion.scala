package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_devicemotion extends js.Object {
  def apply(eventName: devicemotion, handler: DeviceMotionEvent): Unit = js.native
  def apply(
    eventName: devicemotion,
    handler: DeviceMotionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: devicemotion, handler: DeviceMotionEvent, element: Window): Unit = js.native
  def apply(eventName: devicemotion, handler: DeviceMotionEvent, element: Window, options: Options): Unit = js.native
}

