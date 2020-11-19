package typingsSlinky.sdkBase.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends EventEmitter {
  
  def await(args: js.Any*): js.Promise[_] = js.native
  
  def awaitFirst(args: js.Any*): js.Promise[_] = js.native
  
  var isReady: Boolean = js.native
  
  var options: BaseOptions = js.native
  
  def ready(): js.Promise[_] = js.native
  def ready(err: js.Error): Unit = js.native
  def ready(readyCallback: js.Function): Unit = js.native
  def ready(ready: Boolean): Unit = js.native
}
