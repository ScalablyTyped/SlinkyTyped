package typingsSlinky.wixUiIconsCommon.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeneralCategoryList {
  
  @JSImport("wix-ui-icons-common/dist/stories/general/GeneralCategoryList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GeneralCategoryList.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
