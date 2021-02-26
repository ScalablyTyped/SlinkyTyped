package typingsSlinky.twilioChat

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioChat.channelMod.Channel
import typingsSlinky.twilioChat.mediaMod.Media
import typingsSlinky.twilioChat.memberMod.Member
import typingsSlinky.twilioChat.messageMod.Message.Type
import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioChat.sessionerrorMod.SessionError
import typingsSlinky.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
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
  class Message protected () extends EventEmitter {
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
  object Message {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.twilioChat.twilioChatStrings.text
      - typingsSlinky.twilioChat.twilioChatStrings.media
    */
    trait Type extends StObject
    object Type {
      
      @scala.inline
      def media: typingsSlinky.twilioChat.twilioChatStrings.media = "media".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.media]
      
      @scala.inline
      def text: typingsSlinky.twilioChat.twilioChatStrings.text = "text".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.text]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.twilioChat.twilioChatStrings.body
      - typingsSlinky.twilioChat.twilioChatStrings.lastUpdatedBy
      - typingsSlinky.twilioChat.twilioChatStrings.dateCreated
      - typingsSlinky.twilioChat.twilioChatStrings.dateUpdated
      - typingsSlinky.twilioChat.twilioChatStrings.attributes
      - typingsSlinky.twilioChat.twilioChatStrings.author
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      @scala.inline
      def attributes: typingsSlinky.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.attributes]
      
      @scala.inline
      def author: typingsSlinky.twilioChat.twilioChatStrings.author = "author".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.author]
      
      @scala.inline
      def body: typingsSlinky.twilioChat.twilioChatStrings.body = "body".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.body]
      
      @scala.inline
      def dateCreated: typingsSlinky.twilioChat.twilioChatStrings.dateCreated = "dateCreated".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.dateCreated]
      
      @scala.inline
      def dateUpdated: typingsSlinky.twilioChat.twilioChatStrings.dateUpdated = "dateUpdated".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.dateUpdated]
      
      @scala.inline
      def lastUpdatedBy: typingsSlinky.twilioChat.twilioChatStrings.lastUpdatedBy = "lastUpdatedBy".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.lastUpdatedBy]
    }
    
    @js.native
    trait UpdatedEventArgs extends StObject {
      
      var message: Message = js.native
      
      var updateReasons: js.Array[UpdateReason] = js.native
    }
    object UpdatedEventArgs {
      
      @scala.inline
      def apply(message: Message, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      @scala.inline
      implicit class UpdatedEventArgsMutableBuilder[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  trait MessageServices extends StObject {
    
    var mcsClient: McsClient = js.native
    
    var session: Session = js.native
  }
  object MessageServices {
    
    @scala.inline
    def apply(mcsClient: McsClient, session: Session): MessageServices = {
      val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageServices]
    }
    
    @scala.inline
    implicit class MessageServicesMutableBuilder[Self <: MessageServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
