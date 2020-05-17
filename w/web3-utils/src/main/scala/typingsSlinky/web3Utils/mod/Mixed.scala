package typingsSlinky.web3Utils.mod

import typingsSlinky.bnJs.mod.^
import typingsSlinky.web3Utils.anon.T
import typingsSlinky.web3Utils.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.bnJs.mod.^
  - typingsSlinky.web3Utils.anon.Type
  - typingsSlinky.web3Utils.anon.T
  - scala.Boolean
*/
trait Mixed extends js.Object

object Mixed {
  @scala.inline
  implicit def apply(value: Boolean): Mixed = value.asInstanceOf[Mixed]
  @scala.inline
  implicit def apply(value: Double): Mixed = value.asInstanceOf[Mixed]
  @scala.inline
  implicit def apply(value: String): Mixed = value.asInstanceOf[Mixed]
  @scala.inline
  implicit def apply(value: T): Mixed = value.asInstanceOf[Mixed]
  @scala.inline
  implicit def apply(value: Type): Mixed = value.asInstanceOf[Mixed]
  @scala.inline
  implicit def apply(value: ^): Mixed = value.asInstanceOf[Mixed]
}

