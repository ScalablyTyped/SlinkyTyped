package typingsSlinky.testingLibraryReactHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderHookResult[P, R] extends js.Object {
  
  def rerender(): Unit = js.native
  def rerender(newProps: P): Unit = js.native
  
  val result: HookResult[R] = js.native
  
  def unmount(): Boolean = js.native
  
  def wait(callback: js.Function0[Boolean | Unit]): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Boolean | Unit], options: WaitOptions): js.Promise[Unit] = js.native
  
  def waitForNextUpdate(): js.Promise[Unit] = js.native
  def waitForNextUpdate(options: WaitOptions): js.Promise[Unit] = js.native
  
  def waitForValueToChange(selector: js.Function0[_]): js.Promise[Unit] = js.native
  def waitForValueToChange(selector: js.Function0[_], options: WaitOptions): js.Promise[Unit] = js.native
}
