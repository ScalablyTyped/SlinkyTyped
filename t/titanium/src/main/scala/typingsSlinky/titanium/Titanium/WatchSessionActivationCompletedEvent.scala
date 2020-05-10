package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Called when the session has completed activation. If session state is
	 * <Titanium.WatchSession.ACTIVATION_STATE_NOT_ACTIVATED> there will be an error
	 * with more details.
	 */
@js.native
trait WatchSessionActivationCompletedEvent extends WatchSessionBaseEvent {
  /**
  		 * Returns the current activation state of the watch.  Only available on iOS 9.3
  		 * and later. See <Titanium.WatchSession.activationState> for more infos.
  		 */
  var activationState: Double = js.native
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
}

object WatchSessionActivationCompletedEvent {
  @scala.inline
  def apply(
    activationState: Double,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    source: WatchSession
  ): WatchSessionActivationCompletedEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionActivationCompletedEvent]
  }
  @scala.inline
  implicit class WatchSessionActivationCompletedEventOps[Self <: WatchSessionActivationCompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplicationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplicationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWatchAppInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWatchAppInstalled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

