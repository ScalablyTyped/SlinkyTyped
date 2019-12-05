package typingsSlinky.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFoldingRangeMod {
  import typingsSlinky.vscode.vscodeMod.FoldingContext
  import typingsSlinky.vscode.vscodeMod.FoldingRange
  import typingsSlinky.vscode.vscodeMod.ProviderResult
  import typingsSlinky.vscode.vscodeMod.TextDocument
  import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken

  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ TextDocument, 
    /* context */ FoldingContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[FoldingRange]]
  ]
}
