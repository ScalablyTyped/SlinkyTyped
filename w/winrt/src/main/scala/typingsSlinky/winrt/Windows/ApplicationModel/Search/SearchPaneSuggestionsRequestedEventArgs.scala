package typingsSlinky.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchPaneSuggestionsRequestedEventArgs extends ISearchPaneSuggestionsRequestedEventArgs
object SearchPaneSuggestionsRequestedEventArgs {
  
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): SearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneSuggestionsRequestedEventArgs]
  }
}
