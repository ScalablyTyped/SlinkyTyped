package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.projectionMod.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentProjection extends StObject {
  
  var parentProjection: Projection = js.native
  
  var projection: Projection = js.native
}
object ParentProjection {
  
  @scala.inline
  def apply(parentProjection: Projection, projection: Projection): ParentProjection = {
    val __obj = js.Dynamic.literal(parentProjection = parentProjection.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentProjection]
  }
  
  @scala.inline
  implicit class ParentProjectionMutableBuilder[Self <: ParentProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentProjection(value: Projection): Self = StObject.set(x, "parentProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
