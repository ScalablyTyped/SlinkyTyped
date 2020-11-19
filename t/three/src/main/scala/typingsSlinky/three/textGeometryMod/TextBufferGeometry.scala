package typingsSlinky.three.textGeometryMod

import typingsSlinky.three.anon.BevelEnabled
import typingsSlinky.three.extrudeGeometryMod.ExtrudeBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TextGeometry", "TextBufferGeometry")
@js.native
class TextBufferGeometry protected () extends ExtrudeBufferGeometry {
  def this(text: String, parameters: TextGeometryParameters) = this()
  
  var parameters: BevelEnabled = js.native
}
