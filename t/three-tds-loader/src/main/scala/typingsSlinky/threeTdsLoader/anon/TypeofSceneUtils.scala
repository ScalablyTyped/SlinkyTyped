package typingsSlinky.threeTdsLoader.anon

import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSceneUtils extends StObject {
  
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
  
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
  
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
}
object TypeofSceneUtils {
  
  @scala.inline
  def apply(
    attach: (Object3D, Scene, Object3D) => Unit,
    createMultiMaterialObject: (Geometry, js.Array[Material]) => Object3D,
    detach: (Object3D, Object3D, Scene) => Unit
  ): TypeofSceneUtils = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
    __obj.asInstanceOf[TypeofSceneUtils]
  }
  
  @scala.inline
  implicit class TypeofSceneUtilsMutableBuilder[Self <: TypeofSceneUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: (Object3D, Scene, Object3D) => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateMultiMaterialObject(value: (Geometry, js.Array[Material]) => Object3D): Self = StObject.set(x, "createMultiMaterialObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDetach(value: (Object3D, Object3D, Scene) => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction3(value))
  }
}
