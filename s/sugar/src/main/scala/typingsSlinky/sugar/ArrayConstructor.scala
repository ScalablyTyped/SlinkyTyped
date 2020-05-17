package typingsSlinky.sugar

import typingsSlinky.std.ArrayLike
import typingsSlinky.sugar.sugarjs.NativeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor extends NativeConstructor {
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): Array[T] = js.native
  def create[T](): Array[T] = js.native
  def create[T](obj: Double): Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): Array[T] = js.native
  def create[T](obj: ArrayLike[T]): Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): Array[T] = js.native
}

