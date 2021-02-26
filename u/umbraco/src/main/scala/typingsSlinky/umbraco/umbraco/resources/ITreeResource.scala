package typingsSlinky.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
@js.native
trait ITreeResource extends StObject {
  
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: js.Any): Unit = js.native
  
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): Unit = js.native
  
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): Unit = js.native
}
object ITreeResource {
  
  @scala.inline
  def apply(loadApplication: js.Any => Unit, loadMenu: js.Any => Unit, loadNodes: js.Any => Unit): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
    __obj.asInstanceOf[ITreeResource]
  }
  
  @scala.inline
  implicit class ITreeResourceMutableBuilder[Self <: ITreeResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadApplication(value: js.Any => Unit): Self = StObject.set(x, "loadApplication", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadMenu(value: js.Any => Unit): Self = StObject.set(x, "loadMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadNodes(value: js.Any => Unit): Self = StObject.set(x, "loadNodes", js.Any.fromFunction1(value))
  }
}
