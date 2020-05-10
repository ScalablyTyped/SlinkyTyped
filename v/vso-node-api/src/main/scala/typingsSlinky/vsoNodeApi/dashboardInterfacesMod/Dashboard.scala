package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dashboard extends js.Object {
  var _links: js.Any = js.native
  /**
    * Description of the dashboard.
    */
  var description: String = js.native
  /**
    * Server defined version tracking value, used for edit collision detection.
    */
  var eTag: String = js.native
  /**
    * ID of the Dashboard. Provided by service at creation time.
    */
  var id: String = js.native
  /**
    * Name of the Dashboard.
    */
  var name: String = js.native
  /**
    * ID of the Owner for a dashboard. For any legacy dashboards, this would be the unique identifier for the team associated with the dashboard.
    */
  var ownerId: String = js.native
  /**
    * Position of the dashboard, within a dashboard group. If unset at creation time, position is decided by the service.
    */
  var position: Double = js.native
  /**
    * Interval for client to automatically refresh the dashboard. Expressed in minutes.
    */
  var refreshInterval: Double = js.native
  var url: String = js.native
  /**
    * The set of Widgets on the dashboard.
    */
  var widgets: js.Array[Widget] = js.native
}

object Dashboard {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    eTag: String,
    id: String,
    name: String,
    ownerId: String,
    position: Double,
    refreshInterval: Double,
    url: String,
    widgets: js.Array[Widget]
  ): Dashboard = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refreshInterval = refreshInterval.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dashboard]
  }
  @scala.inline
  implicit class DashboardOps[Self <: Dashboard] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: js.Array[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

