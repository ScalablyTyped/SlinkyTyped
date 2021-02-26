package typingsSlinky.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileUpdateRequestedEventArgs extends StObject {
  
  var request: FileUpdateRequest = js.native
}
object IFileUpdateRequestedEventArgs {
  
  @scala.inline
  def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IFileUpdateRequestedEventArgsMutableBuilder[Self <: IFileUpdateRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: FileUpdateRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
