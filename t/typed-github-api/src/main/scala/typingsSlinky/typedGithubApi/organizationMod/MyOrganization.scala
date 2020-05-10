package typingsSlinky.typedGithubApi.organizationMod

import typingsSlinky.typedGithubApi.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MyOrganization extends js.Object {
  var billingEmail: String = js.native
  var collaborators: Double = js.native
  var defaultRepositorySettings: String = js.native
  var diskUsage: Double = js.native
  var membersCanCreateRepositories: Boolean = js.native
  var plan: AnonName = js.native
  var privateGists: Double = js.native
  var privateReposOwned: Double = js.native
  var privateReposTotal: Double = js.native
}

object MyOrganization {
  @scala.inline
  def apply(
    billingEmail: String,
    collaborators: Double,
    defaultRepositorySettings: String,
    diskUsage: Double,
    membersCanCreateRepositories: Boolean,
    plan: AnonName,
    privateGists: Double,
    privateReposOwned: Double,
    privateReposTotal: Double
  ): MyOrganization = {
    val __obj = js.Dynamic.literal(billingEmail = billingEmail.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], defaultRepositorySettings = defaultRepositorySettings.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], membersCanCreateRepositories = membersCanCreateRepositories.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], privateGists = privateGists.asInstanceOf[js.Any], privateReposOwned = privateReposOwned.asInstanceOf[js.Any], privateReposTotal = privateReposTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MyOrganization]
  }
  @scala.inline
  implicit class MyOrganizationOps[Self <: MyOrganization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollaborators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRepositorySettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRepositorySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembersCanCreateRepositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membersCanCreateRepositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateGists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateGists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateReposOwned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateReposOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateReposTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateReposTotal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

