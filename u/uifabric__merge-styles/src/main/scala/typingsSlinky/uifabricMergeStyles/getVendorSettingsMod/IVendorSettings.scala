package typingsSlinky.uifabricMergeStyles.getVendorSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVendorSettings extends js.Object {
  var isMoz: js.UndefOr[Boolean] = js.native
  var isMs: js.UndefOr[Boolean] = js.native
  var isOpera: js.UndefOr[Boolean] = js.native
  var isWebkit: js.UndefOr[Boolean] = js.native
}

object IVendorSettings {
  @scala.inline
  def apply(): IVendorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVendorSettings]
  }
  @scala.inline
  implicit class IVendorSettingsOps[Self <: IVendorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMoz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMoz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoz")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMs")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWebkit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebkit")(js.undefined)
        ret
    }
  }
  
}

