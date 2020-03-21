package typingsSlinky.three.meshToonMaterialMod

import typingsSlinky.three.meshPhongMaterialMod.MeshPhongMaterial
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshToonMaterial", "MeshToonMaterial")
@js.native
class MeshToonMaterial () extends MeshPhongMaterial {
  def this(parameters: MeshToonMaterialParameters) = this()
  var gradientMap: Texture | Null = js.native
  def setValues(parameters: MeshToonMaterialParameters): Unit = js.native
}

