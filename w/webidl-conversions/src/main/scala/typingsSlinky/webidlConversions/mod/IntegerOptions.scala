package typingsSlinky.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerOptions extends Options {
  var clamp: js.UndefOr[Boolean] = js.native
  var enforceRange: js.UndefOr[Boolean] = js.native
}

object IntegerOptions {
  @scala.inline
  def apply(): IntegerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerOptions]
  }
  @scala.inline
  implicit class IntegerOptionsOps[Self <: IntegerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceRange")(js.undefined)
        ret
    }
  }
  
}

