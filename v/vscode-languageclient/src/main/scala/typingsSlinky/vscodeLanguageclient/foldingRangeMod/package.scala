package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object foldingRangeMod {
  
  type ProvideFoldingRangeSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* context */ typingsSlinky.vscode.mod.FoldingContext, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.FoldingRange]]
  ]
}
