package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.threeStrings.LineLoop
import typingsSlinky.three.threeStrings.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  @js.native
  class Line () extends Object3D {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: js.Array[Material]) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: Material) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: js.Array[Material], mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: Material, mode: Double) = this()
    def this(geometry: BufferGeometry, material: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: BufferGeometry, material: Material, mode: Double) = this()
    def this(geometry: Geometry, material: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(geometry: Geometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: Geometry, material: Material, mode: Double) = this()
    var geometry: Geometry | BufferGeometry = js.native
    var isLine: `true` = js.native
    var material: Material | js.Array[Material] = js.native
    @JSName("type")
    var type_Line: typingsSlinky.three.threeStrings.Line | LineLoop | LineSegments = js.native
    def computeLineDistances(): this.type = js.native
  }
  
}

