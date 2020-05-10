package typingsSlinky.semanticUiReact.sidebarSidebarMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import typingsSlinky.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarComponent
  extends ComponentClass[SidebarProps, js.Object] {
  var Pushable: ReactComponentClass[SidebarPushableProps] = js.native
  var Pusher: ReactComponentClass[SidebarPusherProps] = js.native
}

