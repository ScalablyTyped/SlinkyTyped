package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResult. */
@js.native
trait QueryNoticesResult
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** The internal status code returned by the ingestion subsystem indicating the overall result of ingesting the source document. */
  var code: js.UndefOr[Double] = js.native
  
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.native
  
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.native
  
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.native
  
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.native
  
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** Array of notices for the document. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.native
  
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.native
  
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.native
}
object QueryNoticesResult {
  
  @scala.inline
  def apply(): QueryNoticesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResult]
  }
  
  @scala.inline
  implicit class QueryNoticesResultMutableBuilder[Self <: QueryNoticesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    @scala.inline
    def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_typeUndefined: Self = StObject.set(x, "file_type", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setResult_metadata(value: QueryResultMetadata): Self = StObject.set(x, "result_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_metadataUndefined: Self = StObject.set(x, "result_metadata", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
