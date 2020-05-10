package typingsSlinky.vsoNodeApi.featureManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributedFeatureValueRule extends js.Object {
  /**
    * Name of the IContributedFeatureValuePlugin to run
    */
  var name: String = js.native
  /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
  var properties: StringDictionary[js.Any] = js.native
}

object ContributedFeatureValueRule {
  @scala.inline
  def apply(name: String, properties: StringDictionary[js.Any]): ContributedFeatureValueRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeatureValueRule]
  }
  @scala.inline
  implicit class ContributedFeatureValueRuleOps[Self <: ContributedFeatureValueRule] (val x: Self) extends AnyVal {
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
    def withProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

