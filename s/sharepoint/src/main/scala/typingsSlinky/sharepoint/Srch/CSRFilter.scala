package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSRFilter extends js.Object {
  var IsSelected: Boolean = js.native
  var RefinementCount: Double = js.native
  var RefinementName: String = js.native
  var RefinementToken: String = js.native
}

object CSRFilter {
  @scala.inline
  def apply(IsSelected: Boolean, RefinementCount: Double, RefinementName: String, RefinementToken: String): CSRFilter = {
    val __obj = js.Dynamic.literal(IsSelected = IsSelected.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRFilter]
  }
  @scala.inline
  implicit class CSRFilterOps[Self <: CSRFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

