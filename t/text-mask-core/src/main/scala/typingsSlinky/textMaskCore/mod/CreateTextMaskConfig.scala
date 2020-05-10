package typingsSlinky.textMaskCore.mod

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTextMaskConfig extends js.Object {
  var guide: js.UndefOr[String] = js.native
  var inputElement: HTMLInputElement = js.native
  var keepCharPositions: js.UndefOr[Boolean] = js.native
  var mask: Mask = js.native
  var pipe: js.UndefOr[Pipe] = js.native
  var placeholderChar: js.UndefOr[String] = js.native
  var showMask: js.UndefOr[Boolean] = js.native
}

object CreateTextMaskConfig {
  @scala.inline
  def apply(inputElement: HTMLInputElement, mask: Mask): CreateTextMaskConfig = {
    val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTextMaskConfig]
  }
  @scala.inline
  implicit class CreateTextMaskConfigOps[Self <: CreateTextMaskConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: Mask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCharPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCharPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCharPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCharPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withPipe(value: (/* conformedValue */ String, /* config */ js.Any) => PipeResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(js.undefined)
        ret
    }
  }
  
}

