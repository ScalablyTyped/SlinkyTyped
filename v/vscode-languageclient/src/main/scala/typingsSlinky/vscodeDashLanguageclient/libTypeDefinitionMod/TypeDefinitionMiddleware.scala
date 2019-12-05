package typingsSlinky.vscodeDashLanguageclient.libTypeDefinitionMod

import typingsSlinky.vscode.vscodeMod.Definition
import typingsSlinky.vscode.vscodeMod.DefinitionLink
import typingsSlinky.vscode.vscodeMod.Position
import typingsSlinky.vscode.vscodeMod.ProviderResult
import typingsSlinky.vscode.vscodeMod.TextDocument
import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionMiddleware extends js.Object {
  var provideTypeDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
}

object TypeDefinitionMiddleware {
  @scala.inline
  def apply(
    provideTypeDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null
  ): TypeDefinitionMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideTypeDefinition != null) __obj.updateDynamic("provideTypeDefinition")(provideTypeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionMiddleware]
  }
}

