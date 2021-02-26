package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.DocumentLink
import typingsSlinky.vscode.mod.Range
import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolDocumentLinkMod {
  
  @JSImport("vscode-languageclient/lib/protocolDocumentLink", JSImport.Default)
  @js.native
  class default protected () extends ProtocolDocumentLink {
    def this(range: Range) = this()
    def this(range: Range, target: Uri) = this()
  }
  
  @js.native
  trait ProtocolDocumentLink extends DocumentLink {
    
    var data: js.Any = js.native
  }
}
