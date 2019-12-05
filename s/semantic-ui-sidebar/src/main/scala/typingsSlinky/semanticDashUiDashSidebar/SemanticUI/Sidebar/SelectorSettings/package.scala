package typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.fixed
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.omitted
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pusher
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.sidebar
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, fixed | omitted | pusher | sidebar]) with (Partial[Pick[_Impl, fixed | omitted | pusher | sidebar]])
}
