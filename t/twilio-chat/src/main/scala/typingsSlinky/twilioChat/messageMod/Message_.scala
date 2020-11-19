package typingsSlinky.twilioChat.messageMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioChat.channelMod.Channel
import typingsSlinky.twilioChat.mediaMod.Media
import typingsSlinky.twilioChat.memberMod.Member
import typingsSlinky.twilioChat.messageMod.Message.Type
import typingsSlinky.twilioChat.sessionerrorMod.SessionError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc A Message represents a Message in a Channel.
  * @property {String} author - The name of the user that sent Message
  * @property {String} body - The body of the Message. Is null if Message is Media Message
  * @property {any} attributes - Message custom attributes
  * @property {Channel} channel - Channel Message belongs to
  * @property {Date} dateCreated - When Message was created
  * @property {Date} dateUpdated - When Message was updated
  * @property {Number} index - Index of Message in the Channel's messages list
  * @property {String} lastUpdatedBy - Identity of the last user that updated Message
  * @property {Media} media - Contains Media information (if present)
  * @property {String} memberSid - Authoring Member's server-assigned unique identifier
  * @property {String} sid - The server-assigned unique identifier for Message
  * @property {'text' | 'media' } type - Type of message: 'text' or 'media'
  * @fires Message#updated
  */
@JSImport("twilio-chat/lib/message", "Message")
@js.native
class Message_ protected () extends EventEmitter {
  /**
    * The update reason for <code>updated</code> event emitted on Message
    * @typedef {('body' | 'lastUpdatedBy' | 'dateCreated' | 'dateUpdated' | 'attributes' | 'author')} Message#UpdateReason
    */
  def this(channel: Channel, services: MessageServices, index: Double, data: js.Any) = this()
  
  def _update(data: js.Any): Unit = js.native
  
  def attributes: js.Object = js.native
  
  def author: String = js.native
  
  def body: String = js.native
  
  val channel: Channel = js.native
  
  def dateCreated: js.Date = js.native
  
  def dateUpdated: js.Date = js.native
  
  /**
    * Get Member who is author of the Message
    * @returns {Promise<Member>}
    */
  def getMember(): js.Promise[Member] = js.native
  
  def index: Double = js.native
  
  def lastUpdatedBy: String = js.native
  
  def media: Media = js.native
  
  def memberSid: String = js.native
  
  /**
    * Remove the Message.
    * @returns {Promise<Message|SessionError>}
    */
  def remove(): js.Promise[Message | SessionError] = js.native
  
  var services: js.Any = js.native
  
  def sid: String = js.native
  
  var state: js.Any = js.native
  
  def `type`: Type = js.native
  
  /**
    * Edit message attributes.
    * @param {any} attributes new attributes for Message.
    * @returns {Promise<Message|Error|SessionError>}
    */
  def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
  
  /**
    * Edit message body.
    * @param {String} body - new body of Message.
    * @returns {Promise<Message|Error|SessionError>}
    */
  def updateBody(body: String): js.Promise[Message | js.Error | SessionError] = js.native
}
