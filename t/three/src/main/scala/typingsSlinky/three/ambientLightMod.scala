package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ambientLightMod {
  
  @JSImport("three/src/lights/AmbientLight", "AmbientLight")
  @js.native
  /**
  	 * This creates a Ambientlight with a color.
  	 * @param color Numeric value of the RGB component of the color or a Color instance.
  	 * @param [intensity=1]
  	 */
  class AmbientLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    
    val isAmbientLight: `true` = js.native
  }
}
