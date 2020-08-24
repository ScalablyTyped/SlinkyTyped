package typingsSlinky.three

import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Bone", JSImport.Namespace)
@js.native
object boneMod extends js.Object {
  @js.native
  class Bone () extends Object3D {
    val isBone: `true` = js.native
    @JSName("type")
    var type_Bone: typingsSlinky.three.threeStrings.Bone = js.native
  }
  
}

