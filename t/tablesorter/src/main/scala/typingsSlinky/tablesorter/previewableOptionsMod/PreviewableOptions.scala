package typingsSlinky.tablesorter.previewableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewableOptions extends js.Object {
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.native
}

object PreviewableOptions {
  @scala.inline
  def apply(): PreviewableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewableOptions]
  }
  @scala.inline
  implicit class PreviewableOptionsOps[Self <: PreviewableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueToHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueToHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToHeader")(js.undefined)
        ret
    }
  }
  
}

