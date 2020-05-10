package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteCreateModel extends js.Object {
  var name: String = js.native
  var queryString: String = js.native
  var requirementIds: js.Array[Double] = js.native
  var suiteType: String = js.native
}

object SuiteCreateModel {
  @scala.inline
  def apply(name: String, queryString: String, requirementIds: js.Array[Double], suiteType: String): SuiteCreateModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requirementIds = requirementIds.asInstanceOf[js.Any], suiteType = suiteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteCreateModel]
  }
  @scala.inline
  implicit class SuiteCreateModelOps[Self <: SuiteCreateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirementIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirementIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuiteType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

