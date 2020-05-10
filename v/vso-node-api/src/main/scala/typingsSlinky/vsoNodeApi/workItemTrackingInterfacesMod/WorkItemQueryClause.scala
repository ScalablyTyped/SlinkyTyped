package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemQueryClause extends js.Object {
  /**
    * Child clauses if the current clause is a logical operator
    */
  var clauses: js.Array[WorkItemQueryClause] = js.native
  /**
    * Field associated with condition
    */
  var field: WorkItemFieldReference = js.native
  /**
    * Right side of the condition when a field to field comparison
    */
  var fieldValue: WorkItemFieldReference = js.native
  /**
    * Determines if this is a field to field comparison
    */
  var isFieldValue: Boolean = js.native
  /**
    * Logical operator separating the condition clause
    */
  var logicalOperator: LogicalOperation = js.native
  /**
    * The field operator
    */
  var operator: WorkItemFieldOperation = js.native
  /**
    * Right side of the condition when a field to value comparison
    */
  var value: String = js.native
}

object WorkItemQueryClause {
  @scala.inline
  def apply(
    clauses: js.Array[WorkItemQueryClause],
    field: WorkItemFieldReference,
    fieldValue: WorkItemFieldReference,
    isFieldValue: Boolean,
    logicalOperator: LogicalOperation,
    operator: WorkItemFieldOperation,
    value: String
  ): WorkItemQueryClause = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], isFieldValue = isFieldValue.asInstanceOf[js.Any], logicalOperator = logicalOperator.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQueryClause]
  }
  @scala.inline
  implicit class WorkItemQueryClauseOps[Self <: WorkItemQueryClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClauses(value: js.Array[WorkItemQueryClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: WorkItemFieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldValue(value: WorkItemFieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFieldValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalOperator(value: LogicalOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: WorkItemFieldOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

