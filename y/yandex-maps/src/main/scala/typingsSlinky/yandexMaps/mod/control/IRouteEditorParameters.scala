package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteEditorParameters extends StObject {
  
  var data: js.UndefOr[Image] = js.native
  
  var options: js.UndefOr[IBaseButtonParametersOptions] = js.native
  
  var state: js.UndefOr[js.Object] = js.native
}
object IRouteEditorParameters {
  
  @scala.inline
  def apply(): IRouteEditorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteEditorParameters]
  }
  
  @scala.inline
  implicit class IRouteEditorParametersMutableBuilder[Self <: IRouteEditorParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Image): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
