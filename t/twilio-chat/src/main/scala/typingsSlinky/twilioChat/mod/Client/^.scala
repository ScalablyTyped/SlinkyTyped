package typingsSlinky.twilioChat.mod.Client

import typingsSlinky.twilioChat.pushnotificationMod.PushNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat", "Client")
@js.native
object ^ extends js.Object {
  
  var compareChannelsByLastMessage: js.Any = js.native
  
  var compareChannelsByStringProperty: js.Any = js.native
  
  /**
    * Factory method to create Chat client instance.
    *
    * @param {String} token - Access token
    * @param {Client#ClientOptions} options - Options to customize the Client
    * @returns {Promise<Client>}
    */
  def create(token: String): js.Promise[typingsSlinky.twilioChat.mod.Client] = js.native
  def create(token: String, options: Options): js.Promise[typingsSlinky.twilioChat.mod.Client] = js.native
  
  /**
    * Static method for push notification payload parsing. Returns parsed push as {@link PushNotification} object
    * @param {Object} notificationPayload - Push notification payload
    * @returns {PushNotification|Error}
    */
  def parsePushNotification(notificationPayload: js.Any): PushNotification = js.native
  
  var parsePushNotificationChatData: js.Any = js.native
  
  val supportedPushChannels: js.Any = js.native
  
  val supportedPushDataFields: js.Any = js.native
  
  val version: String = js.native
}
