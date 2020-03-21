package typingsSlinky.vscodeLanguageclient.declarationMod

import typingsSlinky.vscode.mod.Declaration
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMiddleware extends js.Object {
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      ProviderResult[Declaration]
    ]
  ] = js.undefined
}

object DeclarationMiddleware {
  @scala.inline
  def apply(
    provideDeclaration: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      ProviderResult[Declaration]
    ] = null
  ): DeclarationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideDeclaration != null) __obj.updateDynamic("provideDeclaration")(provideDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationMiddleware]
  }
}

