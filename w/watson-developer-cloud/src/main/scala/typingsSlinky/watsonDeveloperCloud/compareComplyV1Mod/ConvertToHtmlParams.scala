package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `convertToHtml` operation. */
@js.native
trait ConvertToHtmlParams extends StObject {
  
  /** The document to convert. */
  var file: ReadableStream | FileObject | Buffer = js.native
  
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.native
  
  /** The filename for file. */
  var filename: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ConvertToHtmlParams {
  
  @scala.inline
  def apply(file: ReadableStream | FileObject | Buffer, filename: String): ConvertToHtmlParams = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertToHtmlParams]
  }
  
  @scala.inline
  implicit class ConvertToHtmlParamsMutableBuilder[Self <: ConvertToHtmlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_content_type(value: FileContentType | String): Self = StObject.set(x, "file_content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_content_typeUndefined: Self = StObject.set(x, "file_content_type", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
