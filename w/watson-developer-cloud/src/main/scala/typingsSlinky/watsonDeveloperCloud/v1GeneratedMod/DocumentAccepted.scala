package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentAccepted. */
@js.native
trait DocumentAccepted extends StObject {
  
  /** The unique identifier of the ingested document. */
  var document_id: js.UndefOr[String] = js.native
  
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  
  /** Status of the document in the ingestion process. A status of `processing` is returned for documents that are ingested with a *version* date before `2019-01-01`. The `pending` status is returned for all others. */
  var status: js.UndefOr[String] = js.native
}
object DocumentAccepted {
  
  @scala.inline
  def apply(): DocumentAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccepted]
  }
  
  @scala.inline
  implicit class DocumentAcceptedMutableBuilder[Self <: DocumentAccepted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
