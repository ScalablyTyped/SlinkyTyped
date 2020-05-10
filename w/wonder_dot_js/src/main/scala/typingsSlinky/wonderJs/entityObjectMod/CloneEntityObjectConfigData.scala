package typingsSlinky.wonderJs.entityObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneEntityObjectConfigData extends js.Object {
  var cloneChildren: js.UndefOr[Boolean] = js.native
  var cloneGeometry: js.UndefOr[Boolean] = js.native
  var shareGeometry: js.UndefOr[Boolean] = js.native
}

object CloneEntityObjectConfigData {
  @scala.inline
  def apply(): CloneEntityObjectConfigData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneEntityObjectConfigData]
  }
  @scala.inline
  implicit class CloneEntityObjectConfigDataOps[Self <: CloneEntityObjectConfigData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withShareGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareGeometry")(js.undefined)
        ret
    }
  }
  
}

