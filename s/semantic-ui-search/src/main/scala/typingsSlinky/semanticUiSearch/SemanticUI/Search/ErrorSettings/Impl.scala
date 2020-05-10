package typingsSlinky.semanticUiSearch.SemanticUI.Search.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'Error in debug logging, exiting.'
    */
  var logging: String = js.native
  /**
    * @default 'Results must be an array to use maxResults setting'
    */
  var maxResults: String = js.native
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default 'Your search returned no results'
    */
  var noResults: String = js.native
  /**
    * @default 'A valid template name was not specified.'
    */
  var noTemplate: String = js.native
  /**
    * @default 'There was an issue with querying the server.'
    */
  var serverError: String = js.native
  /**
    * @default 'Cannot search. No source used, and Semantic API module was not included'
    */
  var source: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    logging: String,
    maxResults: String,
    method: String,
    noResults: String,
    noTemplate: String,
    serverError: String,
    source: String
  ): Impl = {
    val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any], noTemplate = noTemplate.asInstanceOf[js.Any], serverError = serverError.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

