package typingsSlinky.when.global.When

import typingsSlinky.when.When.Promise
import typingsSlinky.when.When.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("When")
@js.native
object ^ extends js.Object {
  
  def apply(): Promise[Unit] = js.native
  def apply[T](promiseOrValue: T): Promise[T] = js.native
  def apply[T](promiseOrValue: Promise[T]): Promise[T] = js.native
  def apply[T](promiseOrValue: Thenable[T]): Promise[T] = js.native
  def apply[T, U](promiseOrValue: T, transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
  def apply[T, U](promiseOrValue: Promise[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
  def apply[T, U](promiseOrValue: Thenable[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
}
