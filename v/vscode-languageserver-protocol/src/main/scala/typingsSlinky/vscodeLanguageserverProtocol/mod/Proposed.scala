package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Proposed")
@js.native
object Proposed extends js.Object {
  val SemanticTokenModifiers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenModifiers */ js.Any = js.native
  val SemanticTokenTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenTypes */ js.Any = js.native
  @js.native
  object CallHierarchyIncomingCallsRequest extends js.Object {
    val method: callHierarchySlashincomingCalls = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams, 
        (js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
        ]) | Null, 
        js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
        ], 
        Unit, 
        Unit
      ] = js.native
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsRequest.HandlerSignature
  }
  
  @js.native
  object CallHierarchyOutgoingCallsRequest extends js.Object {
    val method: callHierarchySlashoutgoingCalls = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams, 
        (js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
        ]) | Null, 
        js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
        ], 
        Unit, 
        Unit
      ] = js.native
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsRequest.HandlerSignature
  }
  
  @js.native
  object CallHierarchyPrepareRequest extends js.Object {
    val method: textDocumentSlashprepareCallHierarchy = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams, 
        (js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
        ]) | Null, 
        scala.Nothing, 
        Unit, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
      ] = js.native
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareRequest.HandlerSignature
  }
  
  @js.native
  object SemanticTokens extends js.Object {
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  
  @js.native
  object SemanticTokensEditsRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits | Null, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult | typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult, 
        Unit, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRangeRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRequest extends js.Object {
    val method: textDocumentSlashsemanticTokens = js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  type CallHierarchyClientCapabilities = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyClientCapabilities
  type CallHierarchyIncomingCall = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
  type CallHierarchyIncomingCallsParams = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams
  type CallHierarchyItem = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
  type CallHierarchyOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOptions
  type CallHierarchyOutgoingCall = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
  type CallHierarchyOutgoingCallsParams = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams
  type CallHierarchyPrepareParams = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams
  type CallHierarchyRegistrationOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
  type CallHierarchyServerCapabilities = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyServerCapabilities
  type SemanticTokens = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
  type SemanticTokensClientCapabilities = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensClientCapabilities
  type SemanticTokensEdit = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdit
  type SemanticTokensEdits = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits
  type SemanticTokensEditsParams = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams
  type SemanticTokensEditsPartialResult = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult
  type SemanticTokensLegend = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensLegend
  type SemanticTokensOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensOptions
  type SemanticTokensParams = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams
  type SemanticTokensPartialResult = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult
  type SemanticTokensRangeParams = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams
  type SemanticTokensRegistrationOptions = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
  type SemanticTokensServerCapabilities = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensServerCapabilities
}

