package typingsSlinky.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ISearchPaneSuggestionsRequestedEventArgsMutableBuilder[Self <: ISearchPaneSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: SearchPaneSuggestionsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
