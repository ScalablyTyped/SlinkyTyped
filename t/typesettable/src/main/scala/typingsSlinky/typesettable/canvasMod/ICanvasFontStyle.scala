package typingsSlinky.typesettable.canvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasFontStyle extends js.Object {
  /**
    * An optional fill color.
    *
    * If `null` the text will not be filled. But, if `undefined` we will
    * default to `#444` filled text.
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * An optional CSS font string.
    *
    * If `null` or `undefined`, we will not set the font before writing text,
    * but there may already be a font style defined on the canvas rendering
    * context.
    */
  var font: js.UndefOr[String] = js.native
  /**
    * An optional stroke color.
    *
    * If `null` or `undefined` the text will not be stroked.
    */
  var stroke: js.UndefOr[String] = js.native
}

object ICanvasFontStyle {
  @scala.inline
  def apply(): ICanvasFontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasFontStyle]
  }
  @scala.inline
  implicit class ICanvasFontStyleOps[Self <: ICanvasFontStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

