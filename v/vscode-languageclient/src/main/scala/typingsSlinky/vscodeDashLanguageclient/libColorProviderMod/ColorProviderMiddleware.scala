package typingsSlinky.vscodeDashLanguageclient.libColorProviderMod

import typingsSlinky.vscode.vscodeMod.Color
import typingsSlinky.vscode.vscodeMod.ColorInformation
import typingsSlinky.vscode.vscodeMod.ColorPresentation
import typingsSlinky.vscode.vscodeMod.ProviderResult
import typingsSlinky.vscode.vscodeMod.TextDocument
import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typingsSlinky.vscodeDashLanguageclient.Anon_Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* color */ Color, 
      /* context */ Anon_Document, 
      /* token */ CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      ProviderResult[js.Array[ColorPresentation]]
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      ProviderResult[js.Array[ColorInformation]]
    ]
  ] = js.undefined
}

object ColorProviderMiddleware {
  @scala.inline
  def apply(
    provideColorPresentations: js.ThisFunction4[
      /* this */ Unit, 
      /* color */ Color, 
      /* context */ Anon_Document, 
      /* token */ CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      ProviderResult[js.Array[ColorPresentation]]
    ] = null,
    provideDocumentColors: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      ProviderResult[js.Array[ColorInformation]]
    ] = null
  ): ColorProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideColorPresentations != null) __obj.updateDynamic("provideColorPresentations")(provideColorPresentations.asInstanceOf[js.Any])
    if (provideDocumentColors != null) __obj.updateDynamic("provideDocumentColors")(provideDocumentColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProviderMiddleware]
  }
}

