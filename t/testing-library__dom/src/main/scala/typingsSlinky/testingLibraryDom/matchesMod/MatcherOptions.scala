package typingsSlinky.testingLibraryDom.matchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherOptions extends js.Object {
  /** Use normalizer with getDefaultNormalizer instead */
  var collapseWhitespace: js.UndefOr[Boolean] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var normalizer: js.UndefOr[NormalizerFn] = js.native
  /** Use normalizer with getDefaultNormalizer instead */
  var trim: js.UndefOr[Boolean] = js.native
}

object MatcherOptions {
  @scala.inline
  def apply(): MatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherOptions]
  }
  @scala.inline
  implicit class MatcherOptionsOps[Self <: MatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizer(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizer")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

