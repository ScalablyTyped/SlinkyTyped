package typingsSlinky.soap.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.httpMod.Server
  - typingsSlinky.soap.serverMod.IExpressApp
*/
trait ServerType extends js.Object

object ServerType {
  @scala.inline
  implicit def apply(value: IExpressApp): ServerType = value.asInstanceOf[ServerType]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.httpMod.Server): ServerType = value.asInstanceOf[ServerType]
}

