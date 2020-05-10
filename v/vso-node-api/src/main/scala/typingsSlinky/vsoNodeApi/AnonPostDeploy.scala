package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostDeploy extends js.Object {
  var all: Double = js.native
  var postDeploy: Double = js.native
  var preDeploy: Double = js.native
  var undefined: Double = js.native
}

object AnonPostDeploy {
  @scala.inline
  def apply(all: Double, postDeploy: Double, preDeploy: Double, undefined: Double): AnonPostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostDeploy]
  }
  @scala.inline
  implicit class AnonPostDeployOps[Self <: AnonPostDeploy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeploy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeploy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

