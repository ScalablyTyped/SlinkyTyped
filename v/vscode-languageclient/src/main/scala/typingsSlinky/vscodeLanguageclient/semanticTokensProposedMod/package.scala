package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object semanticTokensProposedMod {
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* range */ typingsSlinky.vscode.mod.Range, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.SemanticTokens]
  ]
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* previousResultId */ java.lang.String, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.SemanticTokensEdits | typingsSlinky.vscode.mod.SemanticTokens
    ]
  ]
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.SemanticTokens]
  ]
}
