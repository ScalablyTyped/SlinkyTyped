package typingsSlinky.three

import typingsSlinky.three.ellipseCurveMod.EllipseCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcCurveMod {
  
  @JSImport("three/src/extras/curves/ArcCurve", "ArcCurve")
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
