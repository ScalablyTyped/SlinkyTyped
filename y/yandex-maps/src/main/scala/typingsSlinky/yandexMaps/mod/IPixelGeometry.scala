package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPixelGeometry extends IBaseGeometry {
  
  def equals(geometry: IPixelGeometry): Boolean = js.native
  
  def getMetaData(): js.Object = js.native
  
  def scale(factor: Double): IPixelGeometry = js.native
  
  def shift(offset: js.Array[Double]): IPixelGeometry = js.native
}
object IPixelGeometry {
  
  @scala.inline
  def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelGeometry]
  }
  
  @scala.inline
  implicit class IPixelGeometryMutableBuilder[Self <: IPixelGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: IPixelGeometry => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMetaData(value: () => js.Object): Self = StObject.set(x, "getMetaData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScale(value: Double => IPixelGeometry): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: js.Array[Double] => IPixelGeometry): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
  }
}
