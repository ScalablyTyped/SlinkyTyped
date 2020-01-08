package typingsSlinky.strange.strangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.strange.strangeStrings.LeftparenthesisRightparenthesis
  - typings.strange.strangeStrings.`[]`
  - typings.strange.strangeStrings.`[Rightparenthesis`
  - typings.strange.strangeStrings.`Leftparenthesis]`
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  def LeftparenthesisRightparenthesis: typingsSlinky.strange.strangeStrings.LeftparenthesisRightparenthesis = this.cast("()")
  @scala.inline
  def `Leftparenthesis]`: typingsSlinky.strange.strangeStrings.`Leftparenthesis]` = this.cast("(]")
  @scala.inline
  def `[Rightparenthesis`: typingsSlinky.strange.strangeStrings.`[Rightparenthesis` = this.cast("[)")
  @scala.inline
  def `[]`: typingsSlinky.strange.strangeStrings.`[]` = this.cast("[]")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

