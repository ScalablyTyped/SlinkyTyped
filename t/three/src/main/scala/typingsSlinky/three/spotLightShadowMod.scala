package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.perspectiveCameraMod.PerspectiveCamera
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotLightShadowMod {
  
  @JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
  @js.native
  class SpotLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
    
    /**
    	 * @default 1
    	 */
    var focus: Double = js.native
    
    val isSpotLightShadow: `true` = js.native
  }
}
