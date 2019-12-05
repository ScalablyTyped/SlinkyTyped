package typingsSlinky.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColorProviderMod {
  import typingsSlinky.vscode.vscodeMod.Color
  import typingsSlinky.vscode.vscodeMod.ColorInformation
  import typingsSlinky.vscode.vscodeMod.ColorPresentation
  import typingsSlinky.vscode.vscodeMod.ProviderResult
  import typingsSlinky.vscode.vscodeMod.TextDocument
  import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  import typingsSlinky.vscodeDashLanguageclient.Anon_Document

  type ProvideColorPresentationSignature = js.Function3[
    /* color */ Color, 
    /* context */ Anon_Document, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorPresentation]]
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorInformation]]
  ]
}
