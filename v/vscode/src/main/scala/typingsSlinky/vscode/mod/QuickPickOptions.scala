package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPickOptions extends StObject {
  
  /**
    * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
    */
  var canPickMany: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional flag to include the description when filtering the picks.
    */
  var matchOnDescription: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional flag to include the detail when filtering the picks.
    */
  var matchOnDetail: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional function that is invoked whenever an item is selected.
    */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | String, _]] = js.native
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.native
}
object QuickPickOptions {
  
  @scala.inline
  def apply(): QuickPickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPickOptions]
  }
  
  @scala.inline
  implicit class QuickPickOptionsMutableBuilder[Self <: QuickPickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPickMany(value: Boolean): Self = StObject.set(x, "canPickMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPickManyUndefined: Self = StObject.set(x, "canPickMany", js.undefined)
    
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    @scala.inline
    def setMatchOnDescription(value: Boolean): Self = StObject.set(x, "matchOnDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchOnDescriptionUndefined: Self = StObject.set(x, "matchOnDescription", js.undefined)
    
    @scala.inline
    def setMatchOnDetail(value: Boolean): Self = StObject.set(x, "matchOnDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchOnDetailUndefined: Self = StObject.set(x, "matchOnDetail", js.undefined)
    
    @scala.inline
    def setOnDidSelectItem(value: /* item */ QuickPickItem | String => _): Self = StObject.set(x, "onDidSelectItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidSelectItemUndefined: Self = StObject.set(x, "onDidSelectItem", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
  }
}
