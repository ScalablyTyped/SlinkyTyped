package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: Double = js.native
  var includeLastUserAccess: Double = js.native
  var includeNonInheritedDefinitionsOnly: Double = js.native
  var includeServices: Double = js.native
  var none: Double = js.native
}

object AnonIncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: Double,
    includeLastUserAccess: Double,
    includeNonInheritedDefinitionsOnly: Double,
    includeServices: Double,
    none: Double
  ): AnonIncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeInheritedDefinitionsOnly]
  }
  @scala.inline
  implicit class AnonIncludeInheritedDefinitionsOnlyOps[Self <: AnonIncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeInheritedDefinitionsOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInheritedDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLastUserAccess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLastUserAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeNonInheritedDefinitionsOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonInheritedDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeServices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

