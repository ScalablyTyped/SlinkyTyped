package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAspect extends js.Object {
  /**
    * To set the layout of the word cloud. "spiral" | "flow-center" | "flow-top"
    */
  var aspect: js.UndefOr[String] = js.native
  var button: js.UndefOr[AnonCount] = js.native
  /**
    * When the "color-type" attribute is set to "color", use this attribute to set the color of the text in the word cloud. "red" | "#3F
    * 51B5" | ...
    */
  var color: js.UndefOr[String] = js.native
  /**
    * To set the type of color arrangement applied to the word cloud. Use the "color" value with the "color" attribute. Use the "palette
    * " value with the "palette" array. "random" (default) | "color" | "palette"
    */
  var `color-type`: js.UndefOr[String] = js.native
  var `context-menu`: js.UndefOr[AnonButton] = js.native
  /**
    * To define words to be excluded from the word cloud, e.g., "and" or "the". [...]
    */
  var ignore: js.UndefOr[js.Any] = js.native
  var indicator: js.UndefOr[AnonNpv] = js.native
  /**
    * To set the maximum font size. 20 | "30px" | ...
    */
  var `max-font-size`: js.UndefOr[js.Any] = js.native
  /**
    * To set the maximum number of items displayed in the word cloud. 100 | 30 | ...
    */
  var `max-items`: js.UndefOr[js.Any] = js.native
  /**
    * To set the minimum font size. 10 | "12px" | ...
    */
  var `min-font-size`: js.UndefOr[js.Any] = js.native
  /**
    * To set the minimum length of the words displayed in the word cloud. 3 | 5 | ...
    */
  var `min-length`: js.UndefOr[js.Any] = js.native
  /**
    * When the "color-type" attribute is set to "palette", use this attribute to set the color palette of the word cloud. [...]
    */
  var palette: js.UndefOr[js.Any] = js.native
  /**
    * To set whether every one or two words rotates 90 degrees. true | false (default)
    */
  var rotate: js.UndefOr[Boolean] = js.native
  /**
    * To control the step metering. Use this with the "step-radius" attribute. 45 | 90 | ...
    */
  var `step-angle`: js.UndefOr[js.Any] = js.native
  /**
    * To control the step metering. Use this with the "step-angle" attribute. 30 | 50 | ...
    */
  var `step-radius`: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[AnonHoverstate] = js.native
  /**
    * To provide the data for the word cloud. (Alternatively, data can be provided through a "words" array.) "text data..." | ...
    */
  var text: js.UndefOr[String] = js.native
  /**
    * To set the type of item to be analyzed: words or characters. "word" (default) | "character"
    */
  var token: js.UndefOr[String] = js.native
  var violin: js.UndefOr[AnonJitter] = js.native
  var words: js.UndefOr[js.Array[AnonText]] = js.native
}

object AnonAspect {
  @scala.inline
  def apply(): AnonAspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAspect]
  }
  @scala.inline
  implicit class AnonAspectOps[Self <: AnonAspect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: AnonCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withContext-menu`(value: AnonButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContext-menu`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-menu")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: AnonNpv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-font-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-font-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-items`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-items`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-items")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-font-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-font-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-length`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-length")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withStep-angle`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStep-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withStep-radius`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStep-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-radius")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonHoverstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withViolin(value: AnonJitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violin")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: js.Array[AnonText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

