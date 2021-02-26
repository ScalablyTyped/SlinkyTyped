package typingsSlinky.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P extends StObject {
  
  var p: Double = js.native
  
  var q: Double = js.native
  
  var radialSegments: Double = js.native
  
  var radius: Double = js.native
  
  var tube: Double = js.native
  
  var tubularSegments: Double = js.native
}
object P {
  
  @scala.inline
  def apply(
    p: Double,
    q: Double,
    radialSegments: Double,
    radius: Double,
    tube: Double,
    tubularSegments: Double
  ): P = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[P]
  }
  
  @scala.inline
  implicit class PMutableBuilder[Self <: P] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTube(value: Double): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
  }
}
