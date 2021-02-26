package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRouteModelJson extends StObject {
  
  var params: IMultiRouteParams = js.native
  
  var referencePoints: js.Array[IMultiRouteReferencePoint] = js.native
}
object IMultiRouteModelJson {
  
  @scala.inline
  def apply(params: IMultiRouteParams, referencePoints: js.Array[IMultiRouteReferencePoint]): IMultiRouteModelJson = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], referencePoints = referencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiRouteModelJson]
  }
  
  @scala.inline
  implicit class IMultiRouteModelJsonMutableBuilder[Self <: IMultiRouteModelJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: IMultiRouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePoints(value: js.Array[IMultiRouteReferencePoint]): Self = StObject.set(x, "referencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePointsVarargs(value: IMultiRouteReferencePoint*): Self = StObject.set(x, "referencePoints", js.Array(value :_*))
  }
}
