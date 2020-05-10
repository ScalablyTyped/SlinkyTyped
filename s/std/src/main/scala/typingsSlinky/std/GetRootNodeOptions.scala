package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRootNodeOptions extends js.Object {
  var composed: js.UndefOr[scala.Boolean] = js.native
}

object GetRootNodeOptions {
  @scala.inline
  def apply(): GetRootNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRootNodeOptions]
  }
  @scala.inline
  implicit class GetRootNodeOptionsOps[Self <: GetRootNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposed(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(js.undefined)
        ret
    }
  }
  
}

