package typingsSlinky.three.shadowMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/ShadowMaterial", "ShadowMaterial")
@js.native
class ShadowMaterial () extends Material {
  def this(parameters: ShadowMaterialParameters) = this()
  var color: Color = js.native
}

