package typingsSlinky.sipml

import typingsSlinky.sipml.SIPml.Stack.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object SIPml extends js.Object {
    
    def getNavigatorFriendlyName(): String = js.native
    
    def getNavigatorVersion(): String = js.native
    
    def getSystemFriendlyName(): String = js.native
    
    def getWebRtc4AllVersion(): String = js.native
    
    def haveMediaStream(): Boolean = js.native
    
    def init(): Boolean = js.native
    def init(readyCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    
    def isInitialized(): Boolean = js.native
    
    def isNavigatorOutdated(): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    def isScreenShareSupported(): Boolean = js.native
    
    def isWebRtc4AllSupported(): Boolean = js.native
    
    def isWebRtcPluginOutdated(): Boolean = js.native
    
    def isWebRtcSupported(): Boolean = js.native
    
    def isWebSocketSupported(): Boolean = js.native
    
    def setDebugLevel(level: String): Unit = js.native
    
    def setWebRtcType(`type`: String): Boolean = js.native
    
    @js.native
    class Event ()
      extends typingsSlinky.sipml.SIPml.Event
    
    @js.native
    class EventTarget[EventSubscriptionType /* <: String */, EventType /* <: typingsSlinky.sipml.SIPml.Event */] ()
      extends typingsSlinky.sipml.SIPml.EventTarget[EventSubscriptionType, EventType]
    
    @js.native
    class Session ()
      extends typingsSlinky.sipml.SIPml.Session
    @js.native
    object Session extends js.Object {
      
      @js.native
      class Call ()
        extends typingsSlinky.sipml.SIPml.Session.Call
      
      @js.native
      class Event ()
        extends typingsSlinky.sipml.SIPml.Session.Event
      
      @js.native
      class Message ()
        extends typingsSlinky.sipml.SIPml.Session.Message
      
      @js.native
      class Publish ()
        extends typingsSlinky.sipml.SIPml.Session.Publish
      
      @js.native
      class Registration ()
        extends typingsSlinky.sipml.SIPml.Session.Registration
      
      @js.native
      class Subscribe ()
        extends typingsSlinky.sipml.SIPml.Session.Subscribe
    }
    
    @js.native
    class Stack ()
      extends typingsSlinky.sipml.SIPml.Stack {
      def this(configuration: Configuration) = this()
    }
    @js.native
    object Stack extends js.Object {
      
      @js.native
      class Event ()
        extends typingsSlinky.sipml.SIPml.Stack.Event
    }
  }
}
