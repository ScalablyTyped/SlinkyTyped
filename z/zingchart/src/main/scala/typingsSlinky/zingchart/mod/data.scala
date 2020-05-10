package typingsSlinky.zingchart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait data extends js.Object {
  var globals: js.UndefOr[typingsSlinky.zingchart.mod.globals] = js.native
  var graphset: js.UndefOr[js.Array[typingsSlinky.zingchart.mod.graphset]] = js.native
  var gui: js.UndefOr[typingsSlinky.zingchart.mod.gui] = js.native
  var history: js.UndefOr[typingsSlinky.zingchart.mod.history] = js.native
  var refresh: js.UndefOr[typingsSlinky.zingchart.mod.refresh] = js.native
}

object data {
  @scala.inline
  def apply(): data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[data]
  }
  @scala.inline
  implicit class dataOps[Self <: data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobals(value: globals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphset(value: js.Array[graphset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphset")(js.undefined)
        ret
    }
    @scala.inline
    def withGui(value: gui): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gui")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: history): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: refresh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
  }
  
}

