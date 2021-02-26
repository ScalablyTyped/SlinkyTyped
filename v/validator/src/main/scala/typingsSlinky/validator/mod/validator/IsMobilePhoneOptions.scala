package typingsSlinky.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMobilePhoneOptions extends StObject {
  
  /**
    * If this is set to `true`, the mobile phone number must be supplied with the country code and therefore must start with `+`.
    *
    * @default false
    */
  var strictMode: js.UndefOr[Boolean] = js.native
}
object IsMobilePhoneOptions {
  
  @scala.inline
  def apply(): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
  
  @scala.inline
  implicit class IsMobilePhoneOptionsMutableBuilder[Self <: IsMobilePhoneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
