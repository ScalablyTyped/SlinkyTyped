package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.PanoramasItemMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypeSelectorParameters extends StObject {
  
  var options: js.UndefOr[PanoramasItemMode] = js.native
}
object ITypeSelectorParameters {
  
  @scala.inline
  def apply(): ITypeSelectorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeSelectorParameters]
  }
  
  @scala.inline
  implicit class ITypeSelectorParametersMutableBuilder[Self <: ITypeSelectorParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: PanoramasItemMode): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
