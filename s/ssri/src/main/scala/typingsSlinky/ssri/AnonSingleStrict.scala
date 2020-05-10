package typingsSlinky.ssri

import typingsSlinky.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSingleStrict extends js.Object {
  var single: `true` = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object AnonSingleStrict {
  @scala.inline
  def apply(single: `true`): AnonSingleStrict = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingleStrict]
  }
  @scala.inline
  implicit class AnonSingleStrictOps[Self <: AnonSingleStrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSingle(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

