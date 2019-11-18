package typingsSlinky.three

import typingsSlinky.three.srcMathPlaneMod.Plane
import typingsSlinky.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PlaneHelper", JSImport.Namespace)
@js.native
object srcHelpersPlaneHelperMod extends js.Object {
  @js.native
  class PlaneHelper protected () extends LineSegments {
    def this(plane: Plane) = this()
    def this(plane: Plane, size: Double) = this()
    def this(plane: Plane, size: Double, hex: Double) = this()
    var plane: Plane = js.native
    var size: Double = js.native
  }
  
}

