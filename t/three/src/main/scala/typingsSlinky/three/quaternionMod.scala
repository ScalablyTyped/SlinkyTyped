package typingsSlinky.three

import typingsSlinky.std.ArrayLike
import typingsSlinky.three.eulerMod.Euler
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Quaternion", JSImport.Namespace)
@js.native
object quaternionMod extends js.Object {
  
  @js.native
  /**
  	 * @param x x coordinate
  	 * @param y y coordinate
  	 * @param z z coordinate
  	 * @param w w coordinate
  	 */
  class Quaternion () extends js.Object {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    
    def _onChange(callback: js.Function): Quaternion = js.native
    
    var _onChangeCallback: js.Function = js.native
    
    def angleTo(q: Quaternion): Double = js.native
    
    def conjugate(): Quaternion = js.native
    
    /**
    	 * Copies values of q to this quaternion.
    	 */
    def copy(q: Quaternion): this.type = js.native
    
    def dot(v: Quaternion): Double = js.native
    
    def equals(v: Quaternion): Boolean = js.native
    
    /**
    	 * Sets this quaternion's x, y, z and w value from the provided array.
    	 * @param array the source array.
    	 * @param offset (optional) offset into the array. Default is 0.
    	 */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    /**
    	 * Sets this quaternion's x, y, z and w value from the provided array-like.
    	 * @param array the source array-like.
    	 * @param offset (optional) offset into the array-like. Default is 0.
    	 */
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    def identity(): Quaternion = js.native
    
    /**
    	 * Inverts this quaternion.
    	 */
    def inverse(): Quaternion = js.native
    
    val isQuaternion: `true` = js.native
    
    /**
    	 * Computes length of this quaternion.
    	 */
    def length(): Double = js.native
    
    def lengthSq(): Double = js.native
    
    /**
    	 * Multiplies this quaternion by b.
    	 */
    def multiply(q: Quaternion): Quaternion = js.native
    
    /**
    	 * Sets this quaternion to a x b
    	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm.
    	 */
    def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
    
    /**
    	 * @deprecated Use {@link Vector#applyQuaternion vector.applyQuaternion( quaternion )} instead.
    	 */
    def multiplyVector3(v: js.Any): js.Any = js.native
    
    /**
    	 * Normalizes this quaternion.
    	 */
    def normalize(): Quaternion = js.native
    
    def premultiply(q: Quaternion): Quaternion = js.native
    
    def rotateTowards(q: Quaternion, step: Double): Quaternion = js.native
    
    /**
    	 * Sets values of this quaternion.
    	 */
    def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
    
    /**
    	 * Sets this quaternion from rotation specified by axis and angle.
    	 * Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm.
    	 * Axis have to be normalized, angle is in radians.
    	 */
    def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
    
    /**
    	 * Sets this quaternion from rotation specified by Euler angles.
    	 */
    def setFromEuler(euler: Euler): Quaternion = js.native
    
    /**
    	 * Sets this quaternion from rotation component of m. Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/index.htm.
    	 */
    def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
    
    def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
    
    def slerp(qb: Quaternion, t: Double): Quaternion = js.native
    
    /**
    	 * Returns an array [x, y, z, w], or copies x, y, z and w into the provided array.
    	 * @param array (optional) array to store the quaternion to. If this is not provided, a new array will be created.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The created or provided array.
    	 */
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    /**
    	 * Copies x, y, z and w into the provided array-like.
    	 * @param array array-like to store the quaternion to.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The provided array-like.
    	 */
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  @js.native
  object Quaternion extends js.Object {
    
    def multiplyQuaternionsFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double
    ): js.Array[Double] = js.native
    
    /**
    	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    	 */
    def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Quaternion = js.native
    
    def slerpFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double,
      t: Double
    ): Quaternion = js.native
  }
}
