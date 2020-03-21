package typingsSlinky.vscodeLanguageclient.foldingRangeMod

import typingsSlinky.vscode.mod.FoldingContext
import typingsSlinky.vscode.mod.FoldingRange
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
}

object FoldingRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideFoldingRanges: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* context */ FoldingContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      ProviderResult[js.Array[FoldingRange]]
    ] = null
  ): FoldingRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideFoldingRanges != null) __obj.updateDynamic("provideFoldingRanges")(provideFoldingRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeProviderMiddleware]
  }
}

