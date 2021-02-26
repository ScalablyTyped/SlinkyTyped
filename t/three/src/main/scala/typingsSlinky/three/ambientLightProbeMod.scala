package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.lightProbeMod.LightProbe
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ambientLightProbeMod {
  
  @JSImport("three/src/lights/AmbientLightProbe", "AmbientLightProbe")
  @js.native
  class AmbientLightProbe () extends LightProbe {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    
    val isAmbientLightProbe: `true` = js.native
  }
}
