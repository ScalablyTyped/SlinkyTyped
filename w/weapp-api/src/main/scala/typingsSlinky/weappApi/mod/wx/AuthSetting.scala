package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用户授权结果，参考 type Scope
  */
@js.native
trait AuthSetting extends StObject {
  
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
  
  @JSName("scope.werun")
  var scopeDotwerun: Boolean = js.native
  
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingMutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDotaddress(value: Boolean): Self = StObject.set(x, "scope.address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotcamera(value: Boolean): Self = StObject.set(x, "scope.camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotinvoice(value: Boolean): Self = StObject.set(x, "scope.invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotinvoiceTitle(value: Boolean): Self = StObject.set(x, "scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotrecord(value: Boolean): Self = StObject.set(x, "scope.record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotuserInfo(value: Boolean): Self = StObject.set(x, "scope.userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotuserLocation(value: Boolean): Self = StObject.set(x, "scope.userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotwerun(value: Boolean): Self = StObject.set(x, "scope.werun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotwritePhotosAlbum(value: Boolean): Self = StObject.set(x, "scope.writePhotosAlbum", value.asInstanceOf[js.Any])
  }
}
