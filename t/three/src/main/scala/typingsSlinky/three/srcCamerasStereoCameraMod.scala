package typingsSlinky.three

import typingsSlinky.three.srcCamerasCameraMod.Camera
import typingsSlinky.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/StereoCamera", JSImport.Namespace)
@js.native
object srcCamerasStereoCameraMod extends js.Object {
  @js.native
  class StereoCamera () extends Camera {
    var aspect: Double = js.native
    var cameraL: PerspectiveCamera = js.native
    var cameraR: PerspectiveCamera = js.native
    var eyeSep: Double = js.native
    @JSName("type")
    var type_StereoCamera: typingsSlinky.three.threeStrings.StereoCamera = js.native
    def update(camera: PerspectiveCamera): Unit = js.native
  }
  
}

