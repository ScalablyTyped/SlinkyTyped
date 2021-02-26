package typingsSlinky.winrt.Windows.ApplicationModel.Resources

import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceLoaderStatics extends StObject {
  
  def getStringForReference(uri: Uri): String = js.native
}
object IResourceLoaderStatics {
  
  @scala.inline
  def apply(getStringForReference: Uri => String): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal(getStringForReference = js.Any.fromFunction1(getStringForReference))
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
  
  @scala.inline
  implicit class IResourceLoaderStaticsMutableBuilder[Self <: IResourceLoaderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStringForReference(value: Uri => String): Self = StObject.set(x, "getStringForReference", js.Any.fromFunction1(value))
  }
}
