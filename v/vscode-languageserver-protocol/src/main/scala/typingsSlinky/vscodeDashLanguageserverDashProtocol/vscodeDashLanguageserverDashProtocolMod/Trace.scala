package typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.TraceValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Trace")
@js.native
object Trace extends js.Object {
  /* 1 */ val Messages: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Messages with Double = js.native
  /* 0 */ val Off: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Off with Double = js.native
  /* 2 */ val Verbose: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace with Double] = js.native
  def fromString(value: String): typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace = js.native
  def toString(value: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace): TraceValues = js.native
}

