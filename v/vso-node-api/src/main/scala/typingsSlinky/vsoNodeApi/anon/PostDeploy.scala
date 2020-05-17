package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostDeploy extends js.Object {
  var all: scala.Double = js.native
  var postDeploy: scala.Double = js.native
  var preDeploy: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object PostDeploy {
  @scala.inline
  def apply(all: scala.Double, postDeploy: scala.Double, preDeploy: scala.Double, undefined: scala.Double): PostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDeploy]
  }
  @scala.inline
  implicit class PostDeployOps[Self <: PostDeploy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeploy(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeploy(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeploy")(value.asInstanceOf[js.Any])
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

