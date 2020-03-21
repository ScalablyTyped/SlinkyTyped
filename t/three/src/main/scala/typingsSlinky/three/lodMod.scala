package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LOD", JSImport.Namespace)
@js.native
object lodMod extends js.Object {
  @js.native
  class LOD () extends Object3D {
    var levels: js.Array[AnonDistance] = js.native
    /**
    	 * @deprecated Use {@link LOD#levels .levels} instead.
    	 */
    var objects: js.Array[_] = js.native
    @JSName("type")
    var type_LOD: typingsSlinky.three.threeStrings.LOD = js.native
    def addLevel(`object`: Object3D): this.type = js.native
    def addLevel(`object`: Object3D, distance: Double): this.type = js.native
    def getObjectForDistance(distance: Double): Object3D = js.native
    def toJSON(meta: js.Any): js.Any = js.native
    def update(camera: Camera): Unit = js.native
  }
  
}

