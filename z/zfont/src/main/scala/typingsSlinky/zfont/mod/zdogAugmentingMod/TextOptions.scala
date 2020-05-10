package typingsSlinky.zfont.mod.zdogAugmentingMod

import typingsSlinky.zdog.mod.ShapeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link Text}
  * @see {@link https://github.com/jaames/zfont#options-1 Zfont API}
  */
@js.native
trait TextOptions[T /* <: MultilineText */] extends ShapeOptions {
  /** @see {@link Text#font} */
  val font: Font = js.native
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link Text#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.native
  /**
    * @default 'left'
    * @see {@link Text#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.native
  /**
    * @default 'bottom'
    * @see {@link Text#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.native
  /**
    * @default ''
    * @see {@link Text#value}
    */
  val value: js.UndefOr[T] = js.native
}

object TextOptions {
  @scala.inline
  def apply[T](font: Font): TextOptions[T] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions[T]]
  }
  @scala.inline
  implicit class TextOptionsOps[Self[t] <: TextOptions[t], T] (val x: Self[T]) extends AnyVal {
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

