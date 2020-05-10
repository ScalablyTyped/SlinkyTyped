package typingsSlinky.select2.mod

import typingsSlinky.select2.select2Strings.close
import typingsSlinky.select2.select2Strings.open
import typingsSlinky.select2.select2Strings.select
import typingsSlinky.select2.select2Strings.unselect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IngParams extends js.Object {
  var name: select | open | close | unselect = js.native
  var prevented: Boolean = js.native
}

object IngParams {
  @scala.inline
  def apply(name: select | open | close | unselect, prevented: Boolean): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngParams]
  }
  @scala.inline
  implicit class IngParamsOps[Self <: IngParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: select | open | close | unselect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevented")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

