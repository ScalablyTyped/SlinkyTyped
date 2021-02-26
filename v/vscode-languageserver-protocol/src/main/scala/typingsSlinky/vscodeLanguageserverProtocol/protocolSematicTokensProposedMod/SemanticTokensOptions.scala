package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.Edits
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensOptions extends WorkDoneProgressOptions {
  
  /**
    * Server supports providing semantic tokens for a full document.
    */
  var documentProvider: js.UndefOr[Boolean | Edits] = js.native
  
  /**
    * The legend used by the server
    */
  var legend: SemanticTokensLegend = js.native
  
  /**
    * Server supports providing semantic tokens for a sepcific range
    * of a document.
    */
  var rangeProvider: js.UndefOr[Boolean] = js.native
}
object SemanticTokensOptions {
  
  @scala.inline
  def apply(legend: SemanticTokensLegend): SemanticTokensOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensOptions]
  }
  
  @scala.inline
  implicit class SemanticTokensOptionsMutableBuilder[Self <: SemanticTokensOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentProvider(value: Boolean | Edits): Self = StObject.set(x, "documentProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentProviderUndefined: Self = StObject.set(x, "documentProvider", js.undefined)
    
    @scala.inline
    def setLegend(value: SemanticTokensLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeProvider(value: Boolean): Self = StObject.set(x, "rangeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeProviderUndefined: Self = StObject.set(x, "rangeProvider", js.undefined)
  }
}
