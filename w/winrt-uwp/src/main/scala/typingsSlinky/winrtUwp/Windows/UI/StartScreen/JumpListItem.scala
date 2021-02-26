package typingsSlinky.winrtUwp.Windows.UI.StartScreen

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for creating and defining jump list items for an app's jump list. */
@js.native
trait JumpListItem extends StObject {
  
  /** Gets the command line arguments for the jump list item. */
  var arguments: String = js.native
  
  /** Gets or sets the jump list item task description. */
  var description: String = js.native
  
  /** Gets or sets the jump list item display name. The display name can also be specified as a parameter using the CreateWithArguments method when the jump list item is created. */
  var displayName: String = js.native
  
  /** Gets or sets the jump list item custom group name. If no name is specified, the item will be added to the Tasks group by default. */
  var groupName: String = js.native
  
  /** Gets the JumpListItemKind of a jump list item. */
  var kind: JumpListItemKind = js.native
  
  /** Gets or sets the jump list item's logo. */
  var logo: Uri = js.native
  
  /** Gets a boolean indicating whether the jump list item was removed from the app's jump list by the user. */
  var removedByUser: Boolean = js.native
}
object JumpListItem {
  
  @scala.inline
  def apply(
    arguments: String,
    description: String,
    displayName: String,
    groupName: String,
    kind: JumpListItemKind,
    logo: Uri,
    removedByUser: Boolean
  ): JumpListItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], removedByUser = removedByUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListItem]
  }
  
  @scala.inline
  implicit class JumpListItemMutableBuilder[Self <: JumpListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: JumpListItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: Uri): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedByUser(value: Boolean): Self = StObject.set(x, "removedByUser", value.asInstanceOf[js.Any])
  }
}
