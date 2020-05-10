package typingsSlinky.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectFormValuesOption extends js.Object {
  var nullify: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object CollectFormValuesOption {
  @scala.inline
  def apply(): CollectFormValuesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectFormValuesOption]
  }
  @scala.inline
  implicit class CollectFormValuesOptionOps[Self <: CollectFormValuesOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNullify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullify")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

