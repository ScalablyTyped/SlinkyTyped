package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typingsSlinky.three.object3DMod.Object3D,
    scene: typingsSlinky.three.sceneMod.Scene,
    parent: typingsSlinky.three.object3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typingsSlinky.three.geometryMod.Geometry,
    materials: js.Array[typingsSlinky.three.materialMod.Material]
  ): typingsSlinky.three.object3DMod.Object3D = js.native
  def detach(
    child: typingsSlinky.three.object3DMod.Object3D,
    parent: typingsSlinky.three.object3DMod.Object3D,
    scene: typingsSlinky.three.sceneMod.Scene
  ): Unit = js.native
}

