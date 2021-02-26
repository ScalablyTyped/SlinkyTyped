package typingsSlinky.storybookUi.anon

import typingsSlinky.storybookUi.storybookUiStrings.bottom
import typingsSlinky.storybookUi.storybookUiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsToolshown extends StObject {
  
  var isFullscreen: Boolean = js.native
  
  var isToolshown: Boolean = js.native
  
  var panelPosition: bottom | right = js.native
  
  var showNav: Boolean = js.native
  
  var showPanel: Boolean = js.native
}
object IsToolshown {
  
  @scala.inline
  def apply(
    isFullscreen: Boolean,
    isToolshown: Boolean,
    panelPosition: bottom | right,
    showNav: Boolean,
    showPanel: Boolean
  ): IsToolshown = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], showNav = showNav.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsToolshown]
  }
  
  @scala.inline
  implicit class IsToolshownMutableBuilder[Self <: IsToolshown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPosition(value: bottom | right): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNav(value: Boolean): Self = StObject.set(x, "showNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPanel(value: Boolean): Self = StObject.set(x, "showPanel", value.asInstanceOf[js.Any])
  }
}
