package typingsSlinky.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.active
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.animating
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.bottom
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.dimmed
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.ios
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.left
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pushable
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pushed
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.right
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.top
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.visible
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    active | animating | dimmed | ios | pushable | pushed | right | top | left | bottom | visible
  ]) with (Partial[
    Pick[
      _Impl, 
      active | animating | dimmed | ios | pushable | pushed | right | top | left | bottom | visible
    ]
  ])
}
