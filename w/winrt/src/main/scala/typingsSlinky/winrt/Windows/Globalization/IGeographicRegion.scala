package typingsSlinky.winrt.Windows.Globalization

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeographicRegion extends StObject {
  
  var code: String = js.native
  
  var codeThreeDigit: String = js.native
  
  var codeThreeLetter: String = js.native
  
  var codeTwoLetter: String = js.native
  
  var currenciesInUse: IVectorView[String] = js.native
  
  var displayName: String = js.native
  
  var nativeName: String = js.native
}
object IGeographicRegion {
  
  @scala.inline
  def apply(
    code: String,
    codeThreeDigit: String,
    codeThreeLetter: String,
    codeTwoLetter: String,
    currenciesInUse: IVectorView[String],
    displayName: String,
    nativeName: String
  ): IGeographicRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeThreeDigit = codeThreeDigit.asInstanceOf[js.Any], codeThreeLetter = codeThreeLetter.asInstanceOf[js.Any], codeTwoLetter = codeTwoLetter.asInstanceOf[js.Any], currenciesInUse = currenciesInUse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeographicRegion]
  }
  
  @scala.inline
  implicit class IGeographicRegionMutableBuilder[Self <: IGeographicRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeThreeDigit(value: String): Self = StObject.set(x, "codeThreeDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeThreeLetter(value: String): Self = StObject.set(x, "codeThreeLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeTwoLetter(value: String): Self = StObject.set(x, "codeTwoLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrenciesInUse(value: IVectorView[String]): Self = StObject.set(x, "currenciesInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeName(value: String): Self = StObject.set(x, "nativeName", value.asInstanceOf[js.Any])
  }
}
