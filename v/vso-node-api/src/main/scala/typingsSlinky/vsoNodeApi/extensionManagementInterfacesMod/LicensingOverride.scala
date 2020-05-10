package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicensingOverride extends js.Object {
  /**
    * How the inclusion of this contribution should change based on licensing
    */
  var behavior: ContributionLicensingBehaviorType = js.native
  /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
  var id: String = js.native
}

object LicensingOverride {
  @scala.inline
  def apply(behavior: ContributionLicensingBehaviorType, id: String): LicensingOverride = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensingOverride]
  }
  @scala.inline
  implicit class LicensingOverrideOps[Self <: LicensingOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: ContributionLicensingBehaviorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

