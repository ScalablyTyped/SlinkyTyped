package typingsSlinky.three

import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedMeshMod {
  
  @JSImport("three/src/objects/InstancedMesh", "InstancedMesh")
  @js.native
  class InstancedMesh[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] protected () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
    
    var count: Double = js.native
    
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    
    var instanceMatrix: BufferAttribute = js.native
    
    val isInstancedMesh: `true` = js.native
    
    def setColorAt(index: Double, color: Color): Unit = js.native
    
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
}
