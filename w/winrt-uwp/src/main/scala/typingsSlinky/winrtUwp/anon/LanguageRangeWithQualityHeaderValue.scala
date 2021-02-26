package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageRangeWithQualityHeaderValue extends StObject {
  
  /** The HttpLanguageRangeWithQualityHeaderValue version of the string. */ var languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue = js.native
  
  /** true if input is valid HttpLanguageRangeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object LanguageRangeWithQualityHeaderValue {
  
  @scala.inline
  def apply(languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue, returnValue: Boolean): LanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRangeWithQualityHeaderValue = languageRangeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRangeWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit class LanguageRangeWithQualityHeaderValueMutableBuilder[Self <: LanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageRangeWithQualityHeaderValue(value: HttpLanguageRangeWithQualityHeaderValue): Self = StObject.set(x, "languageRangeWithQualityHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
