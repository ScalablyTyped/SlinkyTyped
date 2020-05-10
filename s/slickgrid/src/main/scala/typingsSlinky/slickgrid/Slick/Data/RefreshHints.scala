package typingsSlinky.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshHints extends js.Object {
  var ignoreDiffsAfter: js.UndefOr[Boolean] = js.native
  var ignoreDiffsBefore: js.UndefOr[Boolean] = js.native
  var isFilterExpanding: js.UndefOr[Boolean] = js.native
  var isFilterNarrowing: js.UndefOr[Boolean] = js.native
  var isFilterUnchanged: js.UndefOr[Boolean] = js.native
}

object RefreshHints {
  @scala.inline
  def apply(): RefreshHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshHints]
  }
  @scala.inline
  implicit class RefreshHintsOps[Self <: RefreshHints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreDiffsAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiffsAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiffsAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiffsAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDiffsBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiffsBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiffsBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiffsBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFilterExpanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterExpanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFilterExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFilterNarrowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterNarrowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFilterNarrowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterNarrowing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFilterUnchanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterUnchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFilterUnchanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterUnchanged")(js.undefined)
        ret
    }
  }
  
}

