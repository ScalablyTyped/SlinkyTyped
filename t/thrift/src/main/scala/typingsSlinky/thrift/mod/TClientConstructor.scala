package typingsSlinky.thrift.mod

import typingsSlinky.thrift.anon.Client
import typingsSlinky.thrift.anon.InstantiableTClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.thrift.anon.InstantiableTClient[TClient]
  - typingsSlinky.thrift.anon.Client[TClient]
*/
trait TClientConstructor[TClient] extends js.Object

object TClientConstructor {
  @scala.inline
  implicit def apply[TClient](value: Client[TClient]): TClientConstructor[TClient] = value.asInstanceOf[TClientConstructor[TClient]]
  @scala.inline
  implicit def apply[TClient](value: InstantiableTClient[TClient]): TClientConstructor[TClient] = value.asInstanceOf[TClientConstructor[TClient]]
}

