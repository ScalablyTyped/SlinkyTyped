package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeolocationControlParameters extends IButtonParameters {
  
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[Image] = js.native
  
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.native
}
object IGeolocationControlParameters {
  
  @scala.inline
  def apply(): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
  
  @scala.inline
  implicit class IGeolocationControlParametersMutableBuilder[Self <: IGeolocationControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Image): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
