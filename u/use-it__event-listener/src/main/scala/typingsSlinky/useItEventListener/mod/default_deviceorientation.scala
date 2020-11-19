package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.deviceorientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_deviceorientation extends js.Object {
  
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent): Unit = js.native
  def apply(
    eventName: deviceorientation,
    handler: DeviceOrientationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window): Unit = js.native
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window, options: Options): Unit = js.native
}
