package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashincomingCalls
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashoutgoingCalls
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashedits
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashrange
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Proposed")
@js.native
object Proposed extends js.Object {
  val SemanticTokenModifiers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenModifiers */ js.Any = js.native
  val SemanticTokenTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenTypes */ js.Any = js.native
  @js.native
  object CallHierarchyIncomingCallsRequest extends js.Object {
    val method: callHierarchySlashincomingCalls = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object CallHierarchyOutgoingCallsRequest extends js.Object {
    val method: callHierarchySlashoutgoingCalls = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object CallHierarchyPrepareRequest extends js.Object {
    val method: textDocumentSlashprepareCallHierarchy = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokens extends js.Object {
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  
  @js.native
  object SemanticTokensEditsRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensEditsParams, 
        SemanticTokens | SemanticTokensEdits | Null, 
        SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRangeRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensRangeParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRequest extends js.Object {
    val method: textDocumentSlashsemanticTokens = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
}

