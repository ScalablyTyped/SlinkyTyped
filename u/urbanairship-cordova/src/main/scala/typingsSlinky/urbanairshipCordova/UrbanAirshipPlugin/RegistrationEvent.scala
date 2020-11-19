package typingsSlinky.urbanairshipCordova.UrbanAirshipPlugin

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationEvent extends Event {
  
  /**
    * The channel ID for the device.
    */
  var channelID: String = js.native
  
  /**
    * (iOS Only)
    *
    * The push token for the device.
    */
  var deviceToken: String = js.native
  
  var error: String = js.native
}
