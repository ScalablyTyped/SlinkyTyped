package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSetting extends js.Object {
  /**
    * 是否授权通讯地址
    */
  @JSName("scope.address")
  var scopeDotaddress: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权摄像头
    */
  @JSName("scope.camera")
  var scopeDotcamera: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权获取发票
    */
  @JSName("scope.invoice")
  var scopeDotinvoice: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权发票抬头
    */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权录音功能
    */
  @JSName("scope.record")
  var scopeDotrecord: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权用户信息
    */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权地理位置
    */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权微信运动步数
    */
  @JSName("scope.werun")
  var scopeDotwerun: js.UndefOr[Boolean] = js.native
  /**
    * 是否授权保存到相册
    */
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.native
}

object AuthSetting {
  @scala.inline
  def apply(): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthSetting]
  }
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDotaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.address")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotcamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotcamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.camera")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotinvoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotinvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoice")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotinvoiceTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoiceTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotinvoiceTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoiceTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotrecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotrecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.record")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotuserInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotuserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotuserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotuserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotwerun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.werun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotwerun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.werun")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeDotwritePhotosAlbum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.writePhotosAlbum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDotwritePhotosAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.writePhotosAlbum")(js.undefined)
        ret
    }
  }
  
}

