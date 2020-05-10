package typingsSlinky.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownClasses extends js.Object {
  var disabled: Boolean = js.native
  var loading: Boolean = js.native
  var open: Boolean = js.native
  var rtl: Boolean = js.native
  var searchable: Boolean = js.native
  var searching: Boolean = js.native
  var single: Boolean = js.native
  var unsearchable: Boolean = js.native
}

object DropdownClasses {
  @scala.inline
  def apply(
    disabled: Boolean,
    loading: Boolean,
    open: Boolean,
    rtl: Boolean,
    searchable: Boolean,
    searching: Boolean,
    single: Boolean,
    unsearchable: Boolean
  ): DropdownClasses = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], unsearchable = unsearchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownClasses]
  }
  @scala.inline
  implicit class DropdownClassesOps[Self <: DropdownClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsearchable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

