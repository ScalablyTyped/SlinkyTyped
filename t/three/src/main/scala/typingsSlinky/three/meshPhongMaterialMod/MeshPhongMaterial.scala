package typingsSlinky.three.meshPhongMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.Combine
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshPhongMaterial", "MeshPhongMaterial")
@js.native
class MeshPhongMaterial () extends Material {
  def this(parameters: MeshPhongMaterialParameters) = this()
  
  var alphaMap: Texture | Null = js.native
  
  var aoMap: Texture | Null = js.native
  
  var aoMapIntensity: Double = js.native
  
  var bumpMap: Texture | Null = js.native
  
  var bumpScale: Double = js.native
  
  var color: Color = js.native
  
  var combine: Combine = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture | Null = js.native
  
  var displacementScale: Double = js.native
  
  var emissive: Color = js.native
  
  var emissiveIntensity: Double = js.native
  
  var emissiveMap: Texture | Null = js.native
  
  var envMap: Texture | Null = js.native
  
  var lightMap: Texture | Null = js.native
  
  var lightMapIntensity: Double = js.native
  
  var map: Texture | Null = js.native
  
  /**
  	 * @deprecated Use {@link MeshStandardMaterial THREE.MeshStandardMaterial} instead.
  	 */
  var metal: Boolean = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  var normalMap: Texture | Null = js.native
  
  var normalMapType: NormalMapTypes = js.native
  
  var normalScale: Vector2 = js.native
  
  var reflectivity: Double = js.native
  
  var refractionRatio: Double = js.native
  
  def setValues(parameters: MeshPhongMaterialParameters): Unit = js.native
  
  var shininess: Double = js.native
  
  var skinning: Boolean = js.native
  
  var specular: Color = js.native
  
  var specularMap: Texture | Null = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinecap: String = js.native
  
  var wireframeLinejoin: String = js.native
  
  var wireframeLinewidth: Double = js.native
}
