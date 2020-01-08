package typingsSlinky.three

import typingsSlinky.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsSlinky.three.srcCoreGeometryMod.Geometry
import typingsSlinky.three.srcMaterialsMaterialMod.Material
import typingsSlinky.three.srcObjectsLineMod.Line
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineSegments", JSImport.Namespace)
@js.native
object srcObjectsLineSegmentsMod extends js.Object {
  @js.native
  class LineSegments () extends Line {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: BufferGeometry, material: Material, mode: Double) = this()
    def this(geometry: Geometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: Geometry, material: Material, mode: Double) = this()
    var isLineSegments: `true` = js.native
    @JSName("type")
    var type_LineSegments: typingsSlinky.three.threeStrings.LineSegments = js.native
  }
  
  val LinePieces: Double = js.native
  val LineStrip: Double = js.native
}

