package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscodeLanguageclient.mod.Executable
    - typingsSlinky.vscodeLanguageclient.AnonDebug
    - typingsSlinky.vscodeLanguageclient.AnonRun
    - typingsSlinky.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  typingsSlinky.vscodeJsonrpc.Thenable[
    typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typingsSlinky.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    typingsSlinky.vscodeJsonrpc.Thenable[
      typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
}
