package typingsSlinky.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointGroup extends js.Object {
  var axis: String = js.native
  var name: String = js.native
  var waypoints: js.Array[Waypoint] = js.native
  def first(): Waypoint = js.native
  def last(): Waypoint = js.native
}

object WaypointGroup {
  @scala.inline
  def apply(
    axis: String,
    first: () => Waypoint,
    last: () => Waypoint,
    name: String,
    waypoints: js.Array[Waypoint]
  ): WaypointGroup = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), name = name.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointGroup]
  }
  @scala.inline
  implicit class WaypointGroupOps[Self <: WaypointGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: () => Waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => Waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[Waypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

