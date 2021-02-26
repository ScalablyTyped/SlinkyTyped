package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokens extends StObject {
  
  /**
    * The actual tokens. For a detailed description about how the data is
    * structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L71
    */
  var data: js.Array[Double] = js.native
  
  /**
    * An optional result id. If provided and clients support delta updating
    * the client will include the result id in the next semantic token request.
    * A server can then instead of computing all sematic tokens again simply
    * send a delta.
    */
  var resultId: js.UndefOr[String] = js.native
}
object SemanticTokens {
  
  @scala.inline
  def apply(data: js.Array[Double]): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokens.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  
  @scala.inline
  implicit class SemanticTokensMutableBuilder[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
