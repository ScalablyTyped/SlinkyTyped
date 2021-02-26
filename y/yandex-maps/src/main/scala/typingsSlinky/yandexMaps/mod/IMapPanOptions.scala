package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapPanOptions extends IMapPositionOptions {
  
  var delay: js.UndefOr[Double] = js.native
  
  var flying: js.UndefOr[Boolean] = js.native
  
  var safe: js.UndefOr[Boolean] = js.native
}
object IMapPanOptions {
  
  @scala.inline
  def apply(): IMapPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPanOptions]
  }
  
  @scala.inline
  implicit class IMapPanOptionsMutableBuilder[Self <: IMapPanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFlying(value: Boolean): Self = StObject.set(x, "flying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlyingUndefined: Self = StObject.set(x, "flying", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
