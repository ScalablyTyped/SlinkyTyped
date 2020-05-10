package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointsFilter extends js.Object {
  var configurationNames: js.Array[String] = js.native
  var testcaseIds: js.Array[Double] = js.native
  var testers: js.Array[IdentityRef] = js.native
}

object PointsFilter {
  @scala.inline
  def apply(
    configurationNames: js.Array[String],
    testcaseIds: js.Array[Double],
    testers: js.Array[IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal(configurationNames = configurationNames.asInstanceOf[js.Any], testcaseIds = testcaseIds.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsFilter]
  }
  @scala.inline
  implicit class PointsFilterOps[Self <: PointsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestcaseIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testcaseIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTesters(value: js.Array[IdentityRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

