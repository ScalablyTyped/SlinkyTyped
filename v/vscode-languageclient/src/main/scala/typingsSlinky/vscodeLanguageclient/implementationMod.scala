package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DefinitionLink
import typingsSlinky.vscode.mod.ImplementationProvider
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  @JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
  @js.native
  class ImplementationFeature protected () extends TextDocumentFeature[
          Boolean | ImplementationOptions, 
          ImplementationRegistrationOptions, 
          ImplementationProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  @js.native
  trait ImplementationMiddleware extends StObject {
    
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
    implicit class ImplementationMiddlewareMutableBuilder[Self <: ImplementationMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideImplementation(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideImplementationSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideImplementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideImplementationUndefined: Self = StObject.set(x, "provideImplementation", js.undefined)
    }
  }
  
  type ProvideImplementationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
