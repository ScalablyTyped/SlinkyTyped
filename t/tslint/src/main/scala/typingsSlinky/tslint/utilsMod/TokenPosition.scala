package typingsSlinky.tslint.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenPosition extends js.Object {
  /** The end of the token */
  var end: Double = js.native
  /** The start of the token including all trivia before it */
  var fullStart: Double = js.native
  /** The start of the token */
  var tokenStart: Double = js.native
}

object TokenPosition {
  @scala.inline
  def apply(end: Double, fullStart: Double, tokenStart: Double): TokenPosition = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fullStart = fullStart.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPosition]
  }
  @scala.inline
  implicit class TokenPositionOps[Self <: TokenPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

