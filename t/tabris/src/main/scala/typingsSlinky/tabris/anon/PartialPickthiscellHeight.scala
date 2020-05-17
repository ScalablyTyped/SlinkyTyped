package typingsSlinky.tabris.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<this, 'cellHeight' | 'cellType' | 'createCell'>> */
@js.native
trait PartialPickthiscellHeight extends js.Object {
  var cellHeight: js.UndefOr[js.Any] = js.native
  var cellType: js.UndefOr[js.Any] = js.native
  var createCell: js.UndefOr[js.Any] = js.native
}

object PartialPickthiscellHeight {
  @scala.inline
  def apply(): PartialPickthiscellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthiscellHeight]
  }
  @scala.inline
  implicit class PartialPickthiscellHeightOps[Self <: PartialPickthiscellHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCell")(js.undefined)
        ret
    }
  }
  
}

