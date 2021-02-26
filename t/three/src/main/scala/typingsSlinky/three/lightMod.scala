package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightMod {
  
  @JSImport("three/src/lights/Light", "Light")
  @js.native
  class Light () extends Object3D {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(hex: String, intensity: Double) = this()
    def this(hex: Double, intensity: Double) = this()
    
    var color: Color = js.native
    
    /**
    	 * @default 1
    	 */
    var intensity: Double = js.native
    
    val isLight: `true` = js.native
    
    var shadow: LightShadow = js.native
    
    /**
    	 * @deprecated Use shadow.bias instead.
    	 */
    var shadowBias: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.bottom instead.
    	 */
    var shadowCameraBottom: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.far instead.
    	 */
    var shadowCameraFar: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.fov instead.
    	 */
    var shadowCameraFov: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.left instead.
    	 */
    var shadowCameraLeft: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.near instead.
    	 */
    var shadowCameraNear: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.right instead.
    	 */
    var shadowCameraRight: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.camera.top instead.
    	 */
    var shadowCameraTop: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.mapSize.height instead.
    	 */
    var shadowMapHeight: js.Any = js.native
    
    /**
    	 * @deprecated Use shadow.mapSize.width instead.
    	 */
    var shadowMapWidth: js.Any = js.native
  }
}
