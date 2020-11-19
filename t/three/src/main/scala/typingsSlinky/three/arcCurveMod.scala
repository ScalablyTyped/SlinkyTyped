package typingsSlinky.three

import typingsSlinky.three.ellipseCurveMod.EllipseCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/curves/ArcCurve", JSImport.Namespace)
@js.native
object arcCurveMod extends js.Object {
  
  @js.native
  class ArcCurve protected () extends EllipseCurve {
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
}
