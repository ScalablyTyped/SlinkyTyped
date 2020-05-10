package typingsSlinky.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleanOption extends js.Object {
  var autoConvert: js.UndefOr[Boolean] = js.native
  var extendAutoValueContext: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var getAutoValues: js.UndefOr[Boolean] = js.native
  var isModifier: js.UndefOr[Boolean] = js.native
  var removeEmptyStrings: js.UndefOr[Boolean] = js.native
  var removeNullsFromArrays: js.UndefOr[Boolean] = js.native
  var trimStrings: js.UndefOr[Boolean] = js.native
}

object CleanOption {
  @scala.inline
  def apply(): CleanOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleanOption]
  }
  @scala.inline
  implicit class CleanOptionOps[Self <: CleanOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConvert")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendAutoValueContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendAutoValueContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendAutoValueContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendAutoValueContext")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAutoValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmptyStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmptyStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNullsFromArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNullsFromArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNullsFromArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNullsFromArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimStrings")(js.undefined)
        ret
    }
  }
  
}

