package typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DefaultTransitionSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.computer
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobile
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type ComputerSettings = typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
  type MobileSettings = typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param
  type Param = (Pick[_Impl, computer | mobile]) with (Partial[Pick[_Impl, computer | mobile]])
}
