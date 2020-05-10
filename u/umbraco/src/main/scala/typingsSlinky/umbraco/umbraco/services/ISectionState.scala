package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Section State
  */
@js.native
trait ISectionState extends js.Object {
  //The currently active section
  var currentSection: js.Any = js.native
  var showSearchResults: Boolean = js.native
}

object ISectionState {
  @scala.inline
  def apply(currentSection: js.Any, showSearchResults: Boolean): ISectionState = {
    val __obj = js.Dynamic.literal(currentSection = currentSection.asInstanceOf[js.Any], showSearchResults = showSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISectionState]
  }
  @scala.inline
  implicit class ISectionStateOps[Self <: ISectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSearchResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

