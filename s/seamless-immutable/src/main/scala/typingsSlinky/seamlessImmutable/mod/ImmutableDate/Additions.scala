package typingsSlinky.seamlessImmutable.mod.ImmutableDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New functions added by seamless-immutable. */
trait Additions extends js.Object {
  def asMutable(): js.Date
}

object Additions {
  @scala.inline
  def apply(asMutable: () => js.Date): Additions = {
    val __obj = js.Dynamic.literal(asMutable = js.Any.fromFunction0(asMutable))
    __obj.asInstanceOf[Additions]
  }
}

