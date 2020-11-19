package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscodeLanguageclient.mod.Executable
    - typingsSlinky.vscodeLanguageclient.anon.Debug
    - typingsSlinky.vscodeLanguageclient.anon.Run
    - typingsSlinky.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  js.Promise[
    typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typingsSlinky.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    js.Promise[
      typingsSlinky.node.childProcessMod.ChildProcess | typingsSlinky.vscodeLanguageclient.mod.StreamInfo | typingsSlinky.vscodeLanguageclient.clientMod.MessageTransports | typingsSlinky.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
}
