package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.SelectionRange
import typingsSlinky.vscode.mod.SelectionRangeProvider
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionRangeMod {
  
  @JSImport("vscode-languageclient/lib/selectionRange", "SelectionRangeFeature")
  @js.native
  class SelectionRangeFeature protected () extends TextDocumentFeature[
          Boolean | SelectionRangeOptions, 
          SelectionRangeRegistrationOptions, 
          SelectionRangeProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  type ProvideSelectionRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* positions */ js.Array[Position], 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SelectionRange]]
  ]
  
  @js.native
  trait SelectionRangeProviderMiddleware extends StObject {
    
    var provideSelectionRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ js.Array[Position], 
          /* token */ CancellationToken, 
          /* next */ ProvideSelectionRangeSignature, 
          ProviderResult[js.Array[SelectionRange]]
        ]
      ] = js.native
  }
  object SelectionRangeProviderMiddleware {
    
    @scala.inline
    def apply(): SelectionRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeProviderMiddleware]
    }
    
    @scala.inline
    implicit class SelectionRangeProviderMiddlewareMutableBuilder[Self <: SelectionRangeProviderMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideSelectionRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ js.Array[Position], 
              /* token */ CancellationToken, 
              /* next */ ProvideSelectionRangeSignature, 
              ProviderResult[js.Array[SelectionRange]]
            ]
      ): Self = StObject.set(x, "provideSelectionRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideSelectionRangesUndefined: Self = StObject.set(x, "provideSelectionRanges", js.undefined)
    }
  }
}
