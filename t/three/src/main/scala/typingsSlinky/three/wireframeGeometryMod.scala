package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/WireframeGeometry", JSImport.Namespace)
@js.native
object wireframeGeometryMod extends js.Object {
  @js.native
  class WireframeGeometry protected () extends BufferGeometry {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
  }
  
}

