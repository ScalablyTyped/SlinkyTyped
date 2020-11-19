package typingsSlinky.three.meshToonMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshToonMaterial", "MeshToonMaterial")
@js.native
class MeshToonMaterial () extends Material {
  def this(parameters: MeshToonMaterialParameters) = this()
  
  var alphaMap: Texture | Null = js.native
  
  var aoMap: Texture | Null = js.native
  
  var aoMapIntensity: Double = js.native
  
  var bumpMap: Texture | Null = js.native
  
  var bumpScale: Double = js.native
  
  var color: Color = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture | Null = js.native
  
  var displacementScale: Double = js.native
  
  var emissive: Color = js.native
  
  var emissiveIntensity: Double = js.native
  
  var emissiveMap: Texture | Null = js.native
  
  var gradientMap: Texture | Null = js.native
  
  var lightMap: Texture | Null = js.native
  
  var lightMapIntensity: Double = js.native
  
  var map: Texture | Null = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  var normalMap: Texture | Null = js.native
  
  var normalMapType: NormalMapTypes = js.native
  
  var normalScale: Vector2 = js.native
  
  def setValues(parameters: MeshToonMaterialParameters): Unit = js.native
  
  var skinning: Boolean = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinecap: String = js.native
  
  var wireframeLinejoin: String = js.native
  
  var wireframeLinewidth: Double = js.native
}
