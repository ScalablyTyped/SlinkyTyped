package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proposed {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyIncomingCallsRequest.type")
    @js.native
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
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyOutgoingCallsRequest.type")
    @js.native
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
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    type HandlerSignature = typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams, 
        (js.Array[
          typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
        ]) | Null, 
        scala.Nothing, 
        Unit, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  /* was `typeof st.SemanticTokenModifiers` */
  @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokenModifiers")
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
  @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokenTypes")
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
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokens.is")
    @js.native
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  type SemanticTokens = typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
  
  object SemanticTokensEditsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensEditsRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensEditsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits | Null, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult | typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult, 
        Unit, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  object SemanticTokensRangeRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRangeRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  object SemanticTokensRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRequest.type")
    @js.native
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
