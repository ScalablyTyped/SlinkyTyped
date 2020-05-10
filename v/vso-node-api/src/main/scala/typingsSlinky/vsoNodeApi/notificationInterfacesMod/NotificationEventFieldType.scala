package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventFieldType extends js.Object {
  /**
    * Gets or sets the unique identifier of this field type.
    */
  var id: String = js.native
  var operatorConstraints: js.Array[OperatorConstraint] = js.native
  /**
    * Gets or sets the list of operators that this type supports.
    */
  var operators: js.Array[NotificationEventFieldOperator] = js.native
  var subscriptionFieldType: SubscriptionFieldType = js.native
  /**
    * Gets or sets the value definition of this field like the getValuesMethod and template to display in the UI
    */
  var value: ValueDefinition = js.native
}

object NotificationEventFieldType {
  @scala.inline
  def apply(
    id: String,
    operatorConstraints: js.Array[OperatorConstraint],
    operators: js.Array[NotificationEventFieldOperator],
    subscriptionFieldType: SubscriptionFieldType,
    value: ValueDefinition
  ): NotificationEventFieldType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], operatorConstraints = operatorConstraints.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], subscriptionFieldType = subscriptionFieldType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventFieldType]
  }
  @scala.inline
  implicit class NotificationEventFieldTypeOps[Self <: NotificationEventFieldType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorConstraints(value: js.Array[OperatorConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperators(value: js.Array[NotificationEventFieldOperator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionFieldType(value: SubscriptionFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionFieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ValueDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

