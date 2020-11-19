package typingsSlinky.vscodeLanguageclient.selectionRangeMod

import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.SelectionRange
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRangeProviderMiddleware extends js.Object {
  
  var provideSelectionRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* positions */ js.Array[Position], 
      /* token */ CancellationToken, 
      /* next */ ProvideSelectionRangeSignature, 
      ProviderResult[js.Array[SelectionRange]]
    ]
  ] = js.native
}
object SelectionRangeProviderMiddleware {
  
  @scala.inline
  def apply(): SelectionRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionRangeProviderMiddleware]
  }
  
  @scala.inline
  implicit class SelectionRangeProviderMiddlewareOps[Self <: SelectionRangeProviderMiddleware] (val x: Self) extends AnyVal {
    
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
    def setProvideSelectionRanges(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ js.Array[Position], 
          /* token */ CancellationToken, 
          /* next */ ProvideSelectionRangeSignature, 
          ProviderResult[js.Array[SelectionRange]]
        ]
    ): Self = this.set("provideSelectionRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideSelectionRanges: Self = this.set("provideSelectionRanges", js.undefined)
  }
}
