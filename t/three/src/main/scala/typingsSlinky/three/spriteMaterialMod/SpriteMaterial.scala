package typingsSlinky.three.spriteMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/SpriteMaterial", "SpriteMaterial")
@js.native
class SpriteMaterial () extends Material {
  def this(parameters: SpriteMaterialParameters) = this()
  var color: Color = js.native
  var isSpriteMaterial: `true` = js.native
  var map: Texture | Null = js.native
  var rotation: Double = js.native
  var sizeAttenuation: Boolean = js.native
  def copy(source: SpriteMaterial): this.type = js.native
  def setValues(parameters: SpriteMaterialParameters): Unit = js.native
}

