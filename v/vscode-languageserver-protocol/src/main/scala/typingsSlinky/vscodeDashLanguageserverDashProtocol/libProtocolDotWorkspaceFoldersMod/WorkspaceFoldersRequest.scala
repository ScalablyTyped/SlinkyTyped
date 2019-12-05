package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler0
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType0
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
  type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
  type MiddlewareSignature = js.Function2[
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
  ]
}

