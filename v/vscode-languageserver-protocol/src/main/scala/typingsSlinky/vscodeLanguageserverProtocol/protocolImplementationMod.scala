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
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
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

object protocolImplementationMod {
  
  object ImplementationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.method")
    @js.native
    val method: textDocumentSlashimplementation = js.native
    
    /** @deprecated Use ImplementationRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
    
    type HandlerSignature = RequestHandler[ImplementationParams, Definition | js.Array[DefinitionLink] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ImplementationParams, 
        Location | (js.Array[Location | LocationLink]) | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        ImplementationRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait ImplementationClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `ImplementationRegistrationOptions` return value
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
  object ImplementationClientCapabilities {
    
    @scala.inline
    def apply(): ImplementationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImplementationClientCapabilities]
    }
    
    @scala.inline
    implicit class ImplementationClientCapabilitiesMutableBuilder[Self <: ImplementationClientCapabilities] (val x: Self) extends AnyVal {
      
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
  
  type ImplementationOptions = WorkDoneProgressOptions
  
  @js.native
  trait ImplementationParams
    extends TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object ImplementationParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): ImplementationParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImplementationParams]
    }
  }
  
  @js.native
  trait ImplementationRegistrationOptions
    extends TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object ImplementationRegistrationOptions {
    
    @scala.inline
    def apply(): ImplementationRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImplementationRegistrationOptions]
    }
  }
}
