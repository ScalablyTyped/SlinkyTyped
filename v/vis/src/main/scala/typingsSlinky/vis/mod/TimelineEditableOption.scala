package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineEditableOption extends TimelineOptionsEditableType {
  var add: js.UndefOr[Boolean] = js.native
  var overrideItems: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var updateGroup: js.UndefOr[Boolean] = js.native
  var updateTime: js.UndefOr[Boolean] = js.native
}

object TimelineEditableOption {
  @scala.inline
  def apply(): TimelineEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineEditableOption]
  }
  @scala.inline
  implicit class TimelineEditableOptionOps[Self <: TimelineEditableOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

