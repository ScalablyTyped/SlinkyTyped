package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typingsSlinky.winrtUwp.Windows.Foundation.Size
import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the drawing of an InkStroke . */
@js.native
trait InkDrawingAttributes extends js.Object {
  /** Gets or sets a value that indicates the color of an InkStroke . */
  var color: Color = js.native
  /** Gets or sets a value that indicates whether the InkStroke is rendered as a highlighter overlay. The stroke is typically set to a bright color, such as yellow. */
  var drawAsHighlighter: Boolean = js.native
  /** Gets or sets a value that indicates whether a Bezier curve or a collection of straight line segments is used to draw an InkStroke . */
  var fitToCurve: Boolean = js.native
  /** Gets or sets a value that indicates whether the pressure of the contact on the digitizer surface is ignored when you draw an InkStroke . */
  var ignorePressure: Boolean = js.native
  /** Gets or sets a value that indicates the shape of the pen tip when you draw an InkStroke . */
  var penTip: PenTipShape = js.native
  /** Gets or sets an affine transformation matrix applied to the PenTipShape used for an InkStroke . */
  var penTipTransform: Matrix3x2 = js.native
  /** Gets or sets a value that indicates the dimensions of the pen tip ( PenTip ) when you draw an InkStroke . */
  var size: Size = js.native
}

object InkDrawingAttributes {
  @scala.inline
  def apply(
    color: Color,
    drawAsHighlighter: Boolean,
    fitToCurve: Boolean,
    ignorePressure: Boolean,
    penTip: PenTipShape,
    penTipTransform: Matrix3x2,
    size: Size
  ): InkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], drawAsHighlighter = drawAsHighlighter.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], penTipTransform = penTipTransform.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkDrawingAttributes]
  }
  @scala.inline
  implicit class InkDrawingAttributesOps[Self <: InkDrawingAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawAsHighlighter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAsHighlighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToCurve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePressure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenTip(value: PenTipShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenTipTransform(value: Matrix3x2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penTipTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

