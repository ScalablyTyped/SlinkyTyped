package typingsSlinky.wordpressComponents.menuMod.NavigableMenu

import typingsSlinky.wordpressComponents.wordpressComponentsStrings.both
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props
  extends typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props {
  
  /**
    * The orientation of the menu.
    * @defaultValue "vertical"
    */
  var orientation: js.UndefOr[vertical | horizontal | both] = js.native
}
object Props {
  
  @scala.inline
  def apply(Props: typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrientation(value: vertical | horizontal | both): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
