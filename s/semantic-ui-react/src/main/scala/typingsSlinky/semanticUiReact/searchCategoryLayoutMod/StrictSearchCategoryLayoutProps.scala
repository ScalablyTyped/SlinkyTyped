package typingsSlinky.semanticUiReact.searchCategoryLayoutMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryLayoutProps extends js.Object {
  /** The rendered category content */
  var categoryContent: ReactElement
  /** The rendered results content */
  var resultsContent: ReactElement
}

object StrictSearchCategoryLayoutProps {
  @scala.inline
  def apply(categoryContent: ReactElement, resultsContent: ReactElement): StrictSearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
  }
  @scala.inline
  implicit class StrictSearchCategoryLayoutPropsOps[Self <: StrictSearchCategoryLayoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoryContent(value: ReactElement): Self = this.set("categoryContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsContent(value: ReactElement): Self = this.set("resultsContent", value.asInstanceOf[js.Any])
  }
  
}

