package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeJsonrpc.mod.TraceValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "Trace")
@js.native
object Trace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.vscodeJsonrpc.mod.Trace with Double] = js.native
  
  /* 1 */ val Messages: typingsSlinky.vscodeJsonrpc.mod.Trace.Messages with Double = js.native
  
  /* 0 */ val Off: typingsSlinky.vscodeJsonrpc.mod.Trace.Off with Double = js.native
  
  /* 2 */ val Verbose: typingsSlinky.vscodeJsonrpc.mod.Trace.Verbose with Double = js.native
  
  def fromString(value: String): typingsSlinky.vscodeJsonrpc.mod.Trace = js.native
  
  def toString_(value: typingsSlinky.vscodeJsonrpc.mod.Trace): TraceValues = js.native
}
