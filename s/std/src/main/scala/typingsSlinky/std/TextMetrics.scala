package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
@js.native
trait TextMetrics extends js.Object {
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val width: Double = js.native
}

object TextMetrics {
  @scala.inline
  def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    alphabeticBaseline: Double,
    emHeightAscent: Double,
    emHeightDescent: Double,
    fontBoundingBoxAscent: Double,
    fontBoundingBoxDescent: Double,
    hangingBaseline: Double,
    ideographicBaseline: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], alphabeticBaseline = alphabeticBaseline.asInstanceOf[js.Any], emHeightAscent = emHeightAscent.asInstanceOf[js.Any], emHeightDescent = emHeightDescent.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], hangingBaseline = hangingBaseline.asInstanceOf[js.Any], ideographicBaseline = ideographicBaseline.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  @scala.inline
  implicit class TextMetricsOps[Self <: org.scalajs.dom.raw.TextMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualBoundingBoxAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualBoundingBoxAscent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualBoundingBoxDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualBoundingBoxDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualBoundingBoxLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualBoundingBoxLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualBoundingBoxRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualBoundingBoxRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphabeticBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabeticBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmHeightAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emHeightAscent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmHeightDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emHeightDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontBoundingBoxAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBoundingBoxAscent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontBoundingBoxDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBoundingBoxDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHangingBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangingBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdeographicBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideographicBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

