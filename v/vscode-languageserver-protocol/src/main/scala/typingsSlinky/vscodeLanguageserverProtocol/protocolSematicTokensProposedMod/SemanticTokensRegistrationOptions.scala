package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensRegistrationOptions
  extends SemanticTokensOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions
object SemanticTokensRegistrationOptions {
  
  @scala.inline
  def apply(legend: SemanticTokensLegend): SemanticTokensRegistrationOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensRegistrationOptions]
  }
}
