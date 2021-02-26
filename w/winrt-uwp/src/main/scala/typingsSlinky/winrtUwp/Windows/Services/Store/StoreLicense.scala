package typingsSlinky.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides license info for an add-on that is associated with the current app. */
@js.native
trait StoreLicense extends StObject {
  
  /** Gets the expiration date and time for the add-on license. */
  var expirationDate: js.Date = js.native
  
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String = js.native
  
  /** Gets in the product ID for the add-on. */
  var inAppOfferToken: String = js.native
  
  /** Gets a value that indicates whether the add-on license is active. */
  var isActive: Boolean = js.native
  
  /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
  var skuStoreId: String = js.native
}
object StoreLicense {
  
  @scala.inline
  def apply(
    expirationDate: js.Date,
    extendedJsonData: String,
    inAppOfferToken: String,
    isActive: Boolean,
    skuStoreId: String
  ): StoreLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], inAppOfferToken = inAppOfferToken.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], skuStoreId = skuStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLicense]
  }
  
  @scala.inline
  implicit class StoreLicenseMutableBuilder[Self <: StoreLicense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedJsonData(value: String): Self = StObject.set(x, "extendedJsonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppOfferToken(value: String): Self = StObject.set(x, "inAppOfferToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuStoreId(value: String): Self = StObject.set(x, "skuStoreId", value.asInstanceOf[js.Any])
  }
}
