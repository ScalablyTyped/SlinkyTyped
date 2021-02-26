package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object contain retrieval type information. */
@js.native
trait RetrievalDetails extends StObject {
  
  /** Indentifies the document retrieval strategy used for this query. `relevancy_training` indicates that the results were returned using a relevancy trained model. `continuous_relevancy_training` indicates that the results were returned using the continuous relevancy training model created by result feedback analysis. `untrained` means the results were returned using the standard untrained model. **Note**: In the event of trained collections being queried, but the trained model is not used to return results, the **document_retrieval_strategy** will be listed as `untrained`. */
  var document_retrieval_strategy: js.UndefOr[String] = js.native
}
object RetrievalDetails {
  
  @scala.inline
  def apply(): RetrievalDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalDetails]
  }
  
  @scala.inline
  implicit class RetrievalDetailsMutableBuilder[Self <: RetrievalDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_retrieval_strategy(value: String): Self = StObject.set(x, "document_retrieval_strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_retrieval_strategyUndefined: Self = StObject.set(x, "document_retrieval_strategy", js.undefined)
  }
}
