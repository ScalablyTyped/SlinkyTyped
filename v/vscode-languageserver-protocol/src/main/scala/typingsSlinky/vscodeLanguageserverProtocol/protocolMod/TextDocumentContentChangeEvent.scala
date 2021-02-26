package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.anon.Range
  - typingsSlinky.vscodeLanguageserverProtocol.anon.Text
*/
trait TextDocumentContentChangeEvent extends StObject
object TextDocumentContentChangeEvent {
  
  @scala.inline
  def Range(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, text: String): typingsSlinky.vscodeLanguageserverProtocol.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.anon.Range]
  }
  
  @scala.inline
  def Text(text: String): typingsSlinky.vscodeLanguageserverProtocol.anon.Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.anon.Text]
  }
}
