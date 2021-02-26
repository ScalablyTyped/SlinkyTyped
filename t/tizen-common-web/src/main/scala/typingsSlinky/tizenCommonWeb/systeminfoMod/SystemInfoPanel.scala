package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoPanel extends SystemInfoProperty {
  
  /**
    * The height of the panel in pixels.
    */
  val panelHeight: Double = js.native
  
  /**
    * The width of the panel in pixels.
    */
  val panelWidth: Double = js.native
}
object SystemInfoPanel {
  
  @scala.inline
  def apply(panelHeight: Double, panelWidth: Double): SystemInfoPanel = {
    val __obj = js.Dynamic.literal(panelHeight = panelHeight.asInstanceOf[js.Any], panelWidth = panelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPanel]
  }
  
  @scala.inline
  implicit class SystemInfoPanelMutableBuilder[Self <: SystemInfoPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanelHeight(value: Double): Self = StObject.set(x, "panelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelWidth(value: Double): Self = StObject.set(x, "panelWidth", value.asInstanceOf[js.Any])
  }
}
