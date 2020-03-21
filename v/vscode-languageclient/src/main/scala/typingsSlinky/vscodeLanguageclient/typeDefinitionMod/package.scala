package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDefinitionMod {
  type ProvideTypeDefinitionSignature = js.Function3[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]
    ]
  ]
}
