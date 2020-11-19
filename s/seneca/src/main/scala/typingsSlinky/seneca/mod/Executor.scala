package typingsSlinky.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executor extends js.Object {
  
  def cb(err: js.Error, result: js.Any): Unit = js.native
  @JSName("cb")
  var cb_Original: ExecutorCallback = js.native
  
  var desc: String = js.native
  
  var execute: UnknownType = js.native
  
  def fn(callback: js.Any): Unit = js.native
  @JSName("fn")
  var fn_Original: ExecutorWorker = js.native
  
  var gate: Boolean = js.native
  
  var id: String = js.native
  
  var ungate: Boolean = js.native
}
