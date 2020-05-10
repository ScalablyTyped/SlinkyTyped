package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParse extends js.Object {
  var State: js.Any = js.native
  var parse: js.Any = js.native
  var ruler: AnonAfter = js.native
  var tokenize: js.Any = js.native
}

object AnonParse {
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: AnonAfter, tokenize: js.Any): AnonParse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParse]
  }
  @scala.inline
  implicit class AnonParseOps[Self <: AnonParse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler(value: AnonAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

