package typingsSlinky.three

import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.orthographicCameraMod.OrthographicCamera
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/DirectionalLightShadow", JSImport.Namespace)
@js.native
object directionalLightShadowMod extends js.Object {
  
  @js.native
  class DirectionalLightShadow () extends LightShadow {
    
    @JSName("camera")
    var camera_DirectionalLightShadow: OrthographicCamera = js.native
    
    val isDirectionalLightShadow: `true` = js.native
  }
}
