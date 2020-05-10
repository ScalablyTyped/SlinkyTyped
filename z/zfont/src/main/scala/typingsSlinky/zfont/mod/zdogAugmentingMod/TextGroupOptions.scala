package typingsSlinky.zfont.mod.zdogAugmentingMod

import typingsSlinky.zdog.mod.GroupOptions
import typingsSlinky.zfont.zfontBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link TextGroup}
  * @see {@link https://github.com/jaames/zfont#options-2 Zfont API}
  */
@js.native
trait TextGroupOptions[T /* <: MultilineText */] extends GroupOptions {
  /**
    * @default '#333'
    * @see {@link TextGroup#color}
    */
  val color: js.UndefOr[String] = js.native
  /**
    * @default false
    * @see {@link TextGroup#fill}
    */
  val fill: js.UndefOr[Boolean] = js.native
  /** @see {@link TextGroup#font} */
  val font: Font = js.native
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link TextGroup#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.native
  /**
    * @default 1
    * @see {@link TextGroup#stroke}
    */
  val stroke: js.UndefOr[Double | `false`] = js.native
  /**
    * @default 'left'
    * @see {@link TextGroup#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.native
  /**
    * @default 'bottom'
    * @see {@link TextGroup#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.native
  /**
    * @default ''
    * @see {@link TextGroup#value}
    */
  val value: js.UndefOr[T] = js.native
}

object TextGroupOptions {
  @scala.inline
  def apply[T](font: Font): TextGroupOptions[T] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGroupOptions[T]]
  }
  @scala.inline
  implicit class TextGroupOptionsOps[Self[t] <: TextGroupOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFont(value: Font): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Double | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: TextAlign): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBaseline(value: TextBaseline): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBaseline: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

