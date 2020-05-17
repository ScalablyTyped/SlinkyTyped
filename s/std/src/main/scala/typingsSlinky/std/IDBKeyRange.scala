package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs: */
@js.native
trait IDBKeyRange extends js.Object {
  /**
    * Returns lower bound, or undefined if none.
    */
  val lower: js.Any = js.native
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  val lowerOpen: scala.Boolean = js.native
  /**
    * Returns upper bound, or undefined if none.
    */
  val upper: js.Any = js.native
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  val upperOpen: scala.Boolean = js.native
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  def includes(key: js.Any): scala.Boolean = js.native
}

object IDBKeyRange {
  @scala.inline
  def apply(
    includes: js.Any => scala.Boolean,
    lower: js.Any,
    lowerOpen: scala.Boolean,
    upper: js.Any,
    upperOpen: scala.Boolean
  ): IDBKeyRange = {
    val __obj = js.Dynamic.literal(includes = js.Any.fromFunction1(includes), lower = lower.asInstanceOf[js.Any], lowerOpen = lowerOpen.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
  @scala.inline
  implicit class IDBKeyRangeOps[Self <: org.scalajs.dom.raw.IDBKeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludes(value: js.Any => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLower(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowerOpen(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperOpen(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperOpen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

