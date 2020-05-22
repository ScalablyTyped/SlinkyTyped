package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
@JSGlobal("SP.ClientResult")
@js.native
class ClientResult[T] ()
  extends typingsSlinky.sharepoint.SP.ClientResult[T] {
  /* CompleteClass */
  override def get_value(): T = js.native
  /* CompleteClass */
  override def setValue(value: T): Unit = js.native
}

