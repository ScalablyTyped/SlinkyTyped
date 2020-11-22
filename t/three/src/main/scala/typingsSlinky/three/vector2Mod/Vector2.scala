package typingsSlinky.three.vector2Mod

import typingsSlinky.std.ArrayLike
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.matrix3Mod.Matrix3
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Vector2", "Vector2")
@js.native
class Vector2 () extends Vector {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  
  /**
  	 * Adds v to this vector.
  	 */
  def add(v: Vector2): this.type = js.native
  def add(v: Vector2, w: Vector2): this.type = js.native
  
  /**
  	 * Adds the multiple of v and s to this vector.
  	 */
  def addScaledVector(v: Vector2, s: Double): this.type = js.native
  
  /**
  	 * Sets this vector to a + b.
  	 */
  def addVectors(a: Vector2, b: Vector2): this.type = js.native
  
  /**
  	 * computes the angle in radians with respect to the positive x-axis
  	 */
  def angle(): Double = js.native
  
  /**
  	 * Multiplies this vector (with an implicit 1 as the 3rd component) by m.
  	 */
  def applyMatrix3(m: Matrix3): this.type = js.native
  
  /**
  	 * The x and y components of the vector are rounded up to the nearest integer value.
  	 */
  def ceil(): this.type = js.native
  
  /**
  	 * If this vector's x or y value is greater than the max vector's x or y value, it is replaced by the corresponding value.
  	 * If this vector's x or y value is less than the min vector's x or y value, it is replaced by the corresponding value.
  	 * @param min the minimum x and y values.
  	 * @param max the maximum x and y values in the desired range.
  	 */
  def clamp(min: Vector2, max: Vector2): this.type = js.native
  
  /**
  	 * If this vector's length is greater than the max value, it is replaced by the max value.
  	 * If this vector's length is less than the min value, it is replaced by the min value.
  	 * @param min the minimum value the length will be clamped to.
  	 * @param max the maximum value the length will be clamped to.
  	 */
  def clampLength(min: Double, max: Double): this.type = js.native
  
  /**
  	 * If this vector's x or y values are greater than the max value, they are replaced by the max value.
  	 * If this vector's x or y values are less than the min value, they are replaced by the min value.
  	 * @param min the minimum value the components will be clamped to.
  	 * @param max the maximum value the components will be clamped to.
  	 */
  def clampScalar(min: Double, max: Double): this.type = js.native
  
  /**
  	 * Copies value of v to this vector.
  	 */
  def copy(v: Vector2): this.type = js.native
  
  /**
  	 * Computes cross product of this vector and v.
  	 */
  def cross(v: Vector2): Double = js.native
  
  /**
  	 * @deprecated Use {@link Vector2#manhattanDistanceTo .manhattanDistanceTo()} instead.
  	 */
  def distanceToManhattan(v: Vector2): Double = js.native
  
  /**
  	 * Computes squared distance of this vector to v.
  	 */
  @JSName("distanceToSquared")
  def distanceToSquared_MVector2(v: Vector2): Double = js.native
  
  /**
  	 * Computes distance of this vector to v.
  	 */
  @JSName("distanceTo")
  def distanceTo_MVector2(v: Vector2): Double = js.native
  
  /**
  	 * Divides this vector by v.
  	 */
  def divide(v: Vector2): this.type = js.native
  
  /**
  	 * Computes dot product of this vector and v.
  	 */
  def dot(v: Vector2): Double = js.native
  
  /**
  	 * Checks for strict equality of this vector and v.
  	 */
  def equals(v: Vector2): Boolean = js.native
  
  /**
  	 * The components of the vector are rounded down to the nearest integer value.
  	 */
  def floor(): this.type = js.native
  
  /**
  	 * Sets this vector's x and y value from the provided array.
  	 * @param array the source array.
  	 * @param offset (optional) offset into the array. Default is 0.
  	 */
  def fromArray(array: js.Array[Double]): this.type = js.native
  def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
  /**
  	 * Sets this vector's x and y value from the provided array-like.
  	 * @param array the source array-like.
  	 * @param offset (optional) offset into the array-like. Default is 0.
  	 */
  def fromArray(array: ArrayLike[Double]): this.type = js.native
  def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
  
