package typingsSlinky.zenPush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushStream[T] extends js.Object {
  
  def complete(): Unit = js.native
  def complete(x: js.Any): Unit = js.native
  
  def error(e: js.Error): Unit = js.native
  
  def next(x: T): Unit = js.native
  
  val observable: typingsSlinky.zenObservable.mod.^[T] = js.native
  
  val observed: Double = js.native
}
