package typingsSlinky.tcomb.mod

import typingsSlinky.tcomb.anon.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T]
  extends js.Function
     with Constructor[T] {
  var displayName: java.lang.String = js.native
  @JSName("is")
  var is_Original: TypeGuardPredicate[T] = js.native
  var meta: Identity = js.native
  var t: T = js.native
  def apply(value: T): T = js.native
  def is(x: js.Any): /* is T */ scala.Boolean = js.native
}

