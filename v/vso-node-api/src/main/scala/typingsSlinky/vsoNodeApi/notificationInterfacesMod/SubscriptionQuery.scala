package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionQuery extends js.Object {
  /**
    * One or more conditions to query on. If more than 2 conditions are specified, the combined results of each condition is returned (i.e. conditions are logically OR'ed).
    */
  var conditions: js.Array[SubscriptionQueryCondition] = js.native
  /**
    * Flags the refine the types of subscriptions that will be returned from the query.
    */
  var queryFlags: SubscriptionQueryFlags = js.native
}

object SubscriptionQuery {
  @scala.inline
  def apply(conditions: js.Array[SubscriptionQueryCondition], queryFlags: SubscriptionQueryFlags): SubscriptionQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], queryFlags = queryFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionQuery]
  }
  @scala.inline
  implicit class SubscriptionQueryOps[Self <: SubscriptionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[SubscriptionQueryCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryFlags(value: SubscriptionQueryFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

