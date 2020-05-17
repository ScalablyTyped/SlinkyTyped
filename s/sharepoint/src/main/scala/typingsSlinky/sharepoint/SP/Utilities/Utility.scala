package typingsSlinky.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utility extends js.Object {
  var lAYOUTS_LATESTVERSION_RELATIVE_URL: String = js.native
  var lAYOUTS_LATESTVERSION_URL: String = js.native
}

object Utility {
  @scala.inline
  def apply(lAYOUTS_LATESTVERSION_RELATIVE_URL: String, lAYOUTS_LATESTVERSION_URL: String): Utility = {
    val __obj = js.Dynamic.literal(lAYOUTS_LATESTVERSION_RELATIVE_URL = lAYOUTS_LATESTVERSION_RELATIVE_URL.asInstanceOf[js.Any], lAYOUTS_LATESTVERSION_URL = lAYOUTS_LATESTVERSION_URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utility]
  }
  @scala.inline
  implicit class UtilityOps[Self <: Utility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLAYOUTS_LATESTVERSION_RELATIVE_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lAYOUTS_LATESTVERSION_RELATIVE_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAYOUTS_LATESTVERSION_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lAYOUTS_LATESTVERSION_URL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

