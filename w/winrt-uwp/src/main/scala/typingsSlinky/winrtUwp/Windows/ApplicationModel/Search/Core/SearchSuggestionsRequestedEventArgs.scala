package typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SuggestionsRequested event. */
@js.native
trait SearchSuggestionsRequestedEventArgs extends js.Object {
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchQueryLinguisticDetails = js.native
  /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
  var queryText: String = js.native
  /** Gets an object that stores suggestions and information about the request. */
  var request: SearchSuggestionsRequest = js.native
}

object SearchSuggestionsRequestedEventArgs {
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchQueryLinguisticDetails,
    queryText: String,
    request: SearchSuggestionsRequest
  ): SearchSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionsRequestedEventArgs]
  }
  @scala.inline
  implicit class SearchSuggestionsRequestedEventArgsOps[Self <: SearchSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinguisticDetails(value: SearchQueryLinguisticDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linguisticDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: SearchSuggestionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

