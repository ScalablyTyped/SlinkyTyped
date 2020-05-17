package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeLanguageclient.anon.Debug
import typingsSlinky.vscodeLanguageclient.anon.Run
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageclient.mod.Executable
  - typingsSlinky.vscodeLanguageclient.anon.Debug
  - typingsSlinky.vscodeLanguageclient.anon.Run
  - typingsSlinky.vscodeLanguageclient.mod.NodeModule
  - js.Function0[
typingsSlinky.vscodeJsonrpc.Thenable[
  typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
]]
*/
trait ServerOptions extends js.Object

object ServerOptions {
  @scala.inline
  implicit def apply(value: Debug): ServerOptions = value.asInstanceOf[ServerOptions]
  @scala.inline
  implicit def apply(value: Executable): ServerOptions = value.asInstanceOf[ServerOptions]
  @scala.inline
  implicit def apply(
    value: js.Function0[
      Thenable[
        ChildProcess | StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | ChildProcessInfo
      ]
    ]
  ): ServerOptions = value.asInstanceOf[ServerOptions]
  @scala.inline
  implicit def apply(value: NodeModule): ServerOptions = value.asInstanceOf[ServerOptions]
  @scala.inline
  implicit def apply(value: Run): ServerOptions = value.asInstanceOf[ServerOptions]
}