  /**
  	 * Sets this vector's x and y values from the attribute.
  	 * @param attribute the source attribute.
  	 * @param index index in the attribute.
  	 */
  def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
  
  var height: Double = js.native
  
  val isVector2: `true` = js.native
  
  /**
  	 * @deprecated Use {@link Vector2#manhattanLength .manhattanLength()} instead.
  	 */
  def lengthManhattan(): Double = js.native
  
  /**
  	 * Linearly interpolates between this vector and v, where alpha is the distance along the line - alpha = 0 will be this vector, and alpha = 1 will be v.
  	 * @param v vector to interpolate towards.
  	 * @param alpha interpolation factor in the closed interval [0, 1].
  	 */
  def lerp(v: Vector2, alpha: Double): this.type = js.native
  
  /**
  	 * Sets this vector to be the vector linearly interpolated between v1 and v2 where alpha is the distance along the line connecting the two vectors - alpha = 0 will be v1, and alpha = 1 will be v2.
  	 * @param v1 the starting vector.
  	 * @param v2 vector to interpolate towards.
  	 * @param alpha interpolation factor in the closed interval [0, 1].
  	 */
  def lerpVectors(v1: Vector2, v2: Vector2, alpha: Double): this.type = js.native
  
  /**
  	 * Computes the Manhattan length (distance) from this vector to the given vector v
  	 *
  	 * @param {Vector2} v
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanDistanceTo(v: Vector2): Double = js.native
  
  /**
  	 * Computes the Manhattan length of this vector.
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanLength(): Double = js.native
  
  /**
  	 * If this vector's x or y value is less than v's x or y value, replace that value with the corresponding max value.
  	 */
  def max(v: Vector2): this.type = js.native
  
  /**
  	 * If this vector's x or y value is greater than v's x or y value, replace that value with the corresponding min value.
  	 */
  def min(v: Vector2): this.type = js.native
  
  /**
  	 * Multiplies this vector by v.
  	 */
  def multiply(v: Vector2): this.type = js.native
  
  /**
  	 * Sets this vector's x and y from Math.random
  	 */
  def random(): this.type = js.native
  
  /**
  	 * Rotates the vector around center by angle radians.
  	 * @param center the point around which to rotate.
  	 * @param angle the angle to rotate, in radians.
  	 */
  def rotateAround(center: Vector2, angle: Double): this.type = js.native
  
  /**
  	 * The components of the vector are rounded to the nearest integer value.
  	 */
  def round(): this.type = js.native
  
  /**
  	 * The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
  	 */
  def roundToZero(): this.type = js.native
  
  /**
  	 * Sets value of this vector.
  	 */
  def set(x: Double, y: Double): this.type = js.native
  
  /**
  	 * Sets X component of this vector.
  	 */
  def setX(x: Double): this.type = js.native
  
  /**
  	 * Sets Y component of this vector.
  	 */
  def setY(y: Double): this.type = js.native
  
  /**
  	 * Subtracts v from this vector.
  	 */
  def sub(v: Vector2): this.type = js.native
  
  /**
  	 * Subtracts s from this vector's x and y components.
  	 */
  def subScalar(s: Double): this.type = js.native
  
  /**
  	 * Sets this vector to a - b.
  	 */
  def subVectors(a: Vector2, b: Vector2): this.type = js.native
  
  /**
  	 * Returns an array [x, y], or copies x and y into the provided array.
  	 * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The created or provided array.
  	 */
  def toArray(): js.Array[Double] = js.native
  def toArray(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def toArray(array: js.Array[Double]): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /**
  	 * Copies x and y into the provided array-like.
  	 * @param array array-like to store the vector to.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The provided array-like.
  	 */
  def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
  def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
  
  var width: Double = js.native
  
  /**
  	 * @default 0
  	 */
  var x: Double = js.native
  
  /**
  	 * @default 0
  	 */
  var y: Double = js.native
}
