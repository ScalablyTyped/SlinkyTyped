package typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, 'variable'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl>> */
trait Param extends js.Object {
  var variable: js.UndefOr[js.RegExp] = js.undefined
}

object Param {
  @scala.inline
  def apply(variable: js.RegExp = null): Param = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

