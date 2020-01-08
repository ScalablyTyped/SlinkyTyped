package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.three.srcConstantsMod.TrianglesDrawModes
import typingsSlinky.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsSlinky.three.srcCoreGeometryMod.Geometry
import typingsSlinky.three.srcCoreObject3DMod.Object3D
import typingsSlinky.three.srcMaterialsMaterialMod.Material
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Mesh", JSImport.Namespace)
@js.native
object srcObjectsMeshMod extends js.Object {
  @js.native
  class Mesh () extends Object3D {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    var drawMode: TrianglesDrawModes = js.native
    var geometry: Geometry | BufferGeometry = js.native
    var isMesh: `true` = js.native
    var material: Material | js.Array[Material] = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    def setDrawMode(drawMode: TrianglesDrawModes): Unit = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

