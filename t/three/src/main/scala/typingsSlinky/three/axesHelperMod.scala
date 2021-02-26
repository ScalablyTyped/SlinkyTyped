package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesHelperMod {
  
  @JSImport("three/src/helpers/AxesHelper", "AxesHelper")
  @js.native
  /**
  	 * @param [size=1]
  	 */
  class AxesHelper ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double) = this()
  }
}
