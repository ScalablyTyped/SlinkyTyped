package typingsSlinky.three

import typingsSlinky.three.anon.MaterialIndexStart
import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.geometryMod.MorphTarget
import typingsSlinky.three.sphereMod.Sphere
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector3Mod.Vector3
import typingsSlinky.three.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/DirectGeometry", JSImport.Namespace)
@js.native
object directGeometryMod extends js.Object {
  
  @js.native
  class DirectGeometry () extends js.Object {
    
    var boundingBox: Box3 | Null = js.native
    
    var boundingSphere: Sphere | Null = js.native
    
    var colors: js.Array[Color] = js.native
    
    var colorsNeedUpdate: Boolean = js.native
    
    def computeBoundingBox(): Unit = js.native
    
    def computeBoundingSphere(): Unit = js.native
    
    def computeGroups(geometry: Geometry): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def fromGeometry(geometry: Geometry): DirectGeometry = js.native
    
    var groups: js.Array[MaterialIndexStart] = js.native
    
    var groupsNeedUpdate: Boolean = js.native
    
    var id: Double = js.native
    
    var indices: js.Array[Double] = js.native
    
    var morphTargets: js.Array[MorphTarget] = js.native
    
    var name: String = js.native
    
    var normals: js.Array[Vector3] = js.native
    
    var normalsNeedUpdate: Boolean = js.native
    
    var skinIndices: js.Array[Vector4] = js.native
    
    var skinWeights: js.Array[Vector4] = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    var uvs: js.Array[Vector2] = js.native
    
    var uvs2: js.Array[Vector2] = js.native
    
    var uvsNeedUpdate: Boolean = js.native
    
    var vertices: js.Array[Vector3] = js.native
    
    var verticesNeedUpdate: Boolean = js.native
  }
}
