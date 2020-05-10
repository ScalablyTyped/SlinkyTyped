package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
@js.native
trait SVGAngle extends js.Object {
  val SVG_ANGLETYPE_DEG: Double = js.native
  val SVG_ANGLETYPE_GRAD: Double = js.native
  val SVG_ANGLETYPE_RAD: Double = js.native
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
  val unitType: Double = js.native
  var value: Double = js.native
  var valueAsString: java.lang.String = js.native
  var valueInSpecifiedUnits: Double = js.native
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
}

@JSGlobal("SVGAngle")
@js.native
object SVGAngle
  extends Instantiable0[org.scalajs.dom.raw.SVGAngle] {
  val SVG_ANGLETYPE_DEG: Double = js.native
  val SVG_ANGLETYPE_GRAD: Double = js.native
  val SVG_ANGLETYPE_RAD: Double = js.native
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
}

