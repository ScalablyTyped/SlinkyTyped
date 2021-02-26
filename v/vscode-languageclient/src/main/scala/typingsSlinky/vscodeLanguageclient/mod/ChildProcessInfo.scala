package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildProcessInfo extends StObject {
  
  var detached: Boolean = js.native
  
  var process: ChildProcess = js.native
}
object ChildProcessInfo {
  
  @scala.inline
  def apply(detached: Boolean, process: ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProcessInfo]
  }
  
  @scala.inline
  implicit class ChildProcessInfoMutableBuilder[Self <: ChildProcessInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}
