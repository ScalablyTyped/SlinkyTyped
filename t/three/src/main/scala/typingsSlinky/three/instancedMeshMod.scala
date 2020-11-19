package typingsSlinky.three

import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/InstancedMesh", JSImport.Namespace)
@js.native
object instancedMeshMod extends js.Object {
  
  @js.native
  class InstancedMesh[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] protected ()
    extends Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
    
    var count: Double = js.native
    
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    
    var instanceMatrix: BufferAttribute = js.native
    
    val isInstancedMesh: `true` = js.native
    
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
}
