package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dShadedOption extends js.Object {
  var groupid: js.UndefOr[IdType] = js.native
  var orientation: js.UndefOr[TopBottomEnumType] = js.native
}

object Graph2dShadedOption {
  @scala.inline
  def apply(): Graph2dShadedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dShadedOption]
  }
  @scala.inline
  implicit class Graph2dShadedOptionOps[Self <: Graph2dShadedOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupid(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupid")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: TopBottomEnumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

