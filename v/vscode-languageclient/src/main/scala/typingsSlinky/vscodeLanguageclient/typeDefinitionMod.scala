package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DefinitionLink
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscode.mod.TypeDefinitionProvider
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDefinitionMod {
  
  @JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
  @js.native
  class TypeDefinitionFeature protected () extends TextDocumentFeature[
          Boolean | TypeDefinitionOptions, 
          TypeDefinitionRegistrationOptions, 
          TypeDefinitionProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  type ProvideTypeDefinitionSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  
  @js.native
  trait TypeDefinitionMiddleware extends StObject {
    
    var provideTypeDefinition: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideTypeDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.native
  }
  object TypeDefinitionMiddleware {
    
    @scala.inline
    def apply(): TypeDefinitionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionMiddleware]
    }
    
    @scala.inline
    implicit class TypeDefinitionMiddlewareMutableBuilder[Self <: TypeDefinitionMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideTypeDefinition(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideTypeDefinitionSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideTypeDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideTypeDefinitionUndefined: Self = StObject.set(x, "provideTypeDefinition", js.undefined)
    }
  }
}
