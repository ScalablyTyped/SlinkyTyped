package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/navigable-container", JSImport.Namespace)
@js.native
object navigableContainerMod extends js.Object {
  @js.native
  object NavigableMenu extends TopLevel[ReactComponentClass[Props]]
  
  @js.native
  object TabbableContainer
    extends TopLevel[
          ReactComponentClass[typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props]
        ]
  
}

