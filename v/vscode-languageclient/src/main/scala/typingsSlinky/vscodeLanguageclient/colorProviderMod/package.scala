package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object colorProviderMod {
  
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ typingsSlinky.vscode.mod.Color, 
    /* context */ typingsSlinky.vscodeLanguageclient.anon.Document, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.ColorPresentation]]
  ]
  
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.ColorInformation]]
  ]
}
