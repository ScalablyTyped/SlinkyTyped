package typingsSlinky.svgJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.SVGPoint
import typingsSlinky.svgJs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point
  extends Instantiable0[Point]
     with Instantiable1[(/* position */ ArrayPoint) | (/* point */ Point) | (/* position */ X), Point]
     with Instantiable2[/* x */ Double, /* y */ Double, Point] {
  
  def at(pos: Double): Point = js.native
  
  def morph(point: Point): this.type = js.native
  
  def native(): SVGPoint = js.native
  
  def transform(matrix: Matrix): Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
