package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Size
import typingsSlinky.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkDrawingAttributes extends js.Object {
  var color: Color = js.native
  var fitToCurve: Boolean = js.native
  var ignorePressure: Boolean = js.native
  var penTip: PenTipShape = js.native
  var size: Size = js.native
}

object IInkDrawingAttributes {
  @scala.inline
  def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
  @scala.inline
  implicit class IInkDrawingAttributesOps[Self <: IInkDrawingAttributes] (val x: Self) extends AnyVal {
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
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

