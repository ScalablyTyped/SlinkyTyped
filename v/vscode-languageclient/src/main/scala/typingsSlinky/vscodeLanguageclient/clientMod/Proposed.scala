package typingsSlinky.vscodeLanguageclient.clientMod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proposed {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyIncomingCallsRequest.type")
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
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyOutgoingCallsRequest.type")
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
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  /* was `typeof st.SemanticTokenModifiers` */
  @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokenModifiers")
  @js.native
  object SemanticTokenModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers with String
      ] = js.native
    
    /* "abstract" */ val `abstract`: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.`abstract` with String = js.native
    
    /* "async" */ val async: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.async with String = js.native
    
    /* "declaration" */ val declaration: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.declaration with String = js.native
    
    /* "definition" */ val definition: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.definition with String = js.native
    
    /* "deprecated" */ val deprecated: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.deprecated with String = js.native
    
    /* "documentation" */ val documentation: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.documentation with String = js.native
    
    /* "readonly" */ val readonly: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.readonly with String = js.native
    
    /* "reference" */ val reference: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.reference with String = js.native
    
    /* "static" */ val static: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.static with String = js.native
    
    /* "volatile" */ val volatile: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.volatile with String = js.native
  }
  
  /* was `typeof st.SemanticTokenTypes` */
  @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokenTypes")
  @js.native
  object SemanticTokenTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes with String
      ] = js.native
    
    /* "class" */ val `class`: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`class` with String = js.native
    
    /* "comment" */ val comment: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.comment with String = js.native
    
    /* "enum" */ val enum: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.enum with String = js.native
    
    /* "function" */ val function: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.function with String = js.native
    
    /* "interface" */ val interface: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.interface with String = js.native
    
    /* "keyword" */ val keyword: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.keyword with String = js.native
    
    /* "label" */ val label: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.label with String = js.native
    
    /* "macro" */ val `macro`: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`macro` with String = js.native
    
    /* "member" */ val member: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.member with String = js.native
    
    /* "namespace" */ val namespace: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.namespace with String = js.native
    
    /* "number" */ val number: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.number with String = js.native
    
    /* "operator" */ val operator: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.operator with String = js.native
    
    /* "parameter" */ val parameter: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.parameter with String = js.native
    
    /* "property" */ val property: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.property with String = js.native
    
    /* "regexp" */ val regexp: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.regexp with String = js.native
    
    /* "string" */ val string: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.string with String = js.native
    
    /* "struct" */ val struct: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.struct with String = js.native
    
    /* "type" */ val `type`: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`type` with String = js.native
    
    /* "typeParameter" */ val typeParameter: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.typeParameter with String = js.native
    
    /* "variable" */ val variable: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.variable with String = js.native
  }
  
  /* was `typeof st.SemanticTokens` */
  object SemanticTokens {
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokens.is")
    @js.native
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  
  object SemanticTokensEditsRequest {
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensEditsRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensEditsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensEditsParams, 
        SemanticTokens | SemanticTokensEdits | Null, 
        SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  object SemanticTokensRangeRequest {
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensRangeRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensRangeParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  object SemanticTokensRequest {
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageclient/lib/client", "Proposed.SemanticTokensRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
}
