package typingsSlinky.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expanded extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.native
}

object Expanded {
  @scala.inline
  def apply(): Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expanded]
  }
  @scala.inline
  implicit class ExpandedOps[Self <: Expanded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
  }
  
}

