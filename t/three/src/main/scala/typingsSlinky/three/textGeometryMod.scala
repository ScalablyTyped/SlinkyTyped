package typingsSlinky.three

import typingsSlinky.three.anon.BevelEnabled
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.textBufferGeometryMod.TextGeometryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TextGeometry", JSImport.Namespace)
@js.native
object textGeometryMod extends js.Object {
  
  @js.native
  class TextGeometry protected () extends Geometry {
    def this(text: String, parameters: TextGeometryParameters) = this()
    
    var parameters: BevelEnabled = js.native
  }
}
