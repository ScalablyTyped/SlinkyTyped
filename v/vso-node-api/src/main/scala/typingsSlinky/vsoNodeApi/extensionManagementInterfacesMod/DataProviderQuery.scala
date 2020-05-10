package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderQuery extends js.Object {
  /**
    * Contextual information to pass to the data providers
    */
  var context: DataProviderContext = js.native
  /**
    * The contribution ids of the data providers to resolve
    */
  var contributionIds: js.Array[String] = js.native
}

object DataProviderQuery {
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderQuery]
  }
  @scala.inline
  implicit class DataProviderQueryOps[Self <: DataProviderQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: DataProviderContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

