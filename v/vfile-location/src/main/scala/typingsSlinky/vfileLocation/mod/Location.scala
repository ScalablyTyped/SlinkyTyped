package typingsSlinky.vfileLocation.mod

import typingsSlinky.vfileLocation.AnonColumn
import typingsSlinky.vfileLocation.AnonLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
    * Returns `-1` when given invalid or out of bounds input.
    */
  def toOffset(position: AnonColumn): Double = js.native
  /**
    * Get the line and column-based `position` for `offset` in the bound file.
    */
  def toPosition(offset: Double): AnonLine = js.native
}

object Location {
  @scala.inline
  def apply(toOffset: AnonColumn => Double, toPosition: Double => AnonLine): Location = {
    val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToOffset(value: AnonColumn => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToPosition(value: Double => AnonLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPosition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

