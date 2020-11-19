package typingsSlinky.three

import typingsSlinky.three.anon.Detail
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.polyhedronGeometryMod.PolyhedronBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/DodecahedronGeometry", JSImport.Namespace)
@js.native
object dodecahedronGeometryMod extends js.Object {
  
  @js.native
  class DodecahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], detail: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class DodecahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], detail: Double) = this()
    def this(radius: Double, detail: Double) = this()
    
    var parameters: Detail = js.native
  }
}
