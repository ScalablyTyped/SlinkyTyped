package typingsSlinky.vegaTypings.titleMod

import typingsSlinky.vegaTypings.encodeMod.Encode
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.encodeMod.TextEncodeEntry
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title extends BaseTitle {
  /**
    * Mark definitions for custom title encoding.
    */
  var encode: js.UndefOr[TitleEncode | Encode[TextEncodeEntry]] = js.native
  /**
    * A boolean flag indicating if the title element should respond to input events such as mouse hover. (**Deprecated.**)
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * A mark name property to apply to the title text mark. (**Deprecated.**)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied. (**Deprecated**)
    */
  var style: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The subtitle text.
    */
  var subtitle: js.UndefOr[Text | SignalRef] = js.native
  /**
    * The title text.
    */
  var text: Text | SignalRef = js.native
  /**
    * 	The integer z-index indicating the layering of the title group relative to other axis, mark, and legend groups.
    *
    * __Default value:__ `0`.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}

object Title {
  @scala.inline
  def apply(text: Text | SignalRef): Title = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: Text | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: TitleEncode | Encode[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String | js.Array[String]): Self = {
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
    def withSubtitle(value: Text | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withZindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(js.undefined)
        ret
    }
  }
  
}

