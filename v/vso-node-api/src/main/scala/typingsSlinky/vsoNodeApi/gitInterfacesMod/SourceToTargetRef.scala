package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceToTargetRef extends js.Object {
  /**
    * The source ref to copy. For example, refs/heads/master.
    */
  var sourceRef: String = js.native
  /**
    * The target ref to update. For example, refs/heads/master.
    */
  var targetRef: String = js.native
}

object SourceToTargetRef {
  @scala.inline
  def apply(sourceRef: String, targetRef: String): SourceToTargetRef = {
    val __obj = js.Dynamic.literal(sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceToTargetRef]
  }
  @scala.inline
  implicit class SourceToTargetRefOps[Self <: SourceToTargetRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

