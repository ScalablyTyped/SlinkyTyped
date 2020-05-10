package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
@js.native
trait SVGTransform extends js.Object {
  val SVG_TRANSFORM_MATRIX: Double = js.native
  val SVG_TRANSFORM_ROTATE: Double = js.native
  val SVG_TRANSFORM_SCALE: Double = js.native
  val SVG_TRANSFORM_SKEWX: Double = js.native
  val SVG_TRANSFORM_SKEWY: Double = js.native
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
  val angle: Double = js.native
  val matrix: org.scalajs.dom.raw.SVGMatrix = js.native
  val `type`: Double = js.native
  def setMatrix(matrix: org.scalajs.dom.raw.SVGMatrix): Unit = js.native
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setSkewX(angle: Double): Unit = js.native
  def setSkewY(angle: Double): Unit = js.native
  def setTranslate(tx: Double, ty: Double): Unit = js.native
}

@JSGlobal("SVGTransform")
@js.native
object SVGTransform
  extends Instantiable0[org.scalajs.dom.raw.SVGTransform] {
  val SVG_TRANSFORM_MATRIX: Double = js.native
  val SVG_TRANSFORM_ROTATE: Double = js.native
  val SVG_TRANSFORM_SCALE: Double = js.native
  val SVG_TRANSFORM_SKEWX: Double = js.native
  val SVG_TRANSFORM_SKEWY: Double = js.native
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
}

