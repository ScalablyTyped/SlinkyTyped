package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Quaternion")
@js.native
/**
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 * @param w w coordinate
	 */
class Quaternion ()
  extends typingsSlinky.three.srcMathQuaternionMod.Quaternion {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSImport("three", "Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(
    qa: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    qb: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    qm: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    t: Double
  ): typingsSlinky.three.srcMathQuaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typingsSlinky.three.srcMathQuaternionMod.Quaternion = js.native
}

