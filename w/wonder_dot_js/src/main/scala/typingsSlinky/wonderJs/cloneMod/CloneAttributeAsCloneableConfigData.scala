package typingsSlinky.wonderJs.cloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneAttributeAsCloneableConfigData extends js.Object {
  var order: js.UndefOr[Double] = js.native
}

object CloneAttributeAsCloneableConfigData {
  @scala.inline
  def apply(): CloneAttributeAsCloneableConfigData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneAttributeAsCloneableConfigData]
  }
  @scala.inline
  implicit class CloneAttributeAsCloneableConfigDataOps[Self <: CloneAttributeAsCloneableConfigData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

