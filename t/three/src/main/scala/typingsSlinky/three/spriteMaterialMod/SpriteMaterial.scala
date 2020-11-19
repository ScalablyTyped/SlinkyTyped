package typingsSlinky.three.spriteMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/SpriteMaterial", "SpriteMaterial")
@js.native
class SpriteMaterial () extends Material {
  def this(parameters: SpriteMaterialParameters) = this()
  
  var alphaMap: Texture | Null = js.native
  
  var color: Color = js.native
  
  def copy(source: SpriteMaterial): this.type = js.native
  
  val isSpriteMaterial: `true` = js.native
  
  var map: Texture | Null = js.native
  
  var rotation: Double = js.native
  
  def setValues(parameters: SpriteMaterialParameters): Unit = js.native
  
  var sizeAttenuation: Boolean = js.native
}
