package typingsSlinky.textClipper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonClipOptions extends js.Object {
  /**
    * By default, we try to break only at word boundaries. Set to true if this is undesired.
    */
  var breakWords: js.UndefOr[Boolean] = js.native
  /**
    * The string to insert to indicate clipping. Default: "…".
    */
  var indicator: js.UndefOr[String] = js.native
  /**
    * Maximum amount of lines allowed. If given, the string will be clipped either at the moment
    * the maximum amount of characters is exceeded or the moment maxLines newlines are discovered,
    * whichever comes first.
    */
  var maxLines: js.UndefOr[Double] = js.native
}

object CommonClipOptions {
  @scala.inline
  def apply(): CommonClipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonClipOptions]
  }
  @scala.inline
  implicit class CommonClipOptionsOps[Self <: CommonClipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWords")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: String): Self = {
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
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
  }
  
}

