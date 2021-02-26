package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPickItem extends StObject {
  
  /**
    * Always show this item.
    */
  var alwaysShow: js.UndefOr[Boolean] = js.native
  
  /**
    * A human-readable string which is rendered less prominent in the same line. Supports rendering of
    * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
    * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string which is rendered prominent. Supports rendering of [theme icons](#ThemeIcon) via
    * the `$(<name>)`-syntax.
    */
  var label: String = js.native
  
  /**
    * Optional flag indicating if this item is picked initially.
    * (Only honored when the picker allows multiple selections.)
    *
    * @see [QuickPickOptions.canPickMany](#QuickPickOptions.canPickMany)
    */
  var picked: js.UndefOr[Boolean] = js.native
}
object QuickPickItem {
  
  @scala.inline
  def apply(label: String): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItem]
  }
  
  @scala.inline
  implicit class QuickPickItemMutableBuilder[Self <: QuickPickItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicked(value: Boolean): Self = StObject.set(x, "picked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickedUndefined: Self = StObject.set(x, "picked", js.undefined)
  }
}
