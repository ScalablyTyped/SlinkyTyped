package typingsSlinky.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Called when all events for the previously selected watch has occurred.
  * The session can be re-activated for the now selected watch using activateSession.
  */
@js.native
trait WatchSessionDeactivateEvent extends WatchSessionBaseEvent {
  
  /**
    * Returns the current activation state of the watch.  Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.activationState> for more infos.
    */
  var activationState: Double = js.native
  
  /**
    * If the apple watch has currently content pending. Only available on iOS 10.0
    * and later. See <Titanium.WatchSession.hasContentPending> for more infos.
    */
  var hasContentPending: Boolean = js.native
  
  /**
    * If the apple watch is currently activated. Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.isActivated> for more infos.
    */
  var isActivated: Boolean = js.native
  
  /**
    * If the complication is enabled in the apple watch.
    */
  var isComplicationEnabled: Boolean = js.native
  
  /**
    * If the device is paired with the apple watch.
    */
  var isPaired: Boolean = js.native
  
  /**
    * If apple watch is currently reachable.
    */
  var isReachable: Boolean = js.native
  
  /**
    * If the watch app is installed in the apple watch.
    */
  var isWatchAppInstalled: Boolean = js.native
  
  /**
    * If the apple watch has complication userInfo transfers left. Only available on iOS 10.0
    * and later. See <Titanium.WatchSession.remainingComplicationUserInfoTransfers> for more infos.
    */
  var remainingComplicationUserInfoTransfers: Boolean = js.native
}
object WatchSessionDeactivateEvent {
  
  @scala.inline
  def apply(
    activationState: Double,
    hasContentPending: Boolean,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    remainingComplicationUserInfoTransfers: Boolean,
    source: WatchSession
  ): WatchSessionDeactivateEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], hasContentPending = hasContentPending.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], remainingComplicationUserInfoTransfers = remainingComplicationUserInfoTransfers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionDeactivateEvent]
  }
  
  @scala.inline
  implicit class WatchSessionDeactivateEventMutableBuilder[Self <: WatchSessionDeactivateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationState(value: Double): Self = StObject.set(x, "activationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasContentPending(value: Boolean): Self = StObject.set(x, "hasContentPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActivated(value: Boolean): Self = StObject.set(x, "isActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplicationEnabled(value: Boolean): Self = StObject.set(x, "isComplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaired(value: Boolean): Self = StObject.set(x, "isPaired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReachable(value: Boolean): Self = StObject.set(x, "isReachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWatchAppInstalled(value: Boolean): Self = StObject.set(x, "isWatchAppInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingComplicationUserInfoTransfers(value: Boolean): Self = StObject.set(x, "remainingComplicationUserInfoTransfers", value.asInstanceOf[js.Any])
  }
}
