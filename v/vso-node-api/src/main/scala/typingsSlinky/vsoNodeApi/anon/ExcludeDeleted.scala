package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeDeleted extends js.Object {
  var excludeDeleted: scala.Double = js.native
  var includeDeleted: scala.Double = js.native
  var onlyDeleted: scala.Double = js.native
}

object ExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: scala.Double, includeDeleted: scala.Double, onlyDeleted: scala.Double): ExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeDeleted]
  }
  @scala.inline
  implicit class ExcludeDeletedOps[Self <: ExcludeDeleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeDeleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDeleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyDeleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDeleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

