package typingsSlinky.useMemoOne

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-memo-one", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useCallbackOne[T /* <: js.Function1[/* repeated */ js.Any, _] */](// getResult changes on every call,
  callback: T): T = js.native
  def useCallbackOne[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    // getResult changes on every call,
  callback: T,
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = js.native
  
  def useMemoOne[T](// getResult changes on every call,
  getResult: js.Function0[T]): T = js.native
  def useMemoOne[T](
    // getResult changes on every call,
  getResult: js.Function0[T],
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = js.native
  
  type DependencyList = js.Array[js.Any]
}
