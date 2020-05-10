package typingsSlinky.vis.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineEventPropertiesResult extends js.Object {
  /**
    * The original click event.
    */
  var event: Event_ = js.native
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[Double | Null] = js.native
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | Null] = js.native
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: Double = js.native
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: Double = js.native
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: js.Date = js.native
  /**
    *  Date of the clicked event.
    */
  var time: js.Date = js.native
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.native
  /**
    * Relative horizontal position of the click event.
    */
  var x: Double = js.native
  /**
    * Relative vertical position of the click event.
    */
  var y: Double = js.native
}

object TimelineEventPropertiesResult {
  @scala.inline
  def apply(
    event: Event_,
    pageX: Double,
    pageY: Double,
    snappedTime: js.Date,
    time: js.Date,
    x: Double,
    y: Double
  ): TimelineEventPropertiesResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], snappedTime = snappedTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEventPropertiesResult]
  }
  @scala.inline
  implicit class TimelineEventPropertiesResultOps[Self <: TimelineEventPropertiesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnappedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(null)
        ret
    }
    @scala.inline
    def withItem(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(null)
        ret
    }
    @scala.inline
    def withWhat(value: TimelineEventPropertiesResultWhatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("what")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("what")(js.undefined)
        ret
    }
  }
  
}

