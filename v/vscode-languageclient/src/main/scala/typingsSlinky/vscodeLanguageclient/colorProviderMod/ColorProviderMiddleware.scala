package typingsSlinky.vscodeLanguageclient.colorProviderMod

import typingsSlinky.vscode.mod.Color
import typingsSlinky.vscode.mod.ColorInformation
import typingsSlinky.vscode.mod.ColorPresentation
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.AnonDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* color */ Color, 
      /* context */ AnonDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      ProviderResult[js.Array[ColorPresentation]]
    ]
  ] = js.native
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      ProviderResult[js.Array[ColorInformation]]
    ]
  ] = js.native
}

object ColorProviderMiddleware {
  @scala.inline
  def apply(): ColorProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProviderMiddleware]
  }
  @scala.inline
  implicit class ColorProviderMiddlewareOps[Self <: ColorProviderMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideColorPresentations(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* color */ Color, 
          /* context */ AnonDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideColorPresentationSignature, 
          ProviderResult[js.Array[ColorPresentation]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideColorPresentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideColorPresentations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideColorPresentations")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideDocumentColors(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentColorsSignature, 
          ProviderResult[js.Array[ColorInformation]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideDocumentColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentColors")(js.undefined)
        ret
    }
  }
  
}

