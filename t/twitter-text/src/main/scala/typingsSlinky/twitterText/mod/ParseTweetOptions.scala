package typingsSlinky.twitterText.mod

import typingsSlinky.twitterText.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTweetOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.native
  var maxWeightedTweetLength: js.UndefOr[Double] = js.native
  var ranges: js.UndefOr[js.Array[AnonEnd]] = js.native
  var scale: js.UndefOr[Double] = js.native
  var transformedURLLength: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
}

object ParseTweetOptions {
  @scala.inline
  def apply(): ParseTweetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseTweetOptions]
  }
  @scala.inline
  implicit class ParseTweetOptionsOps[Self <: ParseTweetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWeightedTweetLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWeightedTweetLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWeightedTweetLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWeightedTweetLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[AnonEnd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformedURLLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedURLLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformedURLLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedURLLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

