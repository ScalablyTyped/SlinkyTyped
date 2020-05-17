package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplLogging extends js.Object {
  var logging: js.UndefOr[String] = js.native
  var maxResults: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var noResults: js.UndefOr[String] = js.native
  var noTemplate: js.UndefOr[String] = js.native
  var serverError: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplLogging {
  @scala.inline
  def apply(): PartialPickImplkeyofImplLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplLogging]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplLoggingOps[Self <: PartialPickImplkeyofImplLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withServerError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverError")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

