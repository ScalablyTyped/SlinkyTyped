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
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typingsSlinky.vscodeLanguageserverTypes.mod.Declaration
import typingsSlinky.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolDeclarationMod {
  
  object DeclarationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.method")
    @js.native
    val method: textDocumentSlashdeclaration = js.native
    
    /** @deprecated Use DeclarationRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
    
    type HandlerSignature = RequestHandler[DeclarationParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DeclarationParams, 
        Location | (js.Array[Location | LocationLink]) | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        DeclarationRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait DeclarationClientCapabilities extends StObject {
    
    /**
      * Whether declaration supports dynamic registration. If this is set to `true`
      * the client supports the new `DeclarationRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.native
    
    /**
      * The client supports additional metadata in the form of declaration links.
      */
    var linkSupport: js.UndefOr[Boolean] = js.native
  }
  object DeclarationClientCapabilities {
    
    @scala.inline
    def apply(): DeclarationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationClientCapabilities]
    }
    
    @scala.inline
    implicit class DeclarationClientCapabilitiesMutableBuilder[Self <: DeclarationClientCapabilities] (val x: Self) extends AnyVal {
      
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
  
  type DeclarationOptions = WorkDoneProgressOptions
  
  @js.native
  trait DeclarationParams
    extends TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object DeclarationParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): DeclarationParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationParams]
    }
  }
  
  @js.native
  trait DeclarationRegistrationOptions
    extends WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object DeclarationRegistrationOptions {
    
    @scala.inline
    def apply(): DeclarationRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationRegistrationOptions]
    }
  }
}
