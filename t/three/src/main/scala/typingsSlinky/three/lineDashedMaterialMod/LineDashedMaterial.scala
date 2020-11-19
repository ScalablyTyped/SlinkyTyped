package typingsSlinky.three.lineDashedMaterialMod

import typingsSlinky.three.lineBasicMaterialMod.LineBasicMaterial
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
@js.native
class LineDashedMaterial () extends LineBasicMaterial {
  def this(parameters: LineDashedMaterialParameters) = this()
  
  var dashSize: Double = js.native
  
  var gapSize: Double = js.native
  
  val isLineDashedMaterial: `true` = js.native
  
  var scale: Double = js.native
  
  def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
}
