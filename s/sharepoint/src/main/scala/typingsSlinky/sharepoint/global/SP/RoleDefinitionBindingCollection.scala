package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
class RoleDefinitionBindingCollection protected ()
  extends typingsSlinky.sharepoint.SP.RoleDefinitionBindingCollection {
  def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext) = this()
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typingsSlinky.sharepoint.SP.RoleDefinition] = js.native
}

/* static members */
@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
object RoleDefinitionBindingCollection extends js.Object {
  def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.RoleDefinitionBindingCollection = js.native
}

