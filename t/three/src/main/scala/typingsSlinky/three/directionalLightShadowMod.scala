package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.lightShadowMod.LightShadow
import typingsSlinky.three.orthographicCameraMod.OrthographicCamera
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalLightShadowMod {
  
  @JSImport("three/src/lights/DirectionalLightShadow", "DirectionalLightShadow")
  @js.native
  class DirectionalLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_DirectionalLightShadow: OrthographicCamera = js.native
    
    val isDirectionalLightShadow: `true` = js.native
  }
}
