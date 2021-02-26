package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolQueue extends StObject {
  
  var _links: js.Any = js.native
  
  /**
    * The ID of the queue.
    */
  var id: Double = js.native
  
  /**
    * The name of the queue.
    */
  var name: String = js.native
  
  /**
    * The pool used by this queue.
    */
  var pool: TaskAgentPoolReference = js.native
  
  /**
    * The full http link to the resource.
    */
  var url: String = js.native
}
object AgentPoolQueue {
  
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, pool: TaskAgentPoolReference, url: String): AgentPoolQueue = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueue]
  }
  
  @scala.inline
  implicit class AgentPoolQueueMutableBuilder[Self <: AgentPoolQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
