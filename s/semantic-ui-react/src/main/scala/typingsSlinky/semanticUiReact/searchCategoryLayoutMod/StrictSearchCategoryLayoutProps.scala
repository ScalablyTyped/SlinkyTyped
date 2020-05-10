package typingsSlinky.semanticUiReact.searchCategoryLayoutMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictSearchCategoryLayoutProps extends js.Object {
  /** The rendered category content */
  var categoryContent: ReactElement = js.native
  /** The rendered results content */
  var resultsContent: ReactElement = js.native
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
    def withCategoryContent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsContent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

