package typingsSlinky.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneUtils {
  
  @JSImport("three", "SceneUtils.attach")
  @js.native
  def attach(
    child: typingsSlinky.three.object3DMod.Object3D,
    scene: typingsSlinky.three.sceneMod.Scene,
    parent: typingsSlinky.three.object3DMod.Object3D
  ): Unit = js.native
  
  @JSImport("three", "SceneUtils.createMultiMaterialObject")
  @js.native
  def createMultiMaterialObject(
    geometry: typingsSlinky.three.geometryMod.Geometry,
    materials: js.Array[typingsSlinky.three.materialMod.Material]
  ): typingsSlinky.three.object3DMod.Object3D = js.native
  
  @JSImport("three", "SceneUtils.detach")
  @js.native
  def detach(
    child: typingsSlinky.three.object3DMod.Object3D,
    parent: typingsSlinky.three.object3DMod.Object3D,
    scene: typingsSlinky.three.sceneMod.Scene
  ): Unit = js.native
}
