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

@js.native
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
  ] = js.native
}

object ImplementationMiddleware {
  @scala.inline
  def apply(): ImplementationMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationMiddleware]
  }
  @scala.inline
  implicit class ImplementationMiddlewareOps[Self <: ImplementationMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideImplementation(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideImplementationSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideImplementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideImplementation")(js.undefined)
        ret
    }
  }
  
}

