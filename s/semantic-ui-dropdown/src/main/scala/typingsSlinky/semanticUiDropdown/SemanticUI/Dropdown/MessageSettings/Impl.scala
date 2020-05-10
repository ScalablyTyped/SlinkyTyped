package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'Add <b>{term}</b>'
    */
  var addResult: String = js.native
  /**
    * @default '{count} selected'
    */
  var count: String = js.native
  /**
    * @default 'Max {maxCount} selections'
    */
  var maxSelections: String = js.native
  /**
    * 'No results found.'
    */
  var noResults: String = js.native
}

object Impl {
  @scala.inline
  def apply(addResult: String, count: String, maxSelections: String, noResults: String): Impl = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSelections(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

