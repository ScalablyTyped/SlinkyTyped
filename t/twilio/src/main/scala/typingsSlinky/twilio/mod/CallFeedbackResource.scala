package typingsSlinky.twilio.mod

import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.twilio.mod.Resource because Already inherited
- typingsSlinky.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ @js.native
trait CallFeedbackResource extends PostableResource {
  
  def create(args: js.Any): Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def create(callback: RequestCallback): Promise[_] = js.native
  @JSName("create")
  var create_Original: RestMethod = js.native
  
  def delete(args: js.Any): Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def delete(callback: RequestCallback): Promise[_] = js.native
  @JSName("delete")
  var delete_Original: RestMethod = js.native
}
