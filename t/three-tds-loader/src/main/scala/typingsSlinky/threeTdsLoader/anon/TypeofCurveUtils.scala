package typingsSlinky.threeTdsLoader.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCurveUtils extends js.Object {
  
  def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  
  def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  
  def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  
  def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
}
object TypeofCurveUtils {
  
  @scala.inline
  def apply(
    interpolate: (Double, Double, Double, Double, Double) => Double,
    tangentCubicBezier: (Double, Double, Double, Double, Double) => Double,
    tangentQuadraticBezier: (Double, Double, Double, Double) => Double,
    tangentSpline: (Double, Double, Double, Double, Double) => Double
  ): TypeofCurveUtils = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction5(interpolate), tangentCubicBezier = js.Any.fromFunction5(tangentCubicBezier), tangentQuadraticBezier = js.Any.fromFunction4(tangentQuadraticBezier), tangentSpline = js.Any.fromFunction5(tangentSpline))
    __obj.asInstanceOf[TypeofCurveUtils]
  }
  
  @scala.inline
  implicit class TypeofCurveUtilsOps[Self <: TypeofCurveUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterpolate(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("interpolate", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTangentCubicBezier(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("tangentCubicBezier", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTangentQuadraticBezier(value: (Double, Double, Double, Double) => Double): Self = this.set("tangentQuadraticBezier", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTangentSpline(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("tangentSpline", js.Any.fromFunction5(value))
  }
}
