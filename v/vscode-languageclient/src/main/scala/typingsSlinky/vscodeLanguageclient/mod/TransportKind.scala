package typingsSlinky.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransportKind extends Transport
@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportKind with Double] = js.native
  
  @js.native
  sealed trait ipc extends TransportKind
  /* 1 */ val ipc: typingsSlinky.vscodeLanguageclient.mod.TransportKind.ipc with Double = js.native
  
  @js.native
  sealed trait pipe extends TransportKind
  /* 2 */ val pipe: typingsSlinky.vscodeLanguageclient.mod.TransportKind.pipe with Double = js.native
  
  @js.native
  sealed trait socket extends TransportKind
  /* 3 */ val socket: typingsSlinky.vscodeLanguageclient.mod.TransportKind.socket with Double = js.native
  
  @js.native
  sealed trait stdio extends TransportKind
  /* 0 */ val stdio: typingsSlinky.vscodeLanguageclient.mod.TransportKind.stdio with Double = js.native
}
