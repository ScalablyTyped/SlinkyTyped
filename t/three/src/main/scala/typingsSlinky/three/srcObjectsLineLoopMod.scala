package typingsSlinky.three

import typingsSlinky.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsSlinky.three.srcCoreGeometryMod.Geometry
import typingsSlinky.three.srcMaterialsMaterialMod.Material
import typingsSlinky.three.srcObjectsLineMod.Line
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineLoop", JSImport.Namespace)
@js.native
object srcObjectsLineLoopMod extends js.Object {
  @js.native
  class LineLoop () extends Line {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    var isLineLoop: `true` = js.native
    @JSName("type")
    var type_LineLoop: typingsSlinky.three.threeStrings.LineLoop = js.native
  }
  
}

