package typingsSlinky.winkPosTagger

import typingsSlinky.winkPosTagger.winkPosTaggerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLemma extends js.Object {
  var lemma: `true` = js.native
  var normal: `true` = js.native
}

object AnonLemma {
  @scala.inline
  def apply(lemma: `true`, normal: `true`): AnonLemma = {
    val __obj = js.Dynamic.literal(lemma = lemma.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLemma]
  }
  @scala.inline
  implicit class AnonLemmaOps[Self <: AnonLemma] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLemma(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

