package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceControlResourceGroup extends StObject {
  
  /**
    * Dispose this source control resource group.
    */
  def dispose(): Unit = js.native
  
  /**
    * Whether this source control resource group is hidden when it contains
    * no [source control resource states](#SourceControlResourceState).
    */
  var hideWhenEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of this source control resource group.
    */
  val id: String = js.native
  
  /**
    * The label of this source control resource group.
    */
  var label: String = js.native
  
  /**
    * This group's collection of
    * [source control resource states](#SourceControlResourceState).
    */
  var resourceStates: js.Array[SourceControlResourceState] = js.native
}
object SourceControlResourceGroup {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    id: String,
    label: String,
    resourceStates: js.Array[SourceControlResourceState]
  ): SourceControlResourceGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], resourceStates = resourceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceGroup]
  }
  
  @scala.inline
  implicit class SourceControlResourceGroupMutableBuilder[Self <: SourceControlResourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideWhenEmpty(value: Boolean): Self = StObject.set(x, "hideWhenEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWhenEmptyUndefined: Self = StObject.set(x, "hideWhenEmpty", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStates(value: js.Array[SourceControlResourceState]): Self = StObject.set(x, "resourceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatesVarargs(value: SourceControlResourceState*): Self = StObject.set(x, "resourceStates", js.Array(value :_*))
  }
}
