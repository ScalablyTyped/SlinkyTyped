package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvisionedProfile extends js.Object {
  def updateCost(value: NetworkCostType): Unit = js.native
  def updateUsage(value: ProfileUsage): Unit = js.native
}

object IProvisionedProfile {
  @scala.inline
  def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): IProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
    __obj.asInstanceOf[IProvisionedProfile]
  }
  @scala.inline
  implicit class IProvisionedProfileOps[Self <: IProvisionedProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateCost(value: NetworkCostType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateUsage(value: ProfileUsage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUsage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

