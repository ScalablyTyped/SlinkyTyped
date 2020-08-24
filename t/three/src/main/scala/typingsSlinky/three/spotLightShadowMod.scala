package typingsSlinky.three

import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.perspectiveCameraMod.PerspectiveCamera
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLightShadow", JSImport.Namespace)
@js.native
object spotLightShadowMod extends js.Object {
  @js.native
  class SpotLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
    val isSpotLightShadow: `true` = js.native
  }
  
}

