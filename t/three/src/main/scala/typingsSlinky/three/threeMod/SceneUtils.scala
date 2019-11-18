package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typingsSlinky.three.srcCoreObject3DMod.Object3D,
    scene: typingsSlinky.three.srcScenesSceneMod.Scene,
    parent: typingsSlinky.three.srcCoreObject3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typingsSlinky.three.srcCoreGeometryMod.Geometry,
    materials: js.Array[typingsSlinky.three.srcMaterialsMaterialMod.Material]
  ): typingsSlinky.three.srcCoreObject3DMod.Object3D = js.native
  def detach(
    child: typingsSlinky.three.srcCoreObject3DMod.Object3D,
    parent: typingsSlinky.three.srcCoreObject3DMod.Object3D,
    scene: typingsSlinky.three.srcScenesSceneMod.Scene
  ): Unit = js.native
}

