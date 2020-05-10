package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.IEnumerable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientValueObjectCollection")
@js.native
class ClientValueObjectCollection[T] ()
  extends ClientValueObject
     with IEnumerable[T] {
  def get_count(): Double = js.native
}

