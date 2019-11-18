package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends typingsSlinky.three.srcGeometriesGeometriesMod.ParametricGeometry {
  def this(
    func: js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typingsSlinky.three.srcMathVector3Mod.Vector3, 
        Unit
      ],
    slices: Double,
    stacks: Double
  ) = this()
}

