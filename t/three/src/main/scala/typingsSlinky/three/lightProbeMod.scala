package typingsSlinky.three

import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.sphericalHarmonics3Mod.SphericalHarmonics3
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightProbeMod {
  
  @JSImport("three/src/lights/LightProbe", "LightProbe")
  @js.native
  class LightProbe () extends Light {
    def this(sh: SphericalHarmonics3) = this()
    def this(sh: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(sh: SphericalHarmonics3, intensity: Double) = this()
    
    def fromJSON(json: js.Object): LightProbe = js.native
    
    val isLightProbe: `true` = js.native
    
    /**
    	 * @default new THREE.SphericalHarmonics3()
    	 */
    var sh: SphericalHarmonics3 = js.native
  }
}
