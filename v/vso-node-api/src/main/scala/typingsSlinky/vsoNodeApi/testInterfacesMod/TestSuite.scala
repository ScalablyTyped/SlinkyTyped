package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  var areaUri: String = js.native
  var children: js.Array[TestSuite] = js.native
  var defaultConfigurations: js.Array[ShallowReference] = js.native
  var defaultTesters: js.Array[ShallowReference] = js.native
  var id: Double = js.native
  var inheritDefaultConfigurations: Boolean = js.native
  var lastError: String = js.native
  var lastPopulatedDate: js.Date = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: js.Date = js.native
  var name: String = js.native
  var parent: ShallowReference = js.native
  var plan: ShallowReference = js.native
  var project: ShallowReference = js.native
  var queryString: String = js.native
  var requirementId: Double = js.native
  var revision: Double = js.native
  var state: String = js.native
  var suiteType: String = js.native
  var suites: js.Array[ShallowReference] = js.native
  var testCaseCount: Double = js.native
  var testCasesUrl: String = js.native
  var text: String = js.native
  var url: String = js.native
}

object TestSuite {
  @scala.inline
  def apply(
    areaUri: String,
    children: js.Array[TestSuite],
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    id: Double,
    inheritDefaultConfigurations: Boolean,
    lastError: String,
    lastPopulatedDate: js.Date,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    name: String,
    parent: ShallowReference,
    plan: ShallowReference,
    project: ShallowReference,
    queryString: String,
    requirementId: Double,
    revision: Double,
    state: String,
    suiteType: String,
    suites: js.Array[ShallowReference],
    testCaseCount: Double,
    testCasesUrl: String,
    text: String,
    url: String
  ): TestSuite = {
    val __obj = js.Dynamic.literal(areaUri = areaUri.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], defaultConfigurations = defaultConfigurations.asInstanceOf[js.Any], defaultTesters = defaultTesters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritDefaultConfigurations = inheritDefaultConfigurations.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], lastPopulatedDate = lastPopulatedDate.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requirementId = requirementId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suiteType = suiteType.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], testCaseCount = testCaseCount.asInstanceOf[js.Any], testCasesUrl = testCasesUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuite]
  }
  @scala.inline
  implicit class TestSuiteOps[Self <: TestSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TestSuite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritDefaultConfigurations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDefaultConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPopulatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPopulatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
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
    def withPlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirementId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuiteType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuites(value: js.Array[ShallowReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCasesUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCasesUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

