package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  /**
    * Contribution for the page.
    */
  var contribution: WitContribution = js.native
  /**
    * The id for the layout node.
    */
  var id: String = js.native
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean = js.native
  /**
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean = js.native
  /**
    * The label for the page.
    */
  var label: String = js.native
  /**
    * A value indicating whether any user operations are permitted on this page and the contents of this page
    */
  var locked: Boolean = js.native
  /**
    * Order in which the page should appear in the layout.
    */
  var order: Double = js.native
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  /**
    * The icon for the page.
    */
  var pageType: PageType = js.native
  /**
    * The sections of the page.
    */
  var sections: js.Array[Section] = js.native
  /**
    * A value indicating if the page should be hidden or not.
    */
  var visible: Boolean = js.native
}

object Page {
  @scala.inline
  def apply(
    contribution: WitContribution,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    locked: Boolean,
    order: Double,
    overridden: Boolean,
    pageType: PageType,
    sections: js.Array[Section],
    visible: Boolean
  ): Page = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContribution(value: WitContribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsContribution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverridden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageType(value: PageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[Section]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

