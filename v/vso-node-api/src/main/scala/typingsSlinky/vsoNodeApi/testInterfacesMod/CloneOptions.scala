package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneOptions extends js.Object {
  /**
    * If set to true requirements will be cloned
    */
  var cloneRequirements: Boolean = js.native
  /**
    * copy all suites from a source plan
    */
  var copyAllSuites: Boolean = js.native
  /**
    * copy ancestor hieracrchy
    */
  var copyAncestorHierarchy: Boolean = js.native
  /**
    * Name of the workitem type of the clone
    */
  var destinationWorkItemType: String = js.native
  /**
    * Key value pairs where the key value is overridden by the value.
    */
  var overrideParameters: StringDictionary[String] = js.native
  /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
  var relatedLinkComment: String = js.native
}

object CloneOptions {
  @scala.inline
  def apply(
    cloneRequirements: Boolean,
    copyAllSuites: Boolean,
    copyAncestorHierarchy: Boolean,
    destinationWorkItemType: String,
    overrideParameters: StringDictionary[String],
    relatedLinkComment: String
  ): CloneOptions = {
    val __obj = js.Dynamic.literal(cloneRequirements = cloneRequirements.asInstanceOf[js.Any], copyAllSuites = copyAllSuites.asInstanceOf[js.Any], copyAncestorHierarchy = copyAncestorHierarchy.asInstanceOf[js.Any], destinationWorkItemType = destinationWorkItemType.asInstanceOf[js.Any], overrideParameters = overrideParameters.asInstanceOf[js.Any], relatedLinkComment = relatedLinkComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOptions]
  }
  @scala.inline
  implicit class CloneOptionsOps[Self <: CloneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneRequirements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyAllSuites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAllSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyAncestorHierarchy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAncestorHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationWorkItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationWorkItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedLinkComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedLinkComment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

