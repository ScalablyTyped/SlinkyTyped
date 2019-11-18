package typingsSlinky.three

import typingsSlinky.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsSlinky.three.srcCoreGeometryMod.Geometry
import typingsSlinky.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ParametricGeometry", JSImport.Namespace)
@js.native
object srcGeometriesParametricGeometryMod extends js.Object {
  @js.native
  class ParametricBufferGeometry protected () extends BufferGeometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    var parameters: Anon_Dest = js.native
  }
  
  @js.native
  class ParametricGeometry protected () extends Geometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    var parameters: Anon_Dest = js.native
  }
  
}

