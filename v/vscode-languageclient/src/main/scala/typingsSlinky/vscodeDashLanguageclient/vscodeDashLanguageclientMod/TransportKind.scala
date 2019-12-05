package typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransportKind extends Transport

@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends js.Object {
  @js.native
  sealed trait ipc extends TransportKind
  
  @js.native
  sealed trait pipe extends TransportKind
  
  @js.native
  sealed trait socket extends TransportKind
  
  @js.native
  sealed trait stdio extends TransportKind
  
  /* 1 */ val ipc: typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod.TransportKind.ipc with Double = js.native
  /* 2 */ val pipe: typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod.TransportKind.pipe with Double = js.native
  /* 3 */ val socket: typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod.TransportKind.socket with Double = js.native
  /* 0 */ val stdio: typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod.TransportKind.stdio with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportKind with Double] = js.native
}

