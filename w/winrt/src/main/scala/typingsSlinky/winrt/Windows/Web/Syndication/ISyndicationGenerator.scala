package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationGenerator extends StObject {
  
  var text: String = js.native
  
  var uri: Uri = js.native
  
  var version: String = js.native
}
object ISyndicationGenerator {
  
  @scala.inline
  def apply(text: String, uri: Uri, version: String): ISyndicationGenerator = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationGenerator]
  }
  
  @scala.inline
  implicit class ISyndicationGeneratorMutableBuilder[Self <: ISyndicationGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
