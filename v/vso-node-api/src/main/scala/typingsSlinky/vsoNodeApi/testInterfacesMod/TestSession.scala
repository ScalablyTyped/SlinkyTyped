package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSession extends js.Object {
  /**
    * Area path of the test session
    */
  var area: ShallowReference = js.native
  /**
    * Comments in the test session
    */
  var comment: String = js.native
  /**
    * Duration of the session
    */
  var endDate: js.Date = js.native
  /**
    * Id of the test session
    */
  var id: Double = js.native
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef = js.native
  /**
    * Last updated date
    */
  var lastUpdatedDate: js.Date = js.native
  /**
    * Owner of the test session
    */
  var owner: IdentityRef = js.native
  /**
    * Project to which the test session belongs
    */
  var project: ShallowReference = js.native
  /**
    * Generic store for test session data
    */
  var propertyBag: PropertyBag = js.native
  /**
    * Revision of the test session
    */
  var revision: Double = js.native
  /**
    * Source of the test session
    */
  var source: TestSessionSource = js.native
  /**
    * Start date
    */
  var startDate: js.Date = js.native
  /**
    * State of the test session
    */
  var state: TestSessionState = js.native
  /**
    * Title of the test session
    */
  var title: String = js.native
  /**
    * Url of Test Session Resource
    */
  var url: String = js.native
}

object TestSession {
  @scala.inline
  def apply(
    area: ShallowReference,
    comment: String,
    endDate: js.Date,
    id: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    owner: IdentityRef,
    project: ShallowReference,
    propertyBag: PropertyBag,
    revision: Double,
    source: TestSessionSource,
    startDate: js.Date,
    state: TestSessionState,
    title: String,
    url: String
  ): TestSession = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], propertyBag = propertyBag.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSession]
  }
  @scala.inline
  implicit class TestSessionOps[Self <: TestSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyBag(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyBag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: TestSessionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TestSessionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
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

