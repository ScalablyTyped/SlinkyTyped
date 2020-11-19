package typingsSlinky.twilioChat.mod

import typingsSlinky.twilioChat.mod.Client.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Client is a starting point to access Twilio Programmable Chat functionality.
  *
  * @property {Client#ConnectionState} connectionState - Client connection state
  * @property {Boolean} reachabilityEnabled - Client reachability state
  * @property {User} user - Information for logged in user
  * @property {String} version - Current version of Chat client
  *
  * @fires Client#connectionError
  * @fires Client#connectionStateChanged
  * @fires Client#channelAdded
  * @fires Client#channelInvited
  * @fires Client#channelJoined
  * @fires Client#channelLeft
  * @fires Client#channelRemoved
  * @fires Client#channelUpdated
  * @fires Client#memberJoined
  * @fires Client#memberLeft
  * @fires Client#memberUpdated
  * @fires Client#messageAdded
  * @fires Client#messageRemoved
  * @fires Client#messageUpdated
  * @fires Client#pushNotification
  * @fires Client#tokenAboutToExpire
  * @fires Client#tokenExpired
  * @fires Client#typingEnded
  * @fires Client#typingStarted
  * @fires Client#userSubscribed
  * @fires Client#userUnsubscribed
  * @fires Client#userUpdated
  */
@JSImport("twilio-chat", JSImport.Default)
@js.native
/**
  * These options can be passed to Client constructor.
  * @typedef {Object} Client#ClientOptions
  * @property {String} [logLevel='error'] - The level of logging to enable. Valid options
  *   (from strictest to broadest): ['silent', 'error', 'warn', 'info', 'debug', 'trace']
  */
/**
  * These options can be passed to {@link Client#createChannel}.
  * @typedef {Object} Client#CreateChannelOptions
  * @property {any} [attributes] - Any custom attributes to attach to the Channel
  * @property {String} [friendlyName] - The non-unique display name of the Channel
  * @property {Boolean} [isPrivate] - Whether or not this Channel should be visible to uninvited Clients
  * @property {String} [uniqueName] - The unique identity name of the Channel
  */
/**
  * Connection state of Client.
  * @typedef {('connecting'|'connected'|'disconnecting'|'disconnected'|'denied')} Client#ConnectionState
  */
/**
  * Notifications channel type.
  * @typedef {('gcm'|'fcm'|'apn')} Client#NotificationsChannelType
  */
/**
  * These options can be passed to {@link Client#getLocalChannels}.
  * @typedef {Object} Client#ChannelSortingOptions
  * @property {('lastMessage'|'friendlyName'|'uniqueName')} criteria - Sorting criteria for Channels array
  * @property {('ascending'|'descending')} [order] - Sorting order. If not present, then default is <code>ascending</code>
  */
class default protected () extends Client
/* static members */
@JSImport("twilio-chat", JSImport.Default)
@js.native
object default extends js.Object {
  
  var compareChannelsByLastMessage: js.Any = js.native
  
  var compareChannelsByStringProperty: js.Any = js.native
  
  /**
    * Factory method to create Chat client instance.
    *
    * @param {String} token - Access token
    * @param {Client#ClientOptions} options - Options to customize the Client
    * @returns {Promise<Client>}
    */
  def create(token: String): js.Promise[Client] = js.native
  def create(token: String, options: Options): js.Promise[Client] = js.native
  
  /**
    * Static method for push notification payload parsing. Returns parsed push as {@link PushNotification} object
    * @param {Object} notificationPayload - Push notification payload
    * @returns {PushNotification|Error}
    */
  def parsePushNotification(notificationPayload: js.Any): typingsSlinky.twilioChat.pushnotificationMod.PushNotification = js.native
  
  var parsePushNotificationChatData: js.Any = js.native
  
  val supportedPushChannels: js.Any = js.native
  
  val supportedPushDataFields: js.Any = js.native
  
  val version: String = js.native
}
