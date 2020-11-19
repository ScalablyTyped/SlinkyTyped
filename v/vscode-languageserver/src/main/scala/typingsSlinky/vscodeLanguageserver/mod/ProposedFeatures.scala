package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.vscodeLanguageserver.callHierarchyProposedMod.CallHierarchy
import typingsSlinky.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  
  val SemanticTokensBuilder: Instantiable0[
    typingsSlinky.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokensBuilder
  ] = js.native
  
  val all: Features[
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    CallHierarchy with SemanticTokens
  ] = js.native
  
  type SemanticTokensBuilder = typingsSlinky.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokensBuilder
}
