package typingsSlinky.titanium.global.Titanium

import typingsSlinky.titanium.MessageReply
import typingsSlinky.titanium.Titanium.Event
import typingsSlinky.titanium.Titanium.WatchSessionActivationCompletedEvent
import typingsSlinky.titanium.Titanium.WatchSessionDeactivateEvent
import typingsSlinky.titanium.Titanium.WatchSessionFinishfiletransferEvent
import typingsSlinky.titanium.Titanium.WatchSessionFinishuserinfotransferEvent
import typingsSlinky.titanium.Titanium.WatchSessionInactiveEvent
import typingsSlinky.titanium.Titanium.WatchSessionReachabilitychangedEvent
import typingsSlinky.titanium.Titanium.WatchSessionReceiveapplicationcontextEvent
import typingsSlinky.titanium.Titanium.WatchSessionReceivefileEvent
import typingsSlinky.titanium.Titanium.WatchSessionReceivemessageEvent
import typingsSlinky.titanium.Titanium.WatchSessionReceiveuserinfoEvent
import typingsSlinky.titanium.Titanium.WatchSessionWatchstatechangedEvent
import typingsSlinky.titanium.titaniumStrings.activationCompleted
import typingsSlinky.titanium.titaniumStrings.deactivate
import typingsSlinky.titanium.titaniumStrings.finishfiletransfer
import typingsSlinky.titanium.titaniumStrings.finishuserinfotransfer
import typingsSlinky.titanium.titaniumStrings.inactive
import typingsSlinky.titanium.titaniumStrings.reachabilitychanged
import typingsSlinky.titanium.titaniumStrings.receiveapplicationcontext
import typingsSlinky.titanium.titaniumStrings.receivefile
import typingsSlinky.titanium.titaniumStrings.receivemessage
import typingsSlinky.titanium.titaniumStrings.receiveuserinfo
import typingsSlinky.titanium.titaniumStrings.watchstatechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to enable data and file transfers between a watchOS and iOS application.
  */
@JSGlobal("Titanium.WatchSession")
@js.native
class WatchSession ()
  extends typingsSlinky.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.WatchSession")
@js.native
object WatchSession extends js.Object {
  
  /**
    * The watch is currently activated.
    */
  val ACTIVATION_STATE_ACTIVATED: Double = js.native
  
  /**
    * The watch is currently inactive.
    */
  val ACTIVATION_STATE_INACTIVE: Double = js.native
  
  /**
    * The watch is currently not activated.
    */
  val ACTIVATION_STATE_NOT_ACTIVATED: Double = js.native
  
  /**
    * Activates the watch session
    */
  def activateSession(): Unit = js.native
  
