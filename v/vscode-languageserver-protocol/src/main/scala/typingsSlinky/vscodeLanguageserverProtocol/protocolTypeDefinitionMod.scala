package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageserverTypes.mod.Definition
import typingsSlinky.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolTypeDefinitionMod {
  
  object TypeDefinitionRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.typeDefinition", "TypeDefinitionRequest.method")
    @js.native
    val method: textDocumentSlashtypeDefinition = js.native
    
    /** @deprecated Use TypeDefinitionRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.typeDefinition", "TypeDefinitionRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
    
    type HandlerSignature = RequestHandler[TypeDefinitionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.typeDefinition", "TypeDefinitionRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        TypeDefinitionParams, 
        Location | (js.Array[Location | LocationLink]) | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        TypeDefinitionRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait TypeDefinitionClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `TypeDefinitionRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.native
    
    /**
      * The client supports additional metadata in the form of definition links.
      *
      * Since 3.14.0
      */
    var linkSupport: js.UndefOr[Boolean] = js.native
  }
  object TypeDefinitionClientCapabilities {
    
    @scala.inline
    def apply(): TypeDefinitionClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionClientCapabilities]
    }
    
    @scala.inline
    implicit class TypeDefinitionClientCapabilitiesMutableBuilder[Self <: TypeDefinitionClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      @scala.inline
      def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
    }
  }
  
  type TypeDefinitionOptions = WorkDoneProgressOptions
  
  @js.native
  trait TypeDefinitionParams
    extends TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object TypeDefinitionParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): TypeDefinitionParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeDefinitionParams]
    }
  }
  
  @js.native
  trait TypeDefinitionRegistrationOptions
    extends TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object TypeDefinitionRegistrationOptions {
    
    @scala.inline
    def apply(): TypeDefinitionRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionRegistrationOptions]
    }
  }
}
