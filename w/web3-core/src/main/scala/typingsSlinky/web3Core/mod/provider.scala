package typingsSlinky.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.web3Core.mod.HttpProvider
  - typingsSlinky.web3Core.mod.IpcProvider
  - typingsSlinky.web3Core.mod.WebsocketProvider
  - java.lang.String
  - scala.Null
*/
trait provider extends js.Object

object provider {
  @scala.inline
  implicit def apply(value: HttpProvider): provider = value.asInstanceOf[provider]
  @scala.inline
  implicit def apply(value: IpcProvider): provider = value.asInstanceOf[provider]
  @scala.inline
  implicit def apply(value: Null): provider = value.asInstanceOf[provider]
  @scala.inline
  implicit def apply(value: String): provider = value.asInstanceOf[provider]
  @scala.inline
  implicit def apply(value: WebsocketProvider): provider = value.asInstanceOf[provider]
}

