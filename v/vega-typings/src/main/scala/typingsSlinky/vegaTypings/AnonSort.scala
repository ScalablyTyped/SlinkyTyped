package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSort extends js.Object {
  var sort: js.UndefOr[SortField] = js.native
}

object AnonSort {
  @scala.inline
  def apply(): AnonSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSort]
  }
  @scala.inline
  implicit class AnonSortOps[Self <: AnonSort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSort(value: SortField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

