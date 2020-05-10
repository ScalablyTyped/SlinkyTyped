package typingsSlinky.waypoints

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointOptionsJQuery extends WaypointOptionsBase {
  var context: js.UndefOr[HTMLElement | String] = js.native
  var handler: js.UndefOr[js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]] = js.native
}

object WaypointOptionsJQuery {
  @scala.inline
  def apply(): WaypointOptionsJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptionsJQuery]
  }
  @scala.inline
  implicit class WaypointOptionsJQueryOps[Self <: WaypointOptionsJQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
  }
  
}

