package typingsSlinky.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in weixin-app.wx.Scope ]: boolean} */
@js.native
trait keyinScopeboolean extends js.Object {
  @JSName("scope.address")
  var scopeDotaddress: Boolean = js.native
  @JSName("scope.camera")
  var scopeDotcamera: Boolean = js.native
  @JSName("scope.invoice")
  var scopeDotinvoice: Boolean = js.native
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: Boolean = js.native
  @JSName("scope.record")
  var scopeDotrecord: Boolean = js.native
  @JSName("scope.userInfo")
  var scopeDotuserInfo: Boolean = js.native
  @JSName("scope.userLocation")
  var scopeDotuserLocation: Boolean = js.native
  @JSName("scope.userLocationBackground")
  var scopeDotuserLocationBackground: Boolean = js.native
  @JSName("scope.werun")
  var scopeDotwerun: Boolean = js.native
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean = js.native
}

object keyinScopeboolean {
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotuserLocationBackground: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): keyinScopeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocationBackground")(scopeDotuserLocationBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScopeboolean]
  }
  @scala.inline
  implicit class keyinScopebooleanOps[Self <: keyinScopeboolean] (val x: Self) extends AnyVal {
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
    def withScopeDotcamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotinvoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotinvoiceTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoiceTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotrecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotuserInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotuserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotuserLocationBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userLocationBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotwerun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.werun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotwritePhotosAlbum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.writePhotosAlbum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

