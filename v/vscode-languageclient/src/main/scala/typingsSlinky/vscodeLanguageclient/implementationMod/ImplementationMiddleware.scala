package typingsSlinky.vscodeLanguageclient.implementationMod

import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DefinitionLink
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationMiddleware extends js.Object {
  var provideImplementation: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
}

object ImplementationMiddleware {
  @scala.inline
  def apply(
    provideImplementation: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null
  ): ImplementationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideImplementation != null) __obj.updateDynamic("provideImplementation")(provideImplementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationMiddleware]
  }
}

