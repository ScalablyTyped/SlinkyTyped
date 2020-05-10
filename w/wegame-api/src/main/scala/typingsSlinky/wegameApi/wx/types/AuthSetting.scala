package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --设置
@js.native
trait AuthSetting extends js.Object {
  /**
    * 通讯地址，对应接口 wx.chooseAddress
    */
  @JSName("scope.address")
  var scopeDotaddress: js.UndefOr[Boolean] = js.native
  /**
    * 摄像头 wx.camera
    */
  @JSName("scope.camera")
  var scopeDotcamera: js.UndefOr[Boolean] = js.native
  /**
    * 发票抬头，对应接口 wx.chooseInvoiceTitle
    */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.native
  /**
    * 录音功能，对应接口 wx.startRecord
    */
  @JSName("scope.record")
  var scopeDotrecord: js.UndefOr[Boolean] = js.native
  /**
    * 用户信息，对应接口 wx.getUserInfo
    */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: js.UndefOr[Boolean] = js.native
  /**
    * 地理位置，对应接口 wx.getLocation wx.chooseLocation
    */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: js.UndefOr[Boolean] = js.native
  /**
    * 微信运动步数，对应接口 wx.getWeRunData
    */
  @JSName("scope.werun")
  var scopeDotwerun: js.UndefOr[Boolean] = js.native
  /**
    * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum
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

