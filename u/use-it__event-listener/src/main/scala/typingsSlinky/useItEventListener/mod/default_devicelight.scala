package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Window
import typingsSlinky.std.DeviceLightEvent
import typingsSlinky.useItEventListener.useItEventListenerStrings.devicelight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_devicelight extends js.Object {
  
  def apply(eventName: devicelight, handler: DeviceLightEvent): Unit = js.native
  def apply(
    eventName: devicelight,
    handler: DeviceLightEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: devicelight, handler: DeviceLightEvent, element: Window): Unit = js.native
  def apply(eventName: devicelight, handler: DeviceLightEvent, element: Window, options: Options): Unit = js.native
}
