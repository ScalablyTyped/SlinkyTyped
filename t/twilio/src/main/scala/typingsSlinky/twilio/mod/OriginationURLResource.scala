package typingsSlinky.twilio.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.twilio.mod.Resource because Already inherited
- typingsSlinky.twilio.mod.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait OriginationURLResource extends CreatableMappedResource[OriginationURLInstance] {
  
  def list(args: js.Any): Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def list(callback: RequestCallback): Promise[_] = js.native
  @JSName("list")
  var list_Original: RestMethod = js.native
}
