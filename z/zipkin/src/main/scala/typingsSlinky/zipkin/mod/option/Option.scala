package typingsSlinky.zipkin.mod.option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "option.Option")
@js.native
abstract class Option[T] () extends js.Object {
  def equals(other: IOption[T]): Boolean = js.native
  def flatMap[V](fn: js.Function1[/* value */ T, IOption[V]]): IOption[V] = js.native
  def getOrElse(fnOrValue: T): T = js.native
  def getOrElse(fnOrValue: js.Function0[T]): T = js.native
  def ifPresent(fn: js.Function1[/* value */ T, _]): Unit = js.native
  def map[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
}

