package typingsSlinky.twilioNotifications

import typingsSlinky.twilioNotifications.clientMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @class
    * @alias Notifications
    * @classdesc The helper library for the notification service.
    * Provides high level api for creating and managing notification subscriptions and receiving messages
    * Creates the instance of Notification helper library
    *
    * @constructor
    * @param {string} token - Twilio access token
    * @param {Notifications#ClientOptions} options - Options to customize client behavior
    */
  @JSImport("twilio-notifications", "Notifications")
  @js.native
  class Notifications protected () extends Client {
    def this(token: String) = this()
    def this(token: String, options: js.Any) = this()
  }
}
