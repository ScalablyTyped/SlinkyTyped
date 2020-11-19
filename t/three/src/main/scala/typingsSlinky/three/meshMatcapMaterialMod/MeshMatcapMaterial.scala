package typingsSlinky.three.meshMatcapMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshMatcapMaterial", "MeshMatcapMaterial")
@js.native
class MeshMatcapMaterial () extends Material {
  def this(parameters: MeshMatcapMaterialParameters) = this()
  
  var alphaMap: Texture | Null = js.native
  
  var bumpMap: Texture | Null = js.native
  
  var bumpScale: Double = js.native
  
  var color: Color = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture | Null = js.native
  
  var displacementScale: Double = js.native
  
  var map: Texture | Null = js.native
  
  var matcap: Texture | Null = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  var normalMap: Texture | Null = js.native
  
  var normalMapType: NormalMapTypes = js.native
  
  var normalScale: Vector2 = js.native
  
  def setValues(parameters: MeshMatcapMaterialParameters): Unit = js.native
  
  var skinning: Boolean = js.native
}
