package typingsSlinky.twilioChat

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  /**
    * @classdesc Extended user information.
    * Note that <code>online</code> and <code>notifiable</code> properties are eligible
    * to use only if reachability function is enabled.
    * You may check if it is enabled by reading value of {@link Client}'s <code>reachabilityEnabled</code> property.
    *
    * @property {String} identity - User identity
    * @property {String} friendlyName - User friendly name, null if not set
    * @property {any} attributes - Object with custom attributes for user
    * @property {Boolean} online - User real-time channel connection status
    * @property {Boolean} notifiable - User push notification registration status
    *
    * @fires User#updated
    * @fires User#userSubscribed
    * @fires User#userUnsubscribed
    *
    * @constructor
    * @param {String} identity - Identity of user
    * @param {String} entityId - id of user's object
    * @param {Object} datasync - datasync service
    * @param {Object} session - session service
    */
  @JSImport("twilio-chat/lib/user", "User")
  @js.native
  class User protected () extends EventEmitter {
    /**
      * The update reason for <code>updated</code> event emitted on User
      * @typedef {('friendlyName' | 'attributes' | 'online' | 'notifiable')} User#UpdateReason
      */
    def this(identity: String, entityName: String, services: UserServices) = this()
    
    def _ensureFetched(): js.Promise[User] = js.native
    
    def _fetch(): js.Promise[User] = js.native
    
    def _update(key: String, value: js.Any): Unit = js.native
    
    def _updateReachabilityInfo(map: js.Any, update: js.Any): js.Any = js.native
    
    def attributes: js.Any = js.native
    
    var entity: js.Any = js.native
    
    def entityName_=(name: String): Unit = js.native
    
    def friendlyName: String = js.native
    
    def identity: String = js.native
    def identity_=(identity: String): Unit = js.native
    
    def isSubscribed: Boolean = js.native
    
    def notifiable: Boolean = js.native
    
    def online: Boolean = js.native
    
    var promiseToFetch: js.Any = js.native
    
    var services: js.Any = js.native
    
    var state: js.Any = js.native
    
    var subscribed: js.Any = js.native
    
    /**
      * Removes User from subscription list.
      * @returns {Promise<void>} Promise of completion
      */
    def unsubscribe(): js.Promise[Unit] = js.native
    
    /**
      * Updates user attributes.
      * @param {any} attributes new attributes for User.
      * @returns {Promise<User|Error|SessionError>}
      */
    def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
    
    /**
      * Update Users friendlyName.
      * @param {String} friendlyName - Updated friendlyName
      * @returns {Promise<User|Error|SessionError>}
      */
    def updateFriendlyName(friendlyName: js.Any): js.Promise[this.type] = js.native
  }
  object User {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.twilioChat.twilioChatStrings.initializing
      - typingsSlinky.twilioChat.twilioChatStrings.subscribed
      - typingsSlinky.twilioChat.twilioChatStrings.unsubscribed
    */
    trait SubscriptionState extends StObject
    object SubscriptionState {
      
      @scala.inline
      def initializing: typingsSlinky.twilioChat.twilioChatStrings.initializing = "initializing".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.initializing]
      
      @scala.inline
      def subscribed: typingsSlinky.twilioChat.twilioChatStrings.subscribed = "subscribed".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.subscribed]
      
      @scala.inline
      def unsubscribed: typingsSlinky.twilioChat.twilioChatStrings.unsubscribed = "unsubscribed".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.unsubscribed]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.twilioChat.twilioChatStrings.friendlyName
      - typingsSlinky.twilioChat.twilioChatStrings.attributes
      - typingsSlinky.twilioChat.twilioChatStrings.online
      - typingsSlinky.twilioChat.twilioChatStrings.notifiable
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      @scala.inline
      def attributes: typingsSlinky.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.attributes]
      
      @scala.inline
      def friendlyName: typingsSlinky.twilioChat.twilioChatStrings.friendlyName = "friendlyName".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.friendlyName]
      
      @scala.inline
      def notifiable: typingsSlinky.twilioChat.twilioChatStrings.notifiable = "notifiable".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.notifiable]
      
      @scala.inline
      def online: typingsSlinky.twilioChat.twilioChatStrings.online = "online".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.online]
    }
    
    @js.native
    trait UpdatedEventArgs extends StObject {
      
      var updateReasons: js.Array[UpdateReason] = js.native
      
      var user: User = js.native
    }
    object UpdatedEventArgs {
      
      @scala.inline
      def apply(updateReasons: js.Array[UpdateReason], user: User): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      @scala.inline
      implicit class UpdatedEventArgsMutableBuilder[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait UserServices extends StObject {
    
    var session: Session = js.native
    
    var syncClient: SyncClient = js.native
  }
  object UserServices {
    
    @scala.inline
    def apply(session: Session, syncClient: SyncClient): UserServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserServices]
    }
    
    @scala.inline
    implicit class UserServicesMutableBuilder[Self <: UserServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    }
  }
}
