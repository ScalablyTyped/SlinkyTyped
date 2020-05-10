package typingsSlinky.uglifyjsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractCommentsOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | (js.Function1[/* fileName */ String, String])] = js.native
  var condition: js.UndefOr[js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])] = js.native
  var filename: js.UndefOr[String | (js.Function1[/* originalFileName */ String, String])] = js.native
}

object ExtractCommentsOptions {
  @scala.inline
  def apply(): ExtractCommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractCommentsOptions]
  }
  @scala.inline
  implicit class ExtractCommentsOptionsOps[Self <: ExtractCommentsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBannerFunction1(value: /* fileName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBanner(value: Boolean | String | (js.Function1[/* fileName */ String, String])): Self = {
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
    def withConditionFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = {
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
    def withCondition(value: js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])): Self = {
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
    def withFilenameFunction1(value: /* originalFileName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilename(value: String | (js.Function1[/* originalFileName */ String, String])): Self = {
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

