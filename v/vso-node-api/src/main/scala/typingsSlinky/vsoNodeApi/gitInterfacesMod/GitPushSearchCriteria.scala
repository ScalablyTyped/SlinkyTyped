package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPushSearchCriteria extends js.Object {
  var fromDate: js.Date = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  var includeRefUpdates: Boolean = js.native
  var pusherId: String = js.native
  var refName: String = js.native
  var toDate: js.Date = js.native
}

object GitPushSearchCriteria {
  @scala.inline
  def apply(
    fromDate: js.Date,
    includeLinks: Boolean,
    includeRefUpdates: Boolean,
    pusherId: String,
    refName: String,
    toDate: js.Date
  ): GitPushSearchCriteria = {
    val __obj = js.Dynamic.literal(fromDate = fromDate.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeRefUpdates = includeRefUpdates.asInstanceOf[js.Any], pusherId = pusherId.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
  @scala.inline
  implicit class GitPushSearchCriteriaOps[Self <: GitPushSearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeRefUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRefUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPusherId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusherId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

