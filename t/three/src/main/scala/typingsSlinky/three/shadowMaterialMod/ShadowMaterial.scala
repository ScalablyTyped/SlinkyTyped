package typingsSlinky.three.shadowMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/ShadowMaterial", "ShadowMaterial")
@js.native
class ShadowMaterial () extends Material {
  def this(parameters: ShadowMaterialParameters) = this()
  
  /**
  	 * @default new THREE.Color( 0x000000 )
  	 */
  var color: Color = js.native
}
