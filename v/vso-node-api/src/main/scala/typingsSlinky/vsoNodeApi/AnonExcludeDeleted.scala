package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeDeleted extends js.Object {
  var excludeDeleted: Double = js.native
  var includeDeleted: Double = js.native
  var onlyDeleted: Double = js.native
}

object AnonExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: Double, includeDeleted: Double, onlyDeleted: Double): AnonExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeDeleted]
  }
  @scala.inline
  implicit class AnonExcludeDeletedOps[Self <: AnonExcludeDeleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDeleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

