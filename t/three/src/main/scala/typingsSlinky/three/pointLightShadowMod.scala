package typingsSlinky.three

import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.perspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/PointLightShadow", JSImport.Namespace)
@js.native
object pointLightShadowMod extends js.Object {
  
  @js.native
  class PointLightShadow () extends LightShadow {
    
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
}
