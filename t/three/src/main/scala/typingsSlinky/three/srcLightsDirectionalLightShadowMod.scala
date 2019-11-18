package typingsSlinky.three

import typingsSlinky.three.srcCamerasOrthographicCameraMod.OrthographicCamera
import typingsSlinky.three.srcLightsLightShadowMod.LightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/DirectionalLightShadow", JSImport.Namespace)
@js.native
object srcLightsDirectionalLightShadowMod extends js.Object {
  @js.native
  class DirectionalLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_DirectionalLightShadow: OrthographicCamera = js.native
  }
  
}

