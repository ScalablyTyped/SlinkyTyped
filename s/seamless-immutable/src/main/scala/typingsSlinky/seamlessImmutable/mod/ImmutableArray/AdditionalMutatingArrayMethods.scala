package typingsSlinky.seamlessImmutable.mod.ImmutableArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
/* Inlined std.Extract<std.Array<keyof any>, 'copyWithin' | 'fill'> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seamlessImmutable.seamlessImmutableStrings.fill
  - typingsSlinky.seamlessImmutable.seamlessImmutableStrings.copyWithin
*/
trait AdditionalMutatingArrayMethods extends js.Object

object AdditionalMutatingArrayMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copyWithin: typingsSlinky.seamlessImmutable.seamlessImmutableStrings.copyWithin = this.cast("copyWithin")
  @scala.inline
  def fill: typingsSlinky.seamlessImmutable.seamlessImmutableStrings.fill = this.cast("fill")
}

