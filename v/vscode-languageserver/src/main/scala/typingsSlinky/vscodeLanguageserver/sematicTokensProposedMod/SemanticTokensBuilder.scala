package typingsSlinky.vscodeLanguageserver.sematicTokensProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver/lib/sematicTokens.proposed", "SemanticTokensBuilder")
@js.native
class SemanticTokensBuilder () extends js.Object {
  
  var _data: js.Any = js.native
  
  var _dataLen: js.Any = js.native
  
  var _id: js.Any = js.native
  
  var _prevChar: js.Any = js.native
  
  var _prevData: js.Any = js.native
  
  var _prevLine: js.Any = js.native
  
  def build(): typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens = js.native
  
  def buildEdits(): typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens | SemanticTokensEdits = js.native
  
  def canBuildEdits(): Boolean = js.native
  
  def id: String = js.native
  
  var initialize: js.Any = js.native
  
  def previousResult(id: String): Unit = js.native
  
  def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
}
