package typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyOutgoingCallsRequest")
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
  
  type HandlerSignature = RequestHandler[CallHierarchyOutgoingCallsParams, js.Array[CallHierarchyOutgoingCall] | Null, Unit]
}
