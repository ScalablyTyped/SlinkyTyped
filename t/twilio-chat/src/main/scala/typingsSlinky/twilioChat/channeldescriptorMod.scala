package typingsSlinky.twilioChat

import typingsSlinky.twilioChat.channelMod.Channel
import typingsSlinky.twilioChat.channelMod.Channel.NotificationLevel
import typingsSlinky.twilioChat.channelMod.Channel.Status
import typingsSlinky.twilioChat.channelMod.Channel.Type
import typingsSlinky.twilioChat.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/channeldescriptor", JSImport.Namespace)
@js.native
object channeldescriptorMod extends js.Object {
  
  /**
    * Contains channel information.
    * Unlike {@link Channel}, this information won't be updated in realtime.
    * To have a fresh data, user should query channel descriptors again.
    *
    * @property {any} attributes - The Channel's custom attributes
    * @property {String} createdBy - The identity of the User that created Channel
    * @property {Date} dateCreated - The Date Channel was created
    * @property {Date} dateUpdated - The Date Channel was last updated
    * @property {String} friendlyName - The Channel's name
    * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
    * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in Channel
    * @property {Number} membersCount Number of members in a channel
    * @property {Number} messagesCount Number of messages in a channel
    * @property {String} sid - The Channel's unique system identifier
    * @property {Channel#Status} status - The Channel's status
    * @property {Channel#Type} type - The Channel's type
    * @property {String} uniqueName - The Channel's unique name
    */
  @js.native
  class ChannelDescriptor protected () extends js.Object {
    /**
      * @param {Client} client Chat client instance
      * @param {Object} descriptor Channel descriptor data object
      * @private
      */
    def this(client: Client, descriptor: js.Any) = this()
    
    val attributes: js.Any = js.native
    
    val channel: String = js.native
    
    var client: Client = js.native
    
    val createdBy: String = js.native
    
    val dateCreated: js.Date = js.native
    
    val dateUpdated: js.Date = js.native
    
    var descriptor: js.Any = js.native
    
    val friendlyName: String = js.native
    
    /**
      * Get channel object from descriptor.
      * @returns {Promise<Channel>}
      */
    def getChannel(): js.Promise[Channel] = js.native
    
    val isPrivate: Boolean = js.native
    
    val lastConsumedMessageIndex: Double = js.native
    
    val membersCount: Double = js.native
    
    val messagesCount: Double = js.native
    
    val notificationLevel: NotificationLevel = js.native
    
    val sid: String = js.native
    
    val status: Status = js.native
    
    val `type`: Type = js.native
    
    val uniqueName: String = js.native
  }
}
