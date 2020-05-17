package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.DOM
import typingsSlinky.semanticUiTab.semanticUiTabStrings.html
import typingsSlinky.semanticUiTab.semanticUiTabStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'cacheType'> */
@js.native
trait PickImplcacheType extends js.Object {
  var cacheType: response | DOM | html = js.native
}

object PickImplcacheType {
  @scala.inline
  def apply(cacheType: response | DOM | html): PickImplcacheType = {
    val __obj = js.Dynamic.literal(cacheType = cacheType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcacheType]
  }
  @scala.inline
  implicit class PickImplcacheTypeOps[Self <: PickImplcacheType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheType(value: response | DOM | html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

