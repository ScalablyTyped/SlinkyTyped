package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentReaction extends StObject {
  
  /**
    * Whether the [author](CommentAuthorInformation) of the comment has reacted to this reaction
    */
  val authorHasReacted: Boolean = js.native
  
  /**
    * The number of users who have reacted to this reaction
    */
  val count: Double = js.native
  
  /**
    * Icon for the reaction shown in UI.
    */
  val iconPath: String | Uri = js.native
  
  /**
    * The human-readable label for the reaction
    */
  val label: String = js.native
}
object CommentReaction {
  
  @scala.inline
  def apply(authorHasReacted: Boolean, count: Double, iconPath: String | Uri, label: String): CommentReaction = {
    val __obj = js.Dynamic.literal(authorHasReacted = authorHasReacted.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReaction]
  }
  
  @scala.inline
  implicit class CommentReactionMutableBuilder[Self <: CommentReaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorHasReacted(value: Boolean): Self = StObject.set(x, "authorHasReacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPath(value: String | Uri): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
