package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInherit extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.native
  var matchingKeys: js.UndefOr[js.Any] = js.native
}

object AnonInherit {
  @scala.inline
  def apply(): AnonInherit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInherit]
  }
  @scala.inline
  implicit class AnonInheritOps[Self <: AnonInherit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchingKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingKeys")(js.undefined)
        ret
    }
  }
  
}

