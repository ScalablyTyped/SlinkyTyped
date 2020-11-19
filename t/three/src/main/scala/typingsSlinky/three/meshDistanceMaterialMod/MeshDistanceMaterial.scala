package typingsSlinky.three.meshDistanceMaterialMod

import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
@js.native
class MeshDistanceMaterial () extends Material {
  def this(parameters: MeshDistanceMaterialParameters) = this()
  
  var alphaMap: Texture | Null = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture | Null = js.native
  
  var displacementScale: Double = js.native
  
  var farDistance: Double = js.native
  
  var map: Texture | Null = js.native
  
  var nearDistance: Double = js.native
  
  var referencePosition: Vector3 = js.native
  
  def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
}
