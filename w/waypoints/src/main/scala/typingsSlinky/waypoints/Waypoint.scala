package typingsSlinky.waypoints

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waypoint extends js.Object {
  // properties
  var adapter: WaypointAdapter = js.native
  var context: WaypointContext = js.native
  var element: HTMLElement = js.native
  var group: WaypointGroup = js.native
  var options: WaypointOptions = js.native
  var triggerPoint: Double = js.native
  // Instance Methods
  def destroy(): Waypoint = js.native
  def disable(): Waypoint = js.native
  def enable(): Waypoint = js.native
  def next(): Waypoint | String = js.native
   // actually `null` not string
  def previous(): Waypoint | String = js.native
}

object Waypoint {
  @scala.inline
  def apply(
    adapter: WaypointAdapter,
    context: WaypointContext,
    destroy: () => Waypoint,
    disable: () => Waypoint,
    element: HTMLElement,
    enable: () => Waypoint,
    group: WaypointGroup,
    next: () => Waypoint | String,
    options: WaypointOptions,
    previous: () => Waypoint | String,
    triggerPoint: Double
  ): Waypoint = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), group = group.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), options = options.asInstanceOf[js.Any], previous = js.Any.fromFunction0(previous), triggerPoint = triggerPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
  @scala.inline
  implicit class WaypointOps[Self <: Waypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: WaypointAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: WaypointContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: () => Waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroup(value: WaypointGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: () => Waypoint | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: WaypointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: () => Waypoint | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTriggerPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

