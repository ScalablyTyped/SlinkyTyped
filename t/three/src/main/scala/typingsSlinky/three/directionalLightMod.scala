package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.directionalLightShadowMod.DirectionalLightShadow
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/DirectionalLight", JSImport.Namespace)
@js.native
object directionalLightMod extends js.Object {
  
  @js.native
  class DirectionalLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    
    val isDirectionalLight: `true` = js.native
    
    @JSName("shadow")
    var shadow_DirectionalLight: DirectionalLightShadow = js.native
    
    /**
    	 * Target used for shadow camera orientation.
    	 */
    var target: Object3D = js.native
  }
}
