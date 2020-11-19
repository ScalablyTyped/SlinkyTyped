package typingsSlinky.three.matrix3Mod

import typingsSlinky.std.ArrayLike
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Matrix3", "Matrix3")
@js.native
/**
	 * Creates an identity matrix.
	 */
class Matrix3 () extends Matrix {
  
  def copy(m: Matrix3): this.type = js.native
  
  def equals(matrix: Matrix3): Boolean = js.native
  
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix3 = js.native
  
  /**
  	 * @deprecated Use {@link Matrix3#toArray .toArray()} instead.
  	 */
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  
  /**
  	 * Sets the values of this matrix from the provided array.
  	 * @param array the source array.
  	 * @param offset (optional) offset into the array. Default is 0.
  	 */
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  def fromArray(array: js.Array[Double], offset: Double): Matrix3 = js.native
  /**
  	 * Sets the values of this matrix from the provided array-like.
  	 * @param array the source array-like.
  	 * @param offset (optional) offset into the array-like. Default is 0.
  	 */
  def fromArray(array: ArrayLike[Double]): Matrix3 = js.native
  def fromArray(array: ArrayLike[Double], offset: Double): Matrix3 = js.native
  
  def getInverse(matrix: Matrix3): Matrix3 = js.native
  def getInverse(matrix: Matrix4): Matrix3 = js.native
  def getInverse(matrix: Matrix4, throwOnDegenerate: Boolean): Matrix3 = js.native
  
  def getNormalMatrix(matrix4: Matrix4): Matrix3 = js.native
  
  /**
  	 * Multiplies this matrix by m.
  	 */
  def multiply(m: Matrix3): Matrix3 = js.native
  
  /**
  	 * Sets this matrix to a x b.
  	 */
  def multiplyMatrices(a: Matrix3, b: Matrix3): Matrix3 = js.native
  
  /**
  	 * @deprecated Use {@link Vector3.applyMatrix3 vector.applyMatrix3( matrix )} instead.
  	 */
  def multiplyVector3(vector: Vector3): js.Any = js.native
  
  /**
  	 * @deprecated This method has been removed completely.
  	 */
  def multiplyVector3Array(a: js.Any): js.Any = js.native
  
  def premultiply(m: Matrix3): Matrix3 = js.native
  
  def rotate(theta: Double): Matrix3 = js.native
  
  def scale(sx: Double, sy: Double): Matrix3 = js.native
  
  def set(
    n11: Double,
    n12: Double,
    n13: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n31: Double,
    n32: Double,
    n33: Double
  ): Matrix3 = js.native
  
  def setFromMatrix4(m: Matrix4): Matrix3 = js.native
  
  def setUvTransform(tx: Double, ty: Double, sx: Double, sy: Double, rotation: Double, cx: Double, cy: Double): Matrix3 = js.native
  
  /**
  	 * Copies he values of this matrix into the provided array-like.
  	 * @param array array-like to store the matrix to.
  	 * @param offset (optional) optional offset into the array-like.
  	 * @return The provided array-like.
  	 */
  def toArray(): ArrayLike[Double] = js.native
  def toArray(array: js.UndefOr[scala.Nothing], offset: Double): ArrayLike[Double] = js.native
  def toArray(array: js.Array[Double]): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
  def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
  /**
  	 * Returns an array with the values of this matrix, or copies them into the provided array.
  	 * @param array (optional) array to store the matrix to. If this is not provided, a new array will be created.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The created or provided array.
  	 */
  @JSName("toArray")
  def toArray_Array(): js.Array[Double] = js.native
  @JSName("toArray")
  def toArray_Array(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  
  def translate(tx: Double, ty: Double): Matrix3 = js.native
  
  /**
  	 * Transposes this matrix into the supplied array r, and returns itself.
  	 */
  def transposeIntoArray(r: js.Array[Double]): Matrix3 = js.native
}
