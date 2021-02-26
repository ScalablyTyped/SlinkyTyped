package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.Declaration
import typingsSlinky.vscode.mod.DeclarationProvider
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationMod {
  
  @JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
  @js.native
  class DeclarationFeature protected () extends TextDocumentFeature[Boolean | DeclarationOptions, DeclarationRegistrationOptions, DeclarationProvider] {
    def this(client: BaseLanguageClient) = this()
  }
  
  @js.native
  trait DeclarationMiddleware extends StObject {
    
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
    implicit class DeclarationMiddlewareMutableBuilder[Self <: DeclarationMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideDeclaration(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDeclarationSignature, 
              ProviderResult[Declaration]
            ]
      ): Self = StObject.set(x, "provideDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideDeclarationUndefined: Self = StObject.set(x, "provideDeclaration", js.undefined)
    }
  }
  
  type ProvideDeclarationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
