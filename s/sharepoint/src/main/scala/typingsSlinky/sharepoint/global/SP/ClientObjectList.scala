package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectList")
@js.native
class ClientObjectList[T] protected ()
  extends typingsSlinky.sharepoint.SP.ClientObjectList[T] {
  def this(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    objectPath: typingsSlinky.sharepoint.SP.ObjectPath,
    childItemType: js.Any
  ) = this()
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
}

