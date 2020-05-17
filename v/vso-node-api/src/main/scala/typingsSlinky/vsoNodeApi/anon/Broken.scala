package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broken extends js.Object {
  var approved: scala.Double = js.native
  var broken: scala.Double = js.native
  var notApplicable: scala.Double = js.native
  var queued: scala.Double = js.native
  var rejected: scala.Double = js.native
  var running: scala.Double = js.native
}

object Broken {
  @scala.inline
  def apply(
    approved: scala.Double,
    broken: scala.Double,
    notApplicable: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    running: scala.Double
  ): Broken = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broken]
  }
  @scala.inline
  implicit class BrokenOps[Self <: Broken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroken(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotApplicable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

