package typingsSlinky.three.meshPhysicalMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.meshStandardMaterialMod.MeshStandardMaterial
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  
  var clearcoat: Double = js.native
  
  var clearcoatMap: Texture | Null = js.native
  
  var clearcoatNormalMap: Texture | Null = js.native
  
  var clearcoatNormalScale: Vector2 = js.native
  
  var clearcoatRoughness: Double = js.native
  
  var clearcoatRoughnessMap: Texture | Null = js.native
  
  var reflectivity: Double = js.native
  
  var sheen: Color | Null = js.native
  
  var transmission: Double = js.native
  
  var transmissionMap: Texture | Null = js.native
}
