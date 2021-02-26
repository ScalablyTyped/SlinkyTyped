package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.voronoi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var `type`: voronoi = js.native
  
  var x: FieldRef = js.native
  
  var y: FieldRef = js.native
}
object VoronoiTransform {
  
  @scala.inline
  def apply(`type`: voronoi, x: FieldRef, y: FieldRef): VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiTransform]
  }
  
  @scala.inline
  implicit class VoronoiTransformMutableBuilder[Self <: VoronoiTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: voronoi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
