package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionUndeleteParameter extends js.Object {
  /**
    * Gets or sets comment.
    */
  var comment: String = js.native
}

object ReleaseDefinitionUndeleteParameter {
  @scala.inline
  def apply(comment: String): ReleaseDefinitionUndeleteParameter = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionUndeleteParameter]
  }
  @scala.inline
  implicit class ReleaseDefinitionUndeleteParameterOps[Self <: ReleaseDefinitionUndeleteParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

