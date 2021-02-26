package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.FoldingContext
import typingsSlinky.vscode.mod.FoldingRange
import typingsSlinky.vscode.mod.FoldingRangeProvider
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldingRangeMod {
  
  @JSImport("vscode-languageclient/lib/foldingRange", "FoldingRangeFeature")
  @js.native
  class FoldingRangeFeature protected () extends TextDocumentFeature[Boolean | FoldingRangeOptions, FoldingRangeRegistrationOptions, FoldingRangeProvider] {
    def this(client: BaseLanguageClient) = this()
    
    var asFoldingRangeKind: js.Any = js.native
    
    var asFoldingRanges: js.Any = js.native
  }
  
  @js.native
  trait FoldingRangeProviderMiddleware extends StObject {
    
    var provideFoldingRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* context */ FoldingContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideFoldingRangeSignature, 
          ProviderResult[js.Array[FoldingRange]]
        ]
      ] = js.native
  }
  object FoldingRangeProviderMiddleware {
    
    @scala.inline
    def apply(): FoldingRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeProviderMiddleware]
    }
    
    @scala.inline
    implicit class FoldingRangeProviderMiddlewareMutableBuilder[Self <: FoldingRangeProviderMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideFoldingRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* context */ FoldingContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideFoldingRangeSignature, 
              ProviderResult[js.Array[FoldingRange]]
            ]
      ): Self = StObject.set(x, "provideFoldingRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideFoldingRangesUndefined: Self = StObject.set(x, "provideFoldingRanges", js.undefined)
    }
  }
  
  type ProvideFoldingRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* context */ FoldingContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[FoldingRange]]
  ]
}
