package typingsSlinky.three

import typingsSlinky.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/core/Font", JSImport.Namespace)
@js.native
object fontMod extends js.Object {
  
  @js.native
  class Font protected () extends js.Object {
    def this(jsondata: js.Any) = this()
    
    var data: String = js.native
    
    def generateShapes(text: String, size: Double): js.Array[Shape] = js.native
    
    /**
    	 * @default 'Font'
    	 */
    var `type`: String = js.native
  }
}
