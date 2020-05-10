package typingsSlinky.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneSuggestionsRequest extends js.Object {
  var isCanceled: Boolean = js.native
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
  def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
}

object ISearchPaneSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: () => SearchPaneSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
  @scala.inline
  implicit class ISearchPaneSuggestionsRequestOps[Self <: ISearchPaneSuggestionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeferral(value: () => SearchPaneSuggestionsRequestDeferral): Self = {
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

