package typingsSlinky.three

import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three.Legacy", JSImport.Namespace)
@js.native
object threeLegacyMod extends js.Object {
  
  val FaceColors: Colors = js.native
  
  val NoColors: Colors = js.native
  
  val VertexColors: Colors = js.native
  
  @js.native
  sealed trait Colors extends js.Object
  @js.native
  object Colors extends js.Object {
    
    @JSBracketAccess
    def apply(value: scala.Nothing): js.UndefOr[Colors with scala.Nothing] = js.native
  }
  
  @js.native
  class MultiMaterial () extends Material {
    def this(materials: js.Array[Material]) = this()
    
    val isMultiMaterial: `true` = js.native
    
    var materials: js.Array[Material] = js.native
  }
  
  @js.native
  object SceneUtils extends js.Object {
    
    def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
    
    def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
    
    def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  }
}
