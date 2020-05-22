package typingsSlinky.wonka.jsShimMod

import typingsSlinky.wonka.wonkaNumbers.`0`
import typingsSlinky.wonka.wonkaNumbers.`1`
import typingsSlinky.wonka.wonkaNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbag[I, O] extends js.Object {
  def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
  def apply(t: `1`, d: I): Unit = js.native
  def apply(t: `2`): Unit = js.native
  def apply(t: `2`, d: js.Any): Unit = js.native
}

