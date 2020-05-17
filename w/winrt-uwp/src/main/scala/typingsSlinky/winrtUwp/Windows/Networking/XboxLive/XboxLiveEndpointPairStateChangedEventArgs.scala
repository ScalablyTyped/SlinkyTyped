package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveEndpointPairStateChangedEventArgs extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var newState: XboxLiveEndpointPairState = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var oldState: XboxLiveEndpointPairState = js.native
}

object XboxLiveEndpointPairStateChangedEventArgs {
  @scala.inline
  def apply(newState: XboxLiveEndpointPairState, oldState: XboxLiveEndpointPairState): XboxLiveEndpointPairStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveEndpointPairStateChangedEventArgs]
  }
  @scala.inline
  implicit class XboxLiveEndpointPairStateChangedEventArgsOps[Self <: XboxLiveEndpointPairStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewState(value: XboxLiveEndpointPairState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldState(value: XboxLiveEndpointPairState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

