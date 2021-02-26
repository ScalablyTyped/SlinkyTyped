package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wx.types.ButtonStyle
import typingsSlinky.wegameApi.wx.types.ButtonType
import typingsSlinky.wegameApi.wx.types.GameClubButtonIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameClubButton extends CreatedButton {
  
  var icon: GameClubButtonIcon = js.native
}
object GameClubButton {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    icon: GameClubButtonIcon,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    onTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): GameClubButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), icon = icon.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameClubButton]
  }
  
  @scala.inline
  implicit class GameClubButtonMutableBuilder[Self <: GameClubButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: GameClubButtonIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
