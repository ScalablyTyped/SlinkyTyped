package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedNodesOptions extends js.Object {
  var flatten: js.UndefOr[scala.Boolean] = js.native
}

object AssignedNodesOptions {
  @scala.inline
  def apply(): AssignedNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedNodesOptions]
  }
  @scala.inline
  implicit class AssignedNodesOptionsOps[Self <: AssignedNodesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatten(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
  }
  
}

