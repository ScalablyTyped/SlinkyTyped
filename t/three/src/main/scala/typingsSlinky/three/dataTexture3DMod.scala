package typingsSlinky.three

import typingsSlinky.three.polyfillsMod.TypedArray
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTexture3DMod {
  
  @JSImport("three/src/textures/DataTexture3D", "DataTexture3D")
  @js.native
  class DataTexture3D protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
    
    val isDataTexture3D: `true` = js.native
    
    /**
    	 * @default THREE.ClampToEdgeWrapping
    	 */
    var wrapR: Boolean = js.native
  }
}
