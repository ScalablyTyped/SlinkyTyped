package typingsSlinky.sipml

import typingsSlinky.sipml.SIPml.Stack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SIPml {
    
    @JSGlobal("SIPml.Event")
    @js.native
    class Event ()
      extends typingsSlinky.sipml.SIPml.Event
    
    @JSGlobal("SIPml.EventTarget")
    @js.native
    class EventTarget[EventSubscriptionType /* <: String */, EventType /* <: typingsSlinky.sipml.SIPml.Event */] ()
      extends typingsSlinky.sipml.SIPml.EventTarget[EventSubscriptionType, EventType]
    
    @JSGlobal("SIPml.Session")
    @js.native
    class Session ()
      extends typingsSlinky.sipml.SIPml.Session
    object Session {
      
      @JSGlobal("SIPml.Session.Call")
      @js.native
      class Call ()
        extends typingsSlinky.sipml.SIPml.Session.Call
      
      @JSGlobal("SIPml.Session.Event")
      @js.native
      class Event ()
        extends typingsSlinky.sipml.SIPml.Session.Event
      
      @JSGlobal("SIPml.Session.Message")
      @js.native
      class Message ()
        extends typingsSlinky.sipml.SIPml.Session.Message
      
      @JSGlobal("SIPml.Session.Publish")
      @js.native
      class Publish ()
        extends typingsSlinky.sipml.SIPml.Session.Publish
      
      @JSGlobal("SIPml.Session.Registration")
      @js.native
      class Registration ()
        extends typingsSlinky.sipml.SIPml.Session.Registration
      
      @JSGlobal("SIPml.Session.Subscribe")
      @js.native
      class Subscribe ()
        extends typingsSlinky.sipml.SIPml.Session.Subscribe
    }
    
    @JSGlobal("SIPml.Stack")
    @js.native
    class Stack ()
      extends typingsSlinky.sipml.SIPml.Stack {
      def this(configuration: Configuration) = this()
    }
    object Stack {
      
      @JSGlobal("SIPml.Stack.Event")
      @js.native
      class Event ()
        extends typingsSlinky.sipml.SIPml.Stack.Event
    }
    
    @JSGlobal("SIPml.getNavigatorFriendlyName")
    @js.native
    def getNavigatorFriendlyName(): String = js.native
    
    @JSGlobal("SIPml.getNavigatorVersion")
    @js.native
    def getNavigatorVersion(): String = js.native
    
    @JSGlobal("SIPml.getSystemFriendlyName")
    @js.native
    def getSystemFriendlyName(): String = js.native
    
    @JSGlobal("SIPml.getWebRtc4AllVersion")
    @js.native
    def getWebRtc4AllVersion(): String = js.native
    
    @JSGlobal("SIPml.haveMediaStream")
    @js.native
    def haveMediaStream(): Boolean = js.native
    
    @JSGlobal("SIPml.init")
    @js.native
    def init(): Boolean = js.native
    @JSGlobal("SIPml.init")
    @js.native
    def init(readyCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    @JSGlobal("SIPml.init")
    @js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    @JSGlobal("SIPml.init")
    @js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    
    @JSGlobal("SIPml.isInitialized")
    @js.native
    def isInitialized(): Boolean = js.native
    
    @JSGlobal("SIPml.isNavigatorOutdated")
    @js.native
    def isNavigatorOutdated(): Boolean = js.native
    
    @JSGlobal("SIPml.isReady")
    @js.native
    def isReady(): Boolean = js.native
    
    @JSGlobal("SIPml.isScreenShareSupported")
    @js.native
    def isScreenShareSupported(): Boolean = js.native
    
    @JSGlobal("SIPml.isWebRtc4AllSupported")
    @js.native
    def isWebRtc4AllSupported(): Boolean = js.native
    
    @JSGlobal("SIPml.isWebRtcPluginOutdated")
    @js.native
    def isWebRtcPluginOutdated(): Boolean = js.native
    
    @JSGlobal("SIPml.isWebRtcSupported")
    @js.native
    def isWebRtcSupported(): Boolean = js.native
    
    @JSGlobal("SIPml.isWebSocketSupported")
    @js.native
    def isWebSocketSupported(): Boolean = js.native
    
    @JSGlobal("SIPml.setDebugLevel")
    @js.native
    def setDebugLevel(level: String): Unit = js.native
    
    @JSGlobal("SIPml.setWebRtcType")
    @js.native
    def setWebRtcType(`type`: String): Boolean = js.native
  }
}
