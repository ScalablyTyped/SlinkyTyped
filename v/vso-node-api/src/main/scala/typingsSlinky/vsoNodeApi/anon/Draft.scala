package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draft extends js.Object {
  var abandoned: scala.Double = js.native
  var active: scala.Double = js.native
  var draft: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object Draft {
  @scala.inline
  def apply(abandoned: scala.Double, active: scala.Double, draft: scala.Double, undefined: scala.Double): Draft = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
  @scala.inline
  implicit class DraftOps[Self <: Draft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandoned(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandoned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraft(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

