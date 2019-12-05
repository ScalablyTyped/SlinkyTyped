package typingsSlinky.urbanairshipDashCordova

import typingsSlinky.urbanairshipDashCordova.UrbanAirshipPlugin.PushEvent
import typingsSlinky.urbanairshipDashCordova.UrbanAirshipPlugin.RegistrationEvent
import typingsSlinky.urbanairshipDashCordova.urbanairshipDashCordovaStrings.urbanairshipDOTpush
import typingsSlinky.urbanairshipDashCordova.urbanairshipDashCordovaStrings.urbanairshipDOTregistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Additional Document Events
@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(`type`: urbanairshipDOTpush, listener: js.Function1[/* ev */ PushEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(`type`: urbanairshipDOTpush, listener: js.Function1[/* ev */ PushEvent, Unit], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(`type`: urbanairshipDOTregistration, listener: js.Function1[/* ev */ RegistrationEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(
    `type`: urbanairshipDOTregistration,
    listener: js.Function1[/* ev */ RegistrationEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

