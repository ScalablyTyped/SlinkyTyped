package typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.method
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.movedSidebar
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.notFound
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.overlay
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pusher
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]) with (Partial[Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]])
}
