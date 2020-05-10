package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDataProviderQuery extends DataProviderQuery {
  /**
    * The Id of the service instance type that should be communicated with in order to resolve the data providers from the client given the query values.
    */
  var queryServiceInstanceType: String = js.native
}

object ClientDataProviderQuery {
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String], queryServiceInstanceType: String): ClientDataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any], queryServiceInstanceType = queryServiceInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDataProviderQuery]
  }
  @scala.inline
  implicit class ClientDataProviderQueryOps[Self <: ClientDataProviderQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryServiceInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryServiceInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

