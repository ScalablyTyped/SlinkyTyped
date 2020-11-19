package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrixReadOnly extends js.Object {
  
  val a: Double = js.native
  
  val b: Double = js.native
  
  val c: Double = js.native
  
  val d: Double = js.native
  
  val e: Double = js.native
  
  val f: Double = js.native
  
  def flipX(): DOMMatrix = js.native
  
  def flipY(): DOMMatrix = js.native
  
  def inverse(): DOMMatrix = js.native
  
  val is2D: scala.Boolean = js.native
  
  val isIdentity: scala.Boolean = js.native
  
  val m11: Double = js.native
  
  val m12: Double = js.native
  
  val m13: Double = js.native
  
  val m14: Double = js.native
  
  val m21: Double = js.native
  
  val m22: Double = js.native
  
  val m23: Double = js.native
  
  val m24: Double = js.native
  
  val m31: Double = js.native
  
  val m32: Double = js.native
  
  val m33: Double = js.native
  
  val m34: Double = js.native
  
  val m41: Double = js.native
  
  val m42: Double = js.native
  
  val m43: Double = js.native
  
  val m44: Double = js.native
  
  def multiply(): DOMMatrix = js.native
  def multiply(other: DOMMatrixInit): DOMMatrix = js.native
  
  def rotate(): DOMMatrix = js.native
  def rotate(rotX: js.UndefOr[scala.Nothing], rotY: js.UndefOr[scala.Nothing], rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: js.UndefOr[scala.Nothing], rotY: Double): DOMMatrix = js.native
  def rotate(rotX: js.UndefOr[scala.Nothing], rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: js.UndefOr[scala.Nothing], rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  
  def rotateAxisAngle(): DOMMatrix = js.native
  def rotateAxisAngle(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    angle: Double
  ): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: js.UndefOr[scala.Nothing], y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: js.UndefOr[scala.Nothing], z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: js.UndefOr[scala.Nothing], z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  
  def rotateFromVector(): DOMMatrix = js.native
  def rotateFromVector(x: js.UndefOr[scala.Nothing], y: Double): DOMMatrix = js.native
  def rotateFromVector(x: Double): DOMMatrix = js.native
  def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native
  
  def scale(
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    scaleZ: js.UndefOr[Double],
    originX: js.UndefOr[Double],
    originY: js.UndefOr[Double],
    originZ: js.UndefOr[Double]
  ): DOMMatrix = js.native
  
  def scale3d(): DOMMatrix = js.native
  def scale3d(
    scale: js.UndefOr[scala.Nothing],
    originX: js.UndefOr[scala.Nothing],
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3d(scale: js.UndefOr[scala.Nothing], originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
  def scale3d(
    scale: js.UndefOr[scala.Nothing],
    originX: js.UndefOr[scala.Nothing],
    originY: Double,
    originZ: Double
  ): DOMMatrix = js.native
  def scale3d(scale: js.UndefOr[scala.Nothing], originX: Double): DOMMatrix = js.native
  def scale3d(
    scale: js.UndefOr[scala.Nothing],
    originX: Double,
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3d(scale: js.UndefOr[scala.Nothing], originX: Double, originY: Double): DOMMatrix = js.native
  def scale3d(scale: js.UndefOr[scala.Nothing], originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double): DOMMatrix = js.native
  def scale3d(
    scale: Double,
    originX: js.UndefOr[scala.Nothing],
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3d(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: js.UndefOr[scala.Nothing], originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  
  /** @deprecated */
  def scaleNonUniform(): DOMMatrix = js.native
  def scaleNonUniform(scaleX: js.UndefOr[scala.Nothing], scaleY: Double): DOMMatrix = js.native
  def scaleNonUniform(scaleX: Double): DOMMatrix = js.native
  def scaleNonUniform(scaleX: Double, scaleY: Double): DOMMatrix = js.native
  
  def skewX(): DOMMatrix = js.native
  def skewX(sx: Double): DOMMatrix = js.native
  
  def skewY(): DOMMatrix = js.native
  def skewY(sy: Double): DOMMatrix = js.native
  
  def toFloat32Array(): js.typedarray.Float32Array = js.native
  
  def toFloat64Array(): js.typedarray.Float64Array = js.native
  
  def toJSON(): js.Any = js.native
  
  def transformPoint(): DOMPoint = js.native
  def transformPoint(point: DOMPointInit): DOMPoint = js.native
  
  def translate(): DOMMatrix = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: js.UndefOr[scala.Nothing], tz: Double): DOMMatrix = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double): DOMMatrix = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double, tz: Double): DOMMatrix = js.native
  def translate(tx: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: js.UndefOr[scala.Nothing], tz: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
}
