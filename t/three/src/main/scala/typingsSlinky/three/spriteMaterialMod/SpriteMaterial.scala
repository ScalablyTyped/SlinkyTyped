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
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
  /**
  	 * @default new THREE.Color( 0xffffff )
  	 */
  var color: Color = js.native
  
  def copy(source: SpriteMaterial): this.type = js.native
  
  val isSpriteMaterial: `true` = js.native
  
  /**
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @default 0
  	 */
  var rotation: Double = js.native
  
  def setValues(parameters: SpriteMaterialParameters): Unit = js.native
  
  /**
  	 * @default true
  	 */
  var sizeAttenuation: Boolean = js.native
}
