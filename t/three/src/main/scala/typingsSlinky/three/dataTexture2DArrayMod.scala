package typingsSlinky.three

import typingsSlinky.three.polyfillsMod.TypedArray
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/DataTexture2DArray", JSImport.Namespace)
@js.native
object dataTexture2DArrayMod extends js.Object {
  
  @js.native
  class DataTexture2DArray protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
    
    val isDataTexture2DArray: `true` = js.native
    
    /**
    	 * @default THREE.ClampToEdgeWrapping
    	 */
    var wrapR: Boolean = js.native
  }
}
