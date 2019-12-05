package typingsSlinky.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libImplementationMod {
  import typingsSlinky.vscode.vscodeMod.Definition
  import typingsSlinky.vscode.vscodeMod.DefinitionLink
  import typingsSlinky.vscode.vscodeMod.Position
  import typingsSlinky.vscode.vscodeMod.ProviderResult
  import typingsSlinky.vscode.vscodeMod.TextDocument
  import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken

  type ProvideImplementationSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
