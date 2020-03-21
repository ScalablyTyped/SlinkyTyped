package typingsSlinky.three.meshPhysicalMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.meshStandardMaterialMod.MeshStandardMaterial
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearcoat: Double = js.native
  var clearcoatNormalMap: Texture | Null = js.native
  var clearcoatNormalScale: Vector2 = js.native
  var clearcoatRoughness: Double = js.native
  var reflectivity: Double = js.native
  var sheen: Color | Null = js.native
}

