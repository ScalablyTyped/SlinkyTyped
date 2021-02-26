package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardGroup extends StObject {
  
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
  implicit class DashboardGroupMutableBuilder[Self <: DashboardGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardEntries(value: js.Array[DashboardGroupEntry]): Self = StObject.set(x, "dashboardEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardEntriesVarargs(value: DashboardGroupEntry*): Self = StObject.set(x, "dashboardEntries", js.Array(value :_*))
    
    @scala.inline
    def setPermission(value: GroupMemberPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDashboardPermission(value: TeamDashboardPermission): Self = StObject.set(x, "teamDashboardPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
