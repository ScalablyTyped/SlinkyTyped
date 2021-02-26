package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.anon.CallHierarchy
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolTag
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCallHierarchyProposedMod {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyIncomingCallsParams, js.Array[CallHierarchyIncomingCall] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyIncomingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyOutgoingCallsParams, js.Array[CallHierarchyOutgoingCall] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyOutgoingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait CallHierarchyClientCapabilities extends StObject {
    
    /**
      * The text document client capabilities
      */
    var textDocument: js.UndefOr[CallHierarchy] = js.native
  }
  object CallHierarchyClientCapabilities {
    
    @scala.inline
    def apply(): CallHierarchyClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyClientCapabilities]
    }
    
    @scala.inline
    implicit class CallHierarchyClientCapabilitiesMutableBuilder[Self <: CallHierarchyClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextDocument(value: CallHierarchy): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
    }
  }
  
  @js.native
  trait CallHierarchyIncomingCall extends StObject {
    
    /**
      * The item that makes the call.
      */
    var from: CallHierarchyItem = js.native
    
    /**
      * The range at which at which the calls appears. This is relative to the caller
      * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
      */
    var fromRanges: js.Array[Range] = js.native
  }
  object CallHierarchyIncomingCall {
    
    @scala.inline
    def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyIncomingCall]
    }
    
    @scala.inline
    implicit class CallHierarchyIncomingCallMutableBuilder[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CallHierarchyIncomingCallsParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem = js.native
  }
  object CallHierarchyIncomingCallsParams {
    
    @scala.inline
    def apply(item: CallHierarchyItem): CallHierarchyIncomingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyIncomingCallsParams]
    }
    
    @scala.inline
    implicit class CallHierarchyIncomingCallsParamsMutableBuilder[Self <: CallHierarchyIncomingCallsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CallHierarchyItem extends StObject {
    
    /**
      * More detail for this item, e.g. the signature of a function.
      */
    var detail: js.UndefOr[String] = js.native
    
    /**
      * The kind of this item.
      */
    var kind: SymbolKind = js.native
    
    /**
      * The name of this item.
      */
    var name: String = js.native
    
    /**
      * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
      */
    var range: Range = js.native
    
    /**
      * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
      * Must be contained by the [`range`](#CallHierarchyItem.range).
      */
    var selectionRange: Range = js.native
    
    /**
      * Tags for this item.
      */
    var tags: js.UndefOr[js.Array[SymbolTag]] = js.native
    
    /**
      * The resource identifier of this item.
      */
    var uri: DocumentUri = js.native
  }
  object CallHierarchyItem {
    
    @scala.inline
    def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range, uri: DocumentUri): CallHierarchyItem = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyItem]
    }
    
    @scala.inline
    implicit class CallHierarchyItemMutableBuilder[Self <: CallHierarchyItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionRange(value: Range): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type CallHierarchyOptions = WorkDoneProgressOptions
  
  @js.native
  trait CallHierarchyOutgoingCall extends StObject {
    
    /**
      * The range at which this item is called. This is the range relative to the caller, e.g the item
      * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyItemProvider.provideCallHierarchyOutgoingCalls)
      * and not [`this.to`](#CallHierarchyOutgoingCall.to).
      */
    var fromRanges: js.Array[Range] = js.native
    
    /**
      * The item that is called.
      */
    var to: CallHierarchyItem = js.native
  }
  object CallHierarchyOutgoingCall {
    
    @scala.inline
    def apply(fromRanges: js.Array[Range], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
      val __obj = js.Dynamic.literal(fromRanges = fromRanges.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyOutgoingCall]
    }
    
    @scala.inline
    implicit class CallHierarchyOutgoingCallMutableBuilder[Self <: CallHierarchyOutgoingCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: CallHierarchyItem): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CallHierarchyOutgoingCallsParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem = js.native
  }
  object CallHierarchyOutgoingCallsParams {
    
    @scala.inline
    def apply(item: CallHierarchyItem): CallHierarchyOutgoingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyOutgoingCallsParams]
    }
    
    @scala.inline
    implicit class CallHierarchyOutgoingCallsParamsMutableBuilder[Self <: CallHierarchyOutgoingCallsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CallHierarchyPrepareParams
    extends TextDocumentPositionParams
       with WorkDoneProgressParams
  object CallHierarchyPrepareParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): CallHierarchyPrepareParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyPrepareParams]
    }
  }
  
  @js.native
  trait CallHierarchyRegistrationOptions
    extends TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
  object CallHierarchyRegistrationOptions {
    
    @scala.inline
    def apply(): CallHierarchyRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyRegistrationOptions]
    }
  }
  
  @js.native
  trait CallHierarchyServerCapabilities extends StObject {
    
    /**
      * The server provides Call Hierarchy support.
      */
    var callHierarchyProvider: js.UndefOr[
        Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions)
      ] = js.native
  }
  object CallHierarchyServerCapabilities {
    
    @scala.inline
    def apply(): CallHierarchyServerCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyServerCapabilities]
    }
    
    @scala.inline
    implicit class CallHierarchyServerCapabilitiesMutableBuilder[Self <: CallHierarchyServerCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallHierarchyProvider(
        value: Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions)
      ): Self = StObject.set(x, "callHierarchyProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallHierarchyProviderUndefined: Self = StObject.set(x, "callHierarchyProvider", js.undefined)
    }
  }
}
