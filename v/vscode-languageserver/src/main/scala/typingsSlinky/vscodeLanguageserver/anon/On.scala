package typingsSlinky.vscodeLanguageserver.anon

import typingsSlinky.vscodeLanguageserver.mod.ServerRequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait On extends js.Object {
  
  def on(
    handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Unit = js.native
  
  def onEdits(
    handler: ServerRequestHandler[
      SemanticTokensEditsParams, 
      SemanticTokensEdits | SemanticTokens, 
      SemanticTokensEditsPartialResult, 
      Unit
    ]
  ): Unit = js.native
  
  def onRange(
    handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Unit = js.native
}
object On {
  
  @scala.inline
  def apply(
    on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit,
    onEdits: ServerRequestHandler[
      SemanticTokensEditsParams, 
      SemanticTokensEdits | SemanticTokens, 
      SemanticTokensEditsPartialResult, 
      Unit
    ] => Unit,
    onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
  ): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onEdits = js.Any.fromFunction1(onEdits), onRange = js.Any.fromFunction1(onRange))
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOn(
      value: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
    ): Self = this.set("on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEdits(
      value: ServerRequestHandler[
          SemanticTokensEditsParams, 
          SemanticTokensEdits | SemanticTokens, 
          SemanticTokensEditsPartialResult, 
          Unit
        ] => Unit
    ): Self = this.set("onEdits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRange(
      value: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
    ): Self = this.set("onRange", js.Any.fromFunction1(value))
  }
}
