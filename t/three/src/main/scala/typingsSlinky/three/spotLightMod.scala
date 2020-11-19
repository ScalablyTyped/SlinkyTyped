package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.spotLightShadowMod.SpotLightShadow
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/SpotLight", JSImport.Namespace)
@js.native
object spotLightMod extends js.Object {
  
  @js.native
  class SpotLight protected () extends Light {
    def this(
      color: js.UndefOr[Color | String | Double],
      intensity: js.UndefOr[Double],
      distance: js.UndefOr[Double],
      angle: js.UndefOr[Double],
      penumbra: js.UndefOr[Double],
      decay: js.UndefOr[Double]
    ) = this()
    
    /*
    	 * Maximum extent of the spotlight, in radians, from its direction.
    	 * Default — Math.PI/2.
    	 */
    var angle: Double = js.native
    
    var decay: Double = js.native
    
    /**
    	 * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    	 * Default — 0.0.
    	 */
    var distance: Double = js.native
    
    val isSpotLight: `true` = js.native
    
    var penumbra: Double = js.native
    
    var power: Double = js.native
    
    @JSName("shadow")
    var shadow_SpotLight: SpotLightShadow = js.native
    
    /**
    	 * Spotlight focus points at target.position.
    	 * Default position — (0,0,0).
    	 */
    var target: Object3D = js.native
  }
}
