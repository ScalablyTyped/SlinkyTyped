package typingsSlinky.twilioChat.messagesMod

import org.scalajs.dom.raw.FormData
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioChat.channelMod.Channel
import typingsSlinky.twilioChat.channelMod.Channel.SendMediaOptions
import typingsSlinky.twilioChat.messageMod.Message
import typingsSlinky.twilioChat.syncpaginatorMod.SyncPaginator
import typingsSlinky.twilioSync.mod.SyncList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of messages in a channel
  */
@JSImport("twilio-chat/lib/data/messages", "Messages")
@js.native
class Messages protected () extends EventEmitter {
  def this(channel: Channel, services: MessagesServices) = this()
  
  /**
    * Returns last messages from channel
    * @param {Number} [pageSize] Number of messages to return in single chunk. By default it's 30.
    * @param {String} [anchor] Most early message id which is already known, or 'end' by default
    * @param {String} [direction] Pagination order 'backwards' or 'forward', or 'forward' by default
    * @returns {Promise<SyncPaginator<Message>>} last page of messages by default
    * @private
    */
  var _getMessages: js.Any = js.native
  
  var _upsertMessage: js.Any = js.native
  
  val channel: Channel = js.native
  
  /**
    * Returns messages from channel using paginator interface
    * @param {Number} [pageSize] Number of messages to return in single chunk. By default it's 30.
    * @param {String} [anchor] Most early message id which is already known, or 'end' by default
    * @param {String} [direction] Pagination order 'backwards' or 'forward', or 'forward' by default
    * @returns {Promise<Paginator<Message>>} last page of messages by default
    */
  def getMessages(pageSize: js.Any, anchor: js.Any, direction: js.Any): js.Promise[SyncPaginator[Message]] = js.native
  
  val messagesByIndex: js.Any = js.native
  
  var messagesListPromise: js.Any = js.native
  
  /**
    * Send Message to the channel
    * @param {String} message - Message to post
    * @param {any} attributes Message attributes
    * @returns Returns promise which can fail
    */
  def send(message: String): js.Promise[_] = js.native
  def send(message: String, attributes: js.Any): js.Promise[_] = js.native
  
  /**
    * Send Media Message to the channel
    * @param {FormData | Channel#SendMediaOptions} mediaContent - Media content to post
    * @param {any} attributes Message attributes
    * @returns Returns promise which can fail
    */
  def sendMedia(mediaContent: FormData): js.Promise[_] = js.native
  def sendMedia(mediaContent: FormData, attributes: js.Any): js.Promise[_] = js.native
  def sendMedia(mediaContent: SendMediaOptions): js.Promise[_] = js.native
  def sendMedia(mediaContent: SendMediaOptions, attributes: js.Any): js.Promise[_] = js.native
  
  val services: js.Any = js.native
  
  /**
    * Subscribe to the Messages Event Stream
    * @param {String} name - The name of Sync object for the Messages resource.
    * @returns {Promise}
    */
  def subscribe(name: String): js.Promise[SyncList] = js.native
  
  def unsubscribe(): js.Promise[Unit] = js.native
  
  var wrapPaginator: js.Any = js.native
}
