package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  bubbles  :boolean,   composed  :boolean,   capturePhase  :boolean}> */
@js.native
trait Partialbubblesbooleancomp extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.native
  var capturePhase: js.UndefOr[Boolean] = js.native
  var composed: js.UndefOr[Boolean] = js.native
}

object Partialbubblesbooleancomp {
  @scala.inline
  def apply(): Partialbubblesbooleancomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialbubblesbooleancomp]
  }
  @scala.inline
  implicit class PartialbubblesbooleancompOps[Self <: Partialbubblesbooleancomp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCapturePhase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturePhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapturePhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturePhase")(js.undefined)
        ret
    }
    @scala.inline
    def withComposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(js.undefined)
        ret
    }
  }
  
}