  /**
    * Returns the current activation state of the watch.
    */
  val activationState: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_activationCompleted(
    name: activationCompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionActivationCompletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deactivate(
    name: deactivate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionDeactivateEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finishfiletransfer(
    name: finishfiletransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionFinishfiletransferEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finishuserinfotransfer(
    name: finishuserinfotransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionFinishuserinfotransferEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(
    name: inactive,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionInactiveEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reachabilitychanged(
    name: reachabilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReachabilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_receiveapplicationcontext(
    name: receiveapplicationcontext,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceiveapplicationcontextEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_receivefile(
    name: receivefile,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceivefileEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_receivemessage(
    name: receivemessage,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceivemessageEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_receiveuserinfo(
    name: receiveuserinfo,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceiveuserinfoEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_watchstatechanged(
    name: watchstatechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionWatchstatechangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Cancels all incomplete file transfers to the apple watch.
    */
  def cancelAllFileTransfers(): Unit = js.native
  
  /**
    * Cancels all incomplete transfers to the apple watch.
    */
  def cancelAllTransfers(): Unit = js.native
  
  /**
    * Cancels all incomplete user info and complication transfers to the apple watch.
    */
  def cancelAllUserInfoTransfers(): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_activationCompleted(name: activationCompleted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_activationCompleted(name: activationCompleted, event: WatchSessionActivationCompletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_deactivate(name: deactivate): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_deactivate(name: deactivate, event: WatchSessionDeactivateEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_finishfiletransfer(name: finishfiletransfer): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_finishfiletransfer(name: finishfiletransfer, event: WatchSessionFinishfiletransferEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_finishuserinfotransfer(name: finishuserinfotransfer): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_finishuserinfotransfer(name: finishuserinfotransfer, event: WatchSessionFinishuserinfotransferEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_inactive(name: inactive): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_inactive(name: inactive, event: WatchSessionInactiveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_reachabilitychanged(name: reachabilitychanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_reachabilitychanged(name: reachabilitychanged, event: WatchSessionReachabilitychangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receiveapplicationcontext(name: receiveapplicationcontext): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receiveapplicationcontext(name: receiveapplicationcontext, event: WatchSessionReceiveapplicationcontextEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receivefile(name: receivefile): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receivefile(name: receivefile, event: WatchSessionReceivefileEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receivemessage(name: receivemessage): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receivemessage(name: receivemessage, event: WatchSessionReceivemessageEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receiveuserinfo(name: receiveuserinfo): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_receiveuserinfo(name: receiveuserinfo, event: WatchSessionReceiveuserinfoEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_watchstatechanged(name: watchstatechanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_watchstatechanged(name: watchstatechanged, event: WatchSessionWatchstatechangedEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.activationState> property.
    * @deprecated Access <Titanium.WatchSession.activationState> instead.
    */
  def getActivationState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.apiName> property.
    * @deprecated Access <Titanium.WatchSession.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.bubbleParent> property.
    * @deprecated Access <Titanium.WatchSession.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.hasContentPending> property.
    * @deprecated Access <Titanium.WatchSession.hasContentPending> instead.
    */
  def getHasContentPending(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isActivated> property.
    * @deprecated Access <Titanium.WatchSession.isActivated> instead.
    */
  def getIsActivated(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isComplicationEnabled> property.
    * @deprecated Access <Titanium.WatchSession.isComplicationEnabled> instead.
    */
  def getIsComplicationEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isPaired> property.
    * @deprecated Access <Titanium.WatchSession.isPaired> instead.
    */
  def getIsPaired(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isReachable> property.
    * @deprecated Access <Titanium.WatchSession.isReachable> instead.
    */
  def getIsReachable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isSupported> property.
    * @deprecated Access <Titanium.WatchSession.isSupported> instead.
    */
  def getIsSupported(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isWatchAppInstalled> property.
    * @deprecated Access <Titanium.WatchSession.isWatchAppInstalled> instead.
    */
  def getIsWatchAppInstalled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.recentApplicationContext> property.
    * @deprecated Access <Titanium.WatchSession.recentApplicationContext> instead.
    */
  def getRecentApplicationContext(): js.Any = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.remainingComplicationUserInfoTransfers> property.
    * @deprecated Access <Titanium.WatchSession.remainingComplicationUserInfoTransfers> instead.
    */
  def getRemainingComplicationUserInfoTransfers(): Double = js.native
  
  /**
    * Returns `true` if there is more content for the session to deliver.
    */
  val hasContentPending: Boolean = js.native
  
  /**
    * Returns `true` if the watch is currently activated.
    */
  val isActivated: Boolean = js.native
  
  /**
    * Returns `true` if complication is enabled on the installed watch app.
    */
  val isComplicationEnabled: Boolean = js.native
  
  /**
    * Returns `true` if the device is paired with a watch.
    */
  val isPaired: Boolean = js.native
  
  /**
    * Returns `true` if the watch is currently reachable.
    */
  val isReachable: Boolean = js.native
  
  /**
    * Returns `true` if the device supports watch connectivity.
    */
  val isSupported: Boolean = js.native
  
  /**
    * Returns `true` if the accompanying watch app is installed.
    */
  val isWatchAppInstalled: Boolean = js.native
  
  /**
    * The most recent application context sent to the watch app.
    */
  val recentApplicationContext: js.Any = js.native
  
  /**
    * The number of calls remaining to `transferCurrentComplication` before the system starts
    * transferring the complicationUserInfo as regular userInfos.
    */
  val remainingComplicationUserInfoTransfers: Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_activationCompleted(
    name: activationCompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionActivationCompletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deactivate(
    name: deactivate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionDeactivateEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finishfiletransfer(
    name: finishfiletransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionFinishfiletransferEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finishuserinfotransfer(
    name: finishuserinfotransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionFinishuserinfotransferEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inactive(
    name: inactive,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionInactiveEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reachabilitychanged(
    name: reachabilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReachabilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_receiveapplicationcontext(
    name: receiveapplicationcontext,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceiveapplicationcontextEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_receivefile(
    name: receivefile,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceivefileEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_receivemessage(
    name: receivemessage,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceivemessageEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_receiveuserinfo(
    name: receiveuserinfo,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionReceiveuserinfoEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_watchstatechanged(
    name: watchstatechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WatchSessionWatchstatechangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sends a message to the apple watch.
    */
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, reply: js.Function1[/* param0 */ MessageReply, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.WatchSession.bubbleParent> property.
    * @deprecated Set the value using <Titanium.WatchSession.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Transfers complication data to the watch application.
    */
  def transferCurrentComplication(params: js.Any): Unit = js.native
  
  /**
    * Transfers a file to the apple watch.
    */
  def transferFile(params: js.Any): Unit = js.native
  
  /**
    * Transfers an user info to the apple watch.
    */
  def transferUserInfo(params: js.Any): Unit = js.native
  
  /**
    * Sends an app context update to the apple watch.
    */
  def updateApplicationContext(params: js.Any): Unit = js.native
}
