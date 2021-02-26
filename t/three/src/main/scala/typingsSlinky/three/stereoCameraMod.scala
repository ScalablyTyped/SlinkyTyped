package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.perspectiveCameraMod.PerspectiveCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoCameraMod {
  
  @JSImport("three/src/cameras/StereoCamera", "StereoCamera")
  @js.native
  class StereoCamera () extends Camera {
    
    /**
    	 * @default 1
    	 */
    var aspect: Double = js.native
    
    var cameraL: PerspectiveCamera = js.native
    
    var cameraR: PerspectiveCamera = js.native
    
    /**
    	 * @default 0.064
    	 */
    var eyeSep: Double = js.native
    
    @JSName("type")
    var type_StereoCamera: typingsSlinky.three.threeStrings.StereoCamera = js.native
    
    def update(camera: PerspectiveCamera): Unit = js.native
  }
}
