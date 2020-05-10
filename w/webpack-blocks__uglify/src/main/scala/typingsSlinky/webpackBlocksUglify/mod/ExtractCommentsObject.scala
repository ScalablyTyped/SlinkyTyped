package typingsSlinky.webpackBlocksUglify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractCommentsObject extends js.Object {
  var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.native
  var condition: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentsFunction] = js.native
  var filename: js.UndefOr[js.RegExp | FileNameFunction] = js.native
}

object ExtractCommentsObject {
  @scala.inline
  def apply(): ExtractCommentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractCommentsObject]
  }
  @scala.inline
  implicit class ExtractCommentsObjectOps[Self <: ExtractCommentsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBannerFunction1(value: /* file */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBanner(value: Boolean | String | FileNameFunction): Self = {
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
    def withConditionFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = {
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
    def withCondition(value: Boolean | String | js.RegExp | ExtractCommentsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameFunction1(value: /* file */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilenameRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: js.RegExp | FileNameFunction): Self = {
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

