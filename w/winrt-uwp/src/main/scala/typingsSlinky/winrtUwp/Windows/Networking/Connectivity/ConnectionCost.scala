package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values that indicate the current cost of a network connection. */
@js.native
trait ConnectionCost extends js.Object {
  /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
  var approachingDataLimit: Boolean = js.native
  /** Gets a value that indicates whether background data usage has been restricted. */
  var backgroundDataUsageRestricted: Boolean = js.native
  /** Gets a value that indicates the current network cost for a connection. */
  var networkCostType: NetworkCostType = js.native
  /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
  var overDataLimit: Boolean = js.native
  /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
  var roaming: Boolean = js.native
}

object ConnectionCost {
  @scala.inline
  def apply(
    approachingDataLimit: Boolean,
    backgroundDataUsageRestricted: Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: Boolean,
    roaming: Boolean
  ): ConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit.asInstanceOf[js.Any], backgroundDataUsageRestricted = backgroundDataUsageRestricted.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], overDataLimit = overDataLimit.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionCost]
  }
  @scala.inline
  implicit class ConnectionCostOps[Self <: ConnectionCost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproachingDataLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approachingDataLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundDataUsageRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundDataUsageRestricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkCostType(value: NetworkCostType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkCostType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverDataLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overDataLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roaming")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

