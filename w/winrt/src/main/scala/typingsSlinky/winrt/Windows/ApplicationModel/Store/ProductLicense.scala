package typingsSlinky.winrt.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductLicense extends IProductLicense
object ProductLicense {
  
  @scala.inline
  def apply(expirationDate: js.Date, isActive: Boolean, productId: String): ProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductLicense]
  }
}
