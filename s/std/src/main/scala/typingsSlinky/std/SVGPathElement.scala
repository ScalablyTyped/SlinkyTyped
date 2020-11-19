package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <path> element. */
@js.native
trait SVGPathElement extends SVGGraphicsElement {
  
  /** @deprecated */
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): org.scalajs.dom.raw.SVGPathSegArcAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): org.scalajs.dom.raw.SVGPathSegArcRel = js.native
  
  /** @deprecated */
  def createSVGPathSegClosePath(): org.scalajs.dom.raw.SVGPathSegClosePath = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): org.scalajs.dom.raw.SVGPathSegCurvetoCubicAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): org.scalajs.dom.raw.SVGPathSegCurvetoCubicRel = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): org.scalajs.dom.raw.SVGPathSegCurvetoCubicSmoothAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): org.scalajs.dom.raw.SVGPathSegCurvetoCubicSmoothRel = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): org.scalajs.dom.raw.SVGPathSegCurvetoQuadraticAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): org.scalajs.dom.raw.SVGPathSegCurvetoQuadraticRel = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegCurvetoQuadraticSmoothAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegCurvetoQuadraticSmoothRel = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoAbs(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegLinetoAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalAbs(x: Double): org.scalajs.dom.raw.SVGPathSegLinetoHorizontalAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalRel(x: Double): org.scalajs.dom.raw.SVGPathSegLinetoHorizontalRel = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoRel(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegLinetoRel = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoVerticalAbs(y: Double): org.scalajs.dom.raw.SVGPathSegLinetoVerticalAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegLinetoVerticalRel(y: Double): org.scalajs.dom.raw.SVGPathSegLinetoVerticalRel = js.native
  
  /** @deprecated */
  def createSVGPathSegMovetoAbs(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegMovetoAbs = js.native
  
  /** @deprecated */
  def createSVGPathSegMovetoRel(x: Double, y: Double): org.scalajs.dom.raw.SVGPathSegMovetoRel = js.native
  
  /** @deprecated */
  def getPathSegAtLength(distance: Double): Double = js.native
  
  def getPointAtLength(distance: Double): org.scalajs.dom.raw.SVGPoint = js.native
  
  def getTotalLength(): Double = js.native
  
  /** @deprecated */
  val pathSegList: org.scalajs.dom.raw.SVGPathSegList = js.native
}
