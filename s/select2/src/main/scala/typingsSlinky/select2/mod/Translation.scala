package typingsSlinky.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translation extends js.Object {
  var errorLoading: js.UndefOr[js.Function0[String]] = js.native
  var inputTooLong: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  var inputTooShort: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  var loadingMore: js.UndefOr[js.Function0[String]] = js.native
  var maximumSelected: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  var noResults: js.UndefOr[js.Function0[String]] = js.native
  var searching: js.UndefOr[js.Function0[String]] = js.native
}

object Translation {
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorLoading(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTooLong(value: /* arg */ TranslationArg => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTooLong")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputTooLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTooLong")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTooShort(value: /* arg */ TranslationArg => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTooShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputTooShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTooShort")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMore(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadingMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMore")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumSelected(value: /* arg */ TranslationArg => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaximumSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResults(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSearching(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(js.undefined)
        ret
    }
  }
  
}

