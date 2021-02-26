package typingsSlinky.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ServerOptions extends StObject
object _ServerOptions {
  
  @scala.inline
  def Debug(debug: Executable, run: Executable): typingsSlinky.vscodeLanguageclient.anon.Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageclient.anon.Debug]
  }
  
  @scala.inline
  def Executable(command: String): typingsSlinky.vscodeLanguageclient.mod.Executable = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageclient.mod.Executable]
  }
  
  @scala.inline
  def NodeModule(module: String): typingsSlinky.vscodeLanguageclient.mod.NodeModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageclient.mod.NodeModule]
  }
  
  @scala.inline
  def Run(debug: NodeModule, run: NodeModule): typingsSlinky.vscodeLanguageclient.anon.Run = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vscodeLanguageclient.anon.Run]
  }
}
