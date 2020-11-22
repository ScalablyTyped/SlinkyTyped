package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.pointLightShadowMod.PointLightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/PointLight", JSImport.Namespace)
@js.native
object pointLightMod extends js.Object {
  
  @js.native
  class PointLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: js.UndefOr[scala.Nothing], distance: Double) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double, distance: Double) = this()
    def this(color: String, intensity: js.UndefOr[scala.Nothing], distance: Double) = this()
    def this(color: String, intensity: Double, distance: Double) = this()
    def this(color: Double, intensity: js.UndefOr[scala.Nothing], distance: Double) = this()
    def this(color: Double, intensity: Double, distance: Double) = this()
    def this(color: Color, intensity: js.UndefOr[scala.Nothing], distance: Double) = this()
    def this(color: Color, intensity: Double, distance: Double) = this()
    def this(
      color: js.UndefOr[scala.Nothing],
      intensity: js.UndefOr[scala.Nothing],
      distance: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(
      color: js.UndefOr[scala.Nothing],
      intensity: js.UndefOr[scala.Nothing],
      distance: Double,
      decay: Double
    ) = this()
    def this(
      color: js.UndefOr[scala.Nothing],
      intensity: Double,
      distance: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double, distance: Double, decay: Double) = this()
    def this(
      color: String,
      intensity: js.UndefOr[scala.Nothing],
      distance: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(color: String, intensity: js.UndefOr[scala.Nothing], distance: Double, decay: Double) = this()
    def this(color: String, intensity: Double, distance: js.UndefOr[scala.Nothing], decay: Double) = this()
    def this(color: String, intensity: Double, distance: Double, decay: Double) = this()
    def this(
      color: Double,
      intensity: js.UndefOr[scala.Nothing],
      distance: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(color: Double, intensity: js.UndefOr[scala.Nothing], distance: Double, decay: Double) = this()
    def this(color: Double, intensity: Double, distance: js.UndefOr[scala.Nothing], decay: Double) = this()
    def this(color: Double, intensity: Double, distance: Double, decay: Double) = this()
    def this(
      color: Color,
      intensity: js.UndefOr[scala.Nothing],
      distance: js.UndefOr[scala.Nothing],
      decay: Double
    ) = this()
    def this(color: Color, intensity: js.UndefOr[scala.Nothing], distance: Double, decay: Double) = this()
    def this(color: Color, intensity: Double, distance: js.UndefOr[scala.Nothing], decay: Double) = this()
    def this(color: Color, intensity: Double, distance: Double, decay: Double) = this()
    
    /**
    	 * @default 1
    	 */
    var decay: Double = js.native
    
    /**
    	 * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
    	 * @default 0
    	 */
    var distance: Double = js.native
    
    var power: Double = js.native
    
    /**
    	 * @default new THREE.PointLightShadow()
    	 */
    @JSName("shadow")
    var shadow_PointLight: PointLightShadow = js.native
  }
}
