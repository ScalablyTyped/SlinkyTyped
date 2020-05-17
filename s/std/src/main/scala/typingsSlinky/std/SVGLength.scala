package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Correspond to the <length> basic data type. */
@js.native
trait SVGLength extends js.Object {
  val SVG_LENGTHTYPE_CM: Double = js.native
  val SVG_LENGTHTYPE_EMS: Double = js.native
  val SVG_LENGTHTYPE_EXS: Double = js.native
  val SVG_LENGTHTYPE_IN: Double = js.native
  val SVG_LENGTHTYPE_MM: Double = js.native
  val SVG_LENGTHTYPE_NUMBER: Double = js.native
  val SVG_LENGTHTYPE_PC: Double = js.native
  val SVG_LENGTHTYPE_PERCENTAGE: Double = js.native
  val SVG_LENGTHTYPE_PT: Double = js.native
  val SVG_LENGTHTYPE_PX: Double = js.native
  val SVG_LENGTHTYPE_UNKNOWN: Double = js.native
  val unitType: Double = js.native
  var value: Double = js.native
  var valueAsString: java.lang.String = js.native
  var valueInSpecifiedUnits: Double = js.native
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
}

object SVGLength {
  @scala.inline
  def apply(
    SVG_LENGTHTYPE_CM: Double,
    SVG_LENGTHTYPE_EMS: Double,
    SVG_LENGTHTYPE_EXS: Double,
    SVG_LENGTHTYPE_IN: Double,
    SVG_LENGTHTYPE_MM: Double,
    SVG_LENGTHTYPE_NUMBER: Double,
    SVG_LENGTHTYPE_PC: Double,
    SVG_LENGTHTYPE_PERCENTAGE: Double,
    SVG_LENGTHTYPE_PT: Double,
    SVG_LENGTHTYPE_PX: Double,
    SVG_LENGTHTYPE_UNKNOWN: Double,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGLength = {
    val __obj = js.Dynamic.literal(SVG_LENGTHTYPE_CM = SVG_LENGTHTYPE_CM.asInstanceOf[js.Any], SVG_LENGTHTYPE_EMS = SVG_LENGTHTYPE_EMS.asInstanceOf[js.Any], SVG_LENGTHTYPE_EXS = SVG_LENGTHTYPE_EXS.asInstanceOf[js.Any], SVG_LENGTHTYPE_IN = SVG_LENGTHTYPE_IN.asInstanceOf[js.Any], SVG_LENGTHTYPE_MM = SVG_LENGTHTYPE_MM.asInstanceOf[js.Any], SVG_LENGTHTYPE_NUMBER = SVG_LENGTHTYPE_NUMBER.asInstanceOf[js.Any], SVG_LENGTHTYPE_PC = SVG_LENGTHTYPE_PC.asInstanceOf[js.Any], SVG_LENGTHTYPE_PERCENTAGE = SVG_LENGTHTYPE_PERCENTAGE.asInstanceOf[js.Any], SVG_LENGTHTYPE_PT = SVG_LENGTHTYPE_PT.asInstanceOf[js.Any], SVG_LENGTHTYPE_PX = SVG_LENGTHTYPE_PX.asInstanceOf[js.Any], SVG_LENGTHTYPE_UNKNOWN = SVG_LENGTHTYPE_UNKNOWN.asInstanceOf[js.Any], convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLength]
  }
  @scala.inline
  implicit class SVGLengthOps[Self <: org.scalajs.dom.raw.SVGLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVG_LENGTHTYPE_CM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_CM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_EMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_EMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_EXS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_EXS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_IN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_IN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_MM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_MM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_NUMBER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_NUMBER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_PC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_PC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_PERCENTAGE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_PERCENTAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_PT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_PT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_PX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_PX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_LENGTHTYPE_UNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_LENGTHTYPE_UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertToSpecifiedUnits(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToSpecifiedUnits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValueSpecifiedUnits")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnitType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAsString(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueInSpecifiedUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInSpecifiedUnits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

