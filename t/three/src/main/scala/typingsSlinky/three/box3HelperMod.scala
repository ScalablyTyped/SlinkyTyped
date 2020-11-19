package typingsSlinky.three

import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/Box3Helper", JSImport.Namespace)
@js.native
object box3HelperMod extends js.Object {
  
  @js.native
  class Box3Helper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    
    var box: Box3 = js.native
  }
}
