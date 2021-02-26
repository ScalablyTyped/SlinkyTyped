package typingsSlinky.three

import typingsSlinky.three.anon.ThresholdAngle
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgesGeometryMod {
  
  @JSImport("three/src/geometries/EdgesGeometry", "EdgesGeometry")
  @js.native
  class EdgesGeometry protected () extends BufferGeometry {
    /**
    	 * @param geometry
    	 * @param [thresholdAngle=1]
    	 */
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Geometry, thresholdAngle: Double) = this()
    
    var parameters: ThresholdAngle = js.native
  }
}
