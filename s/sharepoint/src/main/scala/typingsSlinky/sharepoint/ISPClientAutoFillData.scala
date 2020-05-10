package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISPClientAutoFillData extends js.Object {
  var AutoFillDisplayText: js.UndefOr[String] = js.native
  var AutoFillKey: js.UndefOr[js.Any] = js.native
  var AutoFillMenuOptionType: js.UndefOr[Double] = js.native
  var AutoFillSubDisplayText: js.UndefOr[String] = js.native
  var AutoFillTitleText: js.UndefOr[String] = js.native
}

object ISPClientAutoFillData {
  @scala.inline
  def apply(): ISPClientAutoFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientAutoFillData]
  }
  @scala.inline
  implicit class ISPClientAutoFillDataOps[Self <: ISPClientAutoFillData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFillDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillMenuOptionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillMenuOptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillMenuOptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillMenuOptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillSubDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillSubDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillSubDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillSubDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillTitleText")(js.undefined)
        ret
    }
  }
  
}

