package typingsSlinky.terserWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractCommentOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | FormatFn] = js.native
  var condition: Boolean | String | js.RegExp | ExtractCommentFn | js.Object = js.native
  var filename: js.UndefOr[String | FormatFn] = js.native
}

object ExtractCommentOptions {
  @scala.inline
  def apply(condition: Boolean | String | js.RegExp | ExtractCommentFn | js.Object): ExtractCommentOptions = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentOptions]
  }
  @scala.inline
  implicit class ExtractCommentOptionsOps[Self <: ExtractCommentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConditionRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: Boolean | String | js.RegExp | ExtractCommentFn | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerFunction1(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBanner(value: Boolean | String | FormatFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameFunction1(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilename(value: String | FormatFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
  }
  
}

