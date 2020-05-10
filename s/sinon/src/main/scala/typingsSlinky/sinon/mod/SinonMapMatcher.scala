package typingsSlinky.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonMapMatcher extends SinonMatcher {
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: SimplifiedMap): SinonMatcher = js.native
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedMap): SinonMatcher = js.native
}

object SinonMapMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: SimplifiedMap => SinonMatcher,
    deepEquals: SimplifiedMap => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    test: js.Any => Boolean
  ): SinonMapMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonMapMatcher]
  }
  @scala.inline
  implicit class SinonMapMatcherOps[Self <: SinonMapMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: SimplifiedMap => SinonMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeepEquals(value: SimplifiedMap => SinonMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepEquals")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

