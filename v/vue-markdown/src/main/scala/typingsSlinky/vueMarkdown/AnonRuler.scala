package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRuler extends js.Object {
  var State: js.Any = js.native
  var parse: js.Any = js.native
  var ruler: AnonAfter = js.native
  var ruler2: AnonAfter = js.native
  var skipToken: js.Any = js.native
  var tokenize: js.Any = js.native
}

object AnonRuler {
  @scala.inline
  def apply(
    State: js.Any,
    parse: js.Any,
    ruler: AnonAfter,
    ruler2: AnonAfter,
    skipToken: js.Any,
    tokenize: js.Any
  ): AnonRuler = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = skipToken.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRuler]
  }
  @scala.inline
  implicit class AnonRulerOps[Self <: AnonRuler] (val x: Self) extends AnyVal {
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
    def withRuler2(value: AnonAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipToken")(value.asInstanceOf[js.Any])
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

