package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
@js.native
trait BackgroundTransferContentPart extends StObject {
  
  /**
    * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
    * @param value The source file.
    */
  def setFile(value: IStorageFile): Unit = js.native
  
  /**
    * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setHeader(headerName: String, headerValue: String): Unit = js.native
  
  /**
    * Use this method to set text information that the BackgroundTransferContentPart represents.
    * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
    */
  def setText(value: String): Unit = js.native
}
object BackgroundTransferContentPart {
  
  @scala.inline
  def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): BackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[BackgroundTransferContentPart]
  }
  
  @scala.inline
  implicit class BackgroundTransferContentPartMutableBuilder[Self <: BackgroundTransferContentPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetFile(value: IStorageFile => Unit): Self = StObject.set(x, "setFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
