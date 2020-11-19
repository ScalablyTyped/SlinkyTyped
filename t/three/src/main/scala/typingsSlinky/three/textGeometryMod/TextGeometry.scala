package typingsSlinky.three.textGeometryMod

import typingsSlinky.three.anon.BevelEnabled
import typingsSlinky.three.extrudeGeometryMod.ExtrudeGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TextGeometry", "TextGeometry")
@js.native
class TextGeometry protected () extends ExtrudeGeometry {
  def this(text: String, parameters: TextGeometryParameters) = this()
  
  var parameters: BevelEnabled = js.native
}
