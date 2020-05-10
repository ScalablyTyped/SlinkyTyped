package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustom extends js.Object {
  var custom: Double = js.native
  var latestOnBuild: Double = js.native
  var latestOnQueue: Double = js.native
}

object AnonCustom {
  @scala.inline
  def apply(custom: Double, latestOnBuild: Double, latestOnQueue: Double): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
  @scala.inline
  implicit class AnonCustomOps[Self <: AnonCustom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestOnBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestOnBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestOnQueue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestOnQueue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

