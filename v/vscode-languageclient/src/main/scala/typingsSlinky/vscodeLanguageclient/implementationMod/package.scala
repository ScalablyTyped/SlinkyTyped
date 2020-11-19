package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object implementationMod {
  
  type ProvideImplementationSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]
    ]
  ]
}
