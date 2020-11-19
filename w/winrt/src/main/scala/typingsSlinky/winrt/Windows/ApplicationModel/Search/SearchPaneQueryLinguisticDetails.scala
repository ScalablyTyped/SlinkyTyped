package typingsSlinky.winrt.Windows.ApplicationModel.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchPaneQueryLinguisticDetails extends ISearchPaneQueryLinguisticDetails
object SearchPaneQueryLinguisticDetails {
  
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): SearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQueryLinguisticDetails]
  }
}
