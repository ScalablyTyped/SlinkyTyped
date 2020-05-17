package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
@js.native
trait AllJoynAcceptSessionJoinerEventArgs extends js.Object {
  /** Indicates if the app joining the session is on the same network. */
  var sameNetwork: Boolean = js.native
  /** The app joining the session is on the same physical node. */
  var samePhysicalNode: Boolean = js.native
  /** The session port being used to connect to the session. */
  var sessionPort: Double = js.native
  /** The traffic type supported during the session. */
  var trafficType: AllJoynTrafficType = js.native
  /** The unique bus name of the app requesting a session connection. */
  var uniqueName: String = js.native
  /** Called to accept the session connection. */
  def accept(): Unit = js.native
}

object AllJoynAcceptSessionJoinerEventArgs {
  @scala.inline
  def apply(
    accept: () => Unit,
    sameNetwork: Boolean,
    samePhysicalNode: Boolean,
    sessionPort: Double,
    trafficType: AllJoynTrafficType,
    uniqueName: String
  ): AllJoynAcceptSessionJoinerEventArgs = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), sameNetwork = sameNetwork.asInstanceOf[js.Any], samePhysicalNode = samePhysicalNode.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], trafficType = trafficType.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAcceptSessionJoinerEventArgs]
  }
  @scala.inline
  implicit class AllJoynAcceptSessionJoinerEventArgsOps[Self <: AllJoynAcceptSessionJoinerEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSameNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamePhysicalNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samePhysicalNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficType(value: AllJoynTrafficType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

