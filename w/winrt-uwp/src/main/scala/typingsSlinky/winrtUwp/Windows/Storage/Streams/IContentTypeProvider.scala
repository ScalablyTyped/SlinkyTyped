package typingsSlinky.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Characterizes the format of the data. */
@js.native
trait IContentTypeProvider extends StObject {
  
  /** Gets the format of the data. */
  var contentType: String = js.native
}
object IContentTypeProvider {
  
  @scala.inline
  def apply(contentType: String): IContentTypeProvider = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentTypeProvider]
  }
  
  @scala.inline
  implicit class IContentTypeProviderMutableBuilder[Self <: IContentTypeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
