package typingsSlinky.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplIos extends js.Object {
  var ios: js.UndefOr[js.RegExp] = js.undefined
  var mobile: js.UndefOr[js.RegExp] = js.undefined
}

object PartialPickImplkeyofImplIos {
  @scala.inline
  def apply(ios: js.RegExp = null, mobile: js.RegExp = null): PartialPickImplkeyofImplIos = {
    val __obj = js.Dynamic.literal()
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplIos]
  }
}

