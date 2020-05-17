package typingsSlinky.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsExpandable extends js.Object {
  var isExpandable: js.UndefOr[Boolean] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
}

object IsExpandable {
  @scala.inline
  def apply(): IsExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsExpandable]
  }
  @scala.inline
  implicit class IsExpandableOps[Self <: IsExpandable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
  }
  
}

