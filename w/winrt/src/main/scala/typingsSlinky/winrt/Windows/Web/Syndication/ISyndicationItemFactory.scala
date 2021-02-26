package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationItemFactory extends StObject {
  
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem = js.native
}
object ISyndicationItemFactory {
  
  @scala.inline
  def apply(createSyndicationItem: (String, SyndicationContent, Uri) => SyndicationItem): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal(createSyndicationItem = js.Any.fromFunction3(createSyndicationItem))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
  
  @scala.inline
  implicit class ISyndicationItemFactoryMutableBuilder[Self <: ISyndicationItemFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSyndicationItem(value: (String, SyndicationContent, Uri) => SyndicationItem): Self = StObject.set(x, "createSyndicationItem", js.Any.fromFunction3(value))
  }
}
