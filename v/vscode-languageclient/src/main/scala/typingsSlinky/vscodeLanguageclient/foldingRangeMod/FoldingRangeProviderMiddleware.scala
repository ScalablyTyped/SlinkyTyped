package typingsSlinky.vscodeLanguageclient.foldingRangeMod

import typingsSlinky.vscode.mod.FoldingContext
import typingsSlinky.vscode.mod.FoldingRange
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRangeProviderMiddleware extends js.Object {
  
  var provideFoldingRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* context */ FoldingContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      ProviderResult[js.Array[FoldingRange]]
    ]
  ] = js.native
}
object FoldingRangeProviderMiddleware {
  
  @scala.inline
  def apply(): FoldingRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRangeProviderMiddleware]
  }
  
  @scala.inline
  implicit class FoldingRangeProviderMiddlewareOps[Self <: FoldingRangeProviderMiddleware] (val x: Self) extends AnyVal {
    
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
    def setProvideFoldingRanges(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* context */ FoldingContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideFoldingRangeSignature, 
          ProviderResult[js.Array[FoldingRange]]
        ]
    ): Self = this.set("provideFoldingRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideFoldingRanges: Self = this.set("provideFoldingRanges", js.undefined)
  }
}
