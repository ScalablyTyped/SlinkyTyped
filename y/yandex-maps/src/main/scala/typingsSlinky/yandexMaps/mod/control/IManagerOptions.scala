package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.IPane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManagerOptions extends StObject {
  
  var margin: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[IPane] = js.native
  
  var states: js.UndefOr[js.Array[String]] = js.native
}
object IManagerOptions {
  
  @scala.inline
  def apply(): IManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerOptions]
  }
  
  @scala.inline
  implicit class IManagerOptionsMutableBuilder[Self <: IManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPane(value: IPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}
