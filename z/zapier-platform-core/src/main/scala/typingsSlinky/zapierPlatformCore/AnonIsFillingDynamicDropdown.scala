package typingsSlinky.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsFillingDynamicDropdown extends js.Object {
  var isFillingDynamicDropdown: Boolean = js.native
  var isLoadingSample: Boolean = js.native
  var isPopulatingDedupe: Boolean = js.native
  var isTestingAuth: Boolean = js.native
  var limit: Double = js.native
  var page: Double = js.native
  var zap: js.UndefOr[AnonId] = js.native
}

object AnonIsFillingDynamicDropdown {
  @scala.inline
  def apply(
    isFillingDynamicDropdown: Boolean,
    isLoadingSample: Boolean,
    isPopulatingDedupe: Boolean,
    isTestingAuth: Boolean,
    limit: Double,
    page: Double
  ): AnonIsFillingDynamicDropdown = {
    val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown.asInstanceOf[js.Any], isLoadingSample = isLoadingSample.asInstanceOf[js.Any], isPopulatingDedupe = isPopulatingDedupe.asInstanceOf[js.Any], isTestingAuth = isTestingAuth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsFillingDynamicDropdown]
  }
  @scala.inline
  implicit class AnonIsFillingDynamicDropdownOps[Self <: AnonIsFillingDynamicDropdown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFillingDynamicDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFillingDynamicDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoadingSample(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingSample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPopulatingDedupe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopulatingDedupe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTestingAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTestingAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZap(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zap")(js.undefined)
        ret
    }
  }
  
}

