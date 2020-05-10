package typingsSlinky.vscodeLanguageclient.declarationMod

import typingsSlinky.vscode.mod.Declaration
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
}

object DeclarationMiddleware {
  @scala.inline
  def apply(): DeclarationMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationMiddleware]
  }
  @scala.inline
  implicit class DeclarationMiddlewareOps[Self <: DeclarationMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideDeclaration(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDeclarationSignature, 
          ProviderResult[Declaration]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDeclaration")(js.undefined)
        ret
    }
  }
  
}

