package typingsSlinky.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDeclarationMod {
  import typingsSlinky.vscode.vscodeMod.Declaration
  import typingsSlinky.vscode.vscodeMod.Position
  import typingsSlinky.vscode.vscodeMod.ProviderResult
  import typingsSlinky.vscode.vscodeMod.TextDocument
  import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken

  type ProvideDeclarationSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
