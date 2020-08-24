package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/AxesHelper", JSImport.Namespace)
@js.native
object axesHelperMod extends js.Object {
  @js.native
  class AxesHelper ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double) = this()
  }
  
}

