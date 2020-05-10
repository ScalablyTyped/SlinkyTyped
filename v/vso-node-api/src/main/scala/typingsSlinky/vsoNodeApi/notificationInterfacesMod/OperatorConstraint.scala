package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatorConstraint extends js.Object {
  var operator: String = js.native
  /**
    * Gets or sets the list of scopes that this type supports.
    */
  var supportedScopes: js.Array[String] = js.native
}

object OperatorConstraint {
  @scala.inline
  def apply(operator: String, supportedScopes: js.Array[String]): OperatorConstraint = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorConstraint]
  }
  @scala.inline
  implicit class OperatorConstraintOps[Self <: OperatorConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedScopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

