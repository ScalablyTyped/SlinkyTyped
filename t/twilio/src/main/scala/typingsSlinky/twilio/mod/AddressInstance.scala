package typingsSlinky.twilio.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.twilio.mod.Resource because Already inherited
- typingsSlinky.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ @js.native
trait AddressInstance extends PostableResource {
  @JSName("delete")
  var delete_Original: RestMethod = js.native
  // Mixins
  var dependentPhoneNumbers: DependentPhoneNumberResource = js.native
  def delete(args: js.Any): Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def delete(callback: RequestCallback): Promise[_] = js.native
}

