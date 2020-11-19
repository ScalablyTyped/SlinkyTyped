package typingsSlinky.three

import typingsSlinky.three.anon.Enabled
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/cameras/OrthographicCamera", JSImport.Namespace)
@js.native
object orthographicCameraMod extends js.Object {
  
  @js.native
  class OrthographicCamera protected () extends Camera {
    /**
    	 * @param left Camera frustum left plane.
    	 * @param right Camera frustum right plane.
    	 * @param top Camera frustum top plane.
    	 * @param bottom Camera frustum bottom plane.
    	 * @param near Camera frustum near plane.
    	 * @param far Camera frustum far plane.
    	 */
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double, near: Double) = this()
    def this(
      left: Double,
      right: Double,
      top: Double,
      bottom: Double,
      near: js.UndefOr[scala.Nothing],
      far: Double
    ) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()
    
    /**
    	 * Camera frustum bottom plane.
    	 */
    var bottom: Double = js.native
    
    def clearViewOffset(): Unit = js.native
    
    /**
    	 * Camera frustum far plane.
    	 */
    var far: Double = js.native
    
    val isOrthographicCamera: `true` = js.native
    
    /**
    	 * Camera frustum left plane.
    	 */
    var left: Double = js.native
    
    /**
    	 * Camera frustum near plane.
    	 */
    var near: Double = js.native
    
    /**
    	 * Camera frustum right plane.
    	 */
    var right: Double = js.native
    
    def setViewOffset(
      fullWidth: Double,
      fullHeight: Double,
      offsetX: Double,
      offsetY: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    /**
    	 * Camera frustum top plane.
    	 */
    var top: Double = js.native
    
    @JSName("type")
    var type_OrthographicCamera: typingsSlinky.three.threeStrings.OrthographicCamera = js.native
    
    /**
    	 * Updates the camera projection matrix. Must be called after change of parameters.
    	 */
    def updateProjectionMatrix(): Unit = js.native
    
    var view: Null | Enabled = js.native
    
    var zoom: Double = js.native
  }
}
