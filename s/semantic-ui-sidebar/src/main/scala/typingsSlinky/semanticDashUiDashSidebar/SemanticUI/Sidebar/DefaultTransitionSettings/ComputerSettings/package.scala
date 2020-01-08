package typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ComputerSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.bottom
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.left
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.right
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.top
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, left | right | top | bottom]) with (Partial[Pick[_Impl, left | right | top | bottom]])
}
