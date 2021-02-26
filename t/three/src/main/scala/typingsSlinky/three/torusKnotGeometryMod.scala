package typingsSlinky.three

import typingsSlinky.three.anon.P
import typingsSlinky.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object torusKnotGeometryMod {
  
  @JSImport("three/src/geometries/TorusKnotGeometry", "TorusKnotGeometry")
  @js.native
  class TorusKnotGeometry protected () extends Geometry {
    /**
    	 * @param [radius=1]
    	 * @param [tube=0.4]
    	 * @param [radialSegments=64]
    	 * @param [tubularSegments=8]
    	 * @param [p=2]
    	 * @param [q=3]
    	 */
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
    
    var parameters: P = js.native
  }
}
