package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardGroup extends js.Object {
  var _links: js.Any = js.native
  /**
    * A list of Dashboards held by the Dashboard Group
    */
  var dashboardEntries: js.Array[DashboardGroupEntry] = js.native
  /**
    * Deprecated: The old permission model describing the level of permissions for the current team. Pre-M125.
    */
  var permission: GroupMemberPermission = js.native
  /**
    * A permissions bit mask describing the security permissions of the current team for dashboards. When this permission is the value None, use GroupMemberPermission. Permissions are evaluated based on the presence of a value other than None, else the GroupMemberPermission will be saved.
    */
  var teamDashboardPermission: TeamDashboardPermission = js.native
  var url: String = js.native
}

object DashboardGroup {
  @scala.inline
  def apply(
    _links: js.Any,
    dashboardEntries: js.Array[DashboardGroupEntry],
    permission: GroupMemberPermission,
    teamDashboardPermission: TeamDashboardPermission,
    url: String
  ): DashboardGroup = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], dashboardEntries = dashboardEntries.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], teamDashboardPermission = teamDashboardPermission.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardGroup]
  }
  @scala.inline
  implicit class DashboardGroupOps[Self <: DashboardGroup] (val x: Self) extends AnyVal {
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
    def withDashboardEntries(value: js.Array[DashboardGroupEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboardEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: GroupMemberPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamDashboardPermission(value: TeamDashboardPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDashboardPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

