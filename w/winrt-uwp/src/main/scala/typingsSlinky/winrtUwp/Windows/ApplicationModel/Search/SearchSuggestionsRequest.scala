package typingsSlinky.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores suggestions and information about the request for suggestions. */
@js.native
trait SearchSuggestionsRequest extends js.Object {
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: Boolean = js.native
  /** The suggestions to display in the search pane or in-app search box for the current query. Apps provide suggestions to display by appending them to this SearchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
  /**
    * Gets an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchSuggestionsRequestDeferral = js.native
}

object SearchSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: () => SearchSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): SearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionsRequest]
  }
  @scala.inline
  implicit class SearchSuggestionsRequestOps[Self <: SearchSuggestionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeferral(value: () => SearchSuggestionsRequestDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchSuggestionCollection(value: SearchSuggestionCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSuggestionCollection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

