package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormat extends js.Object {
  var fill: String = js.native
  var font: IFont = js.native
  var gradient: IGradient = js.native
  var image: IImage = js.native
  var round: IPoint = js.native
  var shadow: IShadow = js.native
  var stroke: IStroke = js.native
  var transparency: Double = js.native
  def drawText(bounds: IRectangle, text: String): js.Any = js.native
  def ellipse(x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  def poligon(points: js.Array[IPoint]): js.Any = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  def textHeight(text: String): Double = js.native
  def textWidth(text: String): Double = js.native
}

object IFormat {
  @scala.inline
  def apply(
    drawText: (IRectangle, String) => js.Any,
    ellipse: (Double, Double, Double, Double) => js.Any,
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (Double, Double, Double, Double) => js.Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: String => Double,
    textWidth: String => Double,
    transparency: Double
  ): IFormat = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormat]
  }
  @scala.inline
  implicit class IFormatOps[Self <: IFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawText(value: (IRectangle, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEllipse(value: (Double, Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: IFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: IGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: IImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoligon(value: js.Array[IPoint] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poligon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRectangle(value: (Double, Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRound(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: IShadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: IStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextHeight(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextWidth(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

