package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'evaluateScripts'> */
@js.native
trait PickImplevaluateScripts extends js.Object {
  var evaluateScripts: once | Boolean = js.native
}

object PickImplevaluateScripts {
  @scala.inline
  def apply(evaluateScripts: once | Boolean): PickImplevaluateScripts = {
    val __obj = js.Dynamic.literal(evaluateScripts = evaluateScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplevaluateScripts]
  }
  @scala.inline
  implicit class PickImplevaluateScriptsOps[Self <: PickImplevaluateScripts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluateScripts(value: once | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateScripts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

