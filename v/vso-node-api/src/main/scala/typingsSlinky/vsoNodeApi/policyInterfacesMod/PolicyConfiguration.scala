package typingsSlinky.vsoNodeApi.policyInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyConfiguration extends VersionedPolicyConfigurationRef {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any = js.native
  /**
    * A reference to the identity that created the policy.
    */
  var createdBy: IdentityRef = js.native
  /**
    * The date and time when the policy was created.
    */
  var createdDate: js.Date = js.native
  /**
    * Indicates whether the policy is blocking.
    */
  var isBlocking: Boolean = js.native
  /**
    * Indicates whether the policy has been (soft) deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * Indicates whether the policy is enabled.
    */
  var isEnabled: Boolean = js.native
  /**
    * The policy configuration settings.
    */
  var settings: js.Any = js.native
}

object PolicyConfiguration {
  @scala.inline
  def apply(
    _links: js.Any,
    createdBy: IdentityRef,
    createdDate: js.Date,
    id: Double,
    isBlocking: Boolean,
    isDeleted: Boolean,
    isEnabled: Boolean,
    revision: Double,
    settings: js.Any,
    `type`: PolicyTypeRef,
    url: String
  ): PolicyConfiguration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBlocking = isBlocking.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConfiguration]
  }
  @scala.inline
  implicit class PolicyConfigurationOps[Self <: PolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

