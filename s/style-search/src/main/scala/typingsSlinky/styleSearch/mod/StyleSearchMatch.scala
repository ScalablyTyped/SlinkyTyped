package typingsSlinky.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSearchMatch extends js.Object {
  /** where the match ends */
  val endIndex: Double = js.native
  /** whether the match is inside a comment */
  val insideComment: Boolean = js.native
  /** whether the match is inside a function — this includes the parentheses around the arguments */
  val insideFunctionArguments: Boolean = js.native
  /** whether the match is inside a string */
  val insideString: Boolean = js.native
  /** where the match begins */
  val startIndex: Double = js.native
  /** what got matched (useful if your target option is an array instead of a single string) */
  val target: String = js.native
}

object StyleSearchMatch {
  @scala.inline
  def apply(
    endIndex: Double,
    insideComment: Boolean,
    insideFunctionArguments: Boolean,
    insideString: Boolean,
    startIndex: Double,
    target: String
  ): StyleSearchMatch = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], insideComment = insideComment.asInstanceOf[js.Any], insideFunctionArguments = insideFunctionArguments.asInstanceOf[js.Any], insideString = insideString.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSearchMatch]
  }
  @scala.inline
  implicit class StyleSearchMatchOps[Self <: StyleSearchMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideFunctionArguments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideFunctionArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

