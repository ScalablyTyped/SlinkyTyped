package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolSelectionRangeMod {
  
  object SelectionRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.selectionRange", "SelectionRangeRequest.method")
    @js.native
    val method: textDocumentSlashselectionRange = js.native
    
    /** @deprecated  Use SelectionRangeRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.selectionRange", "SelectionRangeRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[SelectionRange]] = js.native
    
    type HandlerSignature = RequestHandler[SelectionRangeParams, js.Array[SelectionRange] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.selectionRange", "SelectionRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SelectionRangeParams, 
        js.Array[SelectionRange] | Null, 
        js.Array[SelectionRange], 
        js.Any, 
        SelectionRangeRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait SelectionRangeClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration for selection range providers. If this is set to `true`
      * the client supports the new `SelectionRangeRegistrationOptions` return value for the corresponding server
      * capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.native
  }
  object SelectionRangeClientCapabilities {
    
    @scala.inline
    def apply(): SelectionRangeClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeClientCapabilities]
    }
    
    @scala.inline
    implicit class SelectionRangeClientCapabilitiesMutableBuilder[Self <: SelectionRangeClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type SelectionRangeOptions = WorkDoneProgressOptions
  
  @js.native
  trait SelectionRangeParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The positions inside the text document.
      */
    var positions: js.Array[Position] = js.native
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier = js.native
  }
  object SelectionRangeParams {
    
    @scala.inline
    def apply(positions: js.Array[Position], textDocument: TextDocumentIdentifier): SelectionRangeParams = {
      val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionRangeParams]
    }
    
    @scala.inline
    implicit class SelectionRangeParamsMutableBuilder[Self <: SelectionRangeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPositions(value: js.Array[Position]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsVarargs(value: Position*): Self = StObject.set(x, "positions", js.Array(value :_*))
      
      @scala.inline
      def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectionRangeRegistrationOptions
    extends WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object SelectionRangeRegistrationOptions {
    
    @scala.inline
    def apply(): SelectionRangeRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeRegistrationOptions]
    }
  }
}
