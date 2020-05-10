package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteUpdateModel extends js.Object {
  var defaultConfigurations: js.Array[ShallowReference] = js.native
  var defaultTesters: js.Array[ShallowReference] = js.native
  var inheritDefaultConfigurations: Boolean = js.native
  var name: String = js.native
  var parent: ShallowReference = js.native
  var queryString: String = js.native
}

object SuiteUpdateModel {
  @scala.inline
  def apply(
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    inheritDefaultConfigurations: Boolean,
    name: String,
    parent: ShallowReference,
    queryString: String
  ): SuiteUpdateModel = {
    val __obj = js.Dynamic.literal(defaultConfigurations = defaultConfigurations.asInstanceOf[js.Any], defaultTesters = defaultTesters.asInstanceOf[js.Any], inheritDefaultConfigurations = inheritDefaultConfigurations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteUpdateModel]
  }
  @scala.inline
  implicit class SuiteUpdateModelOps[Self <: SuiteUpdateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultConfigurations(value: js.Array[ShallowReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTesters(value: js.Array[ShallowReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTesters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritDefaultConfigurations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDefaultConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

