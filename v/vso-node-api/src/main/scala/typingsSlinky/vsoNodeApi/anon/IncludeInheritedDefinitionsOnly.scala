package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: scala.Double = js.native
  var includeLastUserAccess: scala.Double = js.native
  var includeNonInheritedDefinitionsOnly: scala.Double = js.native
  var includeServices: scala.Double = js.native
  var none: scala.Double = js.native
}

object IncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: scala.Double,
    includeLastUserAccess: scala.Double,
    includeNonInheritedDefinitionsOnly: scala.Double,
    includeServices: scala.Double,
    none: scala.Double
  ): IncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInheritedDefinitionsOnly]
  }
  @scala.inline
  implicit class IncludeInheritedDefinitionsOnlyOps[Self <: IncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeInheritedDefinitionsOnly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInheritedDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLastUserAccess(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLastUserAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeNonInheritedDefinitionsOnly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonInheritedDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeServices(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

