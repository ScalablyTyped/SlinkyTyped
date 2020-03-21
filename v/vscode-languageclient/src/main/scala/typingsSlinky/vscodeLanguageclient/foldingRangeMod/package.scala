package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object foldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* context */ typingsSlinky.vscode.mod.FoldingContext, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.FoldingRange]]
  ]
}
