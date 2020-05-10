package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn extends js.Object {
  var column: String = js.native
  var condition: String = js.native
  var relation: String = js.native
}

object AnonColumn {
  @scala.inline
  def apply(column: String, condition: String, relation: String): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
  @scala.inline
  implicit class AnonColumnOps[Self <: AnonColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

