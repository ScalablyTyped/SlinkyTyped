package typingsSlinky.stickyCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStickyclusterworkerindex extends js.Object {
  var stickycluster_worker_index: Double = js.native
}

object AnonStickyclusterworkerindex {
  @scala.inline
  def apply(stickycluster_worker_index: Double): AnonStickyclusterworkerindex = {
    val __obj = js.Dynamic.literal(stickycluster_worker_index = stickycluster_worker_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStickyclusterworkerindex]
  }
  @scala.inline
  implicit class AnonStickyclusterworkerindexOps[Self <: AnonStickyclusterworkerindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStickycluster_worker_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickycluster_worker_index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

