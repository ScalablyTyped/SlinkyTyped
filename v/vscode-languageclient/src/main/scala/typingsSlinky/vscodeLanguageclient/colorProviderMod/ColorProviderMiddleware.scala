package typingsSlinky.vscodeLanguageclient.colorProviderMod

import typingsSlinky.vscode.mod.Color
import typingsSlinky.vscode.mod.ColorInformation
import typingsSlinky.vscode.mod.ColorPresentation
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorProviderMiddleware extends js.Object {
  
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* color */ Color, 
      /* context */ Document, 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideColorPresentations(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* color */ Color, 
          /* context */ Document, 
          /* token */ CancellationToken, 
          /* next */ ProvideColorPresentationSignature, 
          ProviderResult[js.Array[ColorPresentation]]
        ]
    ): Self = this.set("provideColorPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideColorPresentations: Self = this.set("provideColorPresentations", js.undefined)
    
    @scala.inline
    def setProvideDocumentColors(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentColorsSignature, 
          ProviderResult[js.Array[ColorInformation]]
        ]
    ): Self = this.set("provideDocumentColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideDocumentColors: Self = this.set("provideDocumentColors", js.undefined)
  }
}
