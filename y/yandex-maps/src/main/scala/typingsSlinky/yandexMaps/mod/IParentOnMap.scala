package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParentOnMap extends StObject {
  
  def getMap(): Map_ = js.native
}
object IParentOnMap {
  
  @scala.inline
  def apply(getMap: () => Map_): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IParentOnMap]
  }
  
  @scala.inline
  implicit class IParentOnMapMutableBuilder[Self <: IParentOnMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
  }
}
