package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodesVisited. */
@js.native
trait DialogNodesVisited extends StObject {
  
  /** The conditions that trigger the dialog node. */
  var conditions: js.UndefOr[String] = js.native
  
  /** A dialog node that was triggered during processing of the input message. */
  var dialog_node: js.UndefOr[String] = js.native
  
  /** The title of the dialog node. */
  var title: js.UndefOr[String] = js.native
}
object DialogNodesVisited {
  
  @scala.inline
  def apply(): DialogNodesVisited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodesVisited]
  }
  
  @scala.inline
  implicit class DialogNodesVisitedMutableBuilder[Self <: DialogNodesVisited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_nodeUndefined: Self = StObject.set(x, "dialog_node", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
