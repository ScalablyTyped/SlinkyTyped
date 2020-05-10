package typingsSlinky.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneSuggestionsRequestedEventArgs extends ISearchPaneQueryChangedEventArgs {
  var request: SearchPaneSuggestionsRequest = js.native
}

object ISearchPaneSuggestionsRequestedEventArgs {
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): ISearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestedEventArgs]
  }
  @scala.inline
  implicit class ISearchPaneSuggestionsRequestedEventArgsOps[Self <: ISearchPaneSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: SearchPaneSuggestionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

