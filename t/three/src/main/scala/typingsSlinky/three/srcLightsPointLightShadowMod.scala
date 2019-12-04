package typingsSlinky.three

import typingsSlinky.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typingsSlinky.three.srcLightsLightShadowMod.LightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/PointLightShadow", JSImport.Namespace)
@js.native
object srcLightsPointLightShadowMod extends js.Object {
  @js.native
  class PointLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
  
}

