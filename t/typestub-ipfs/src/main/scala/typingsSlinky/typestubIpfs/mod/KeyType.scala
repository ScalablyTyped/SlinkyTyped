package typingsSlinky.typestubIpfs.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.typestubIpfs.mod.CID
  - js.Any
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  implicit def apply(value: js.Any | CID): KeyType = value.asInstanceOf[KeyType]
  @scala.inline
  implicit def apply(value: Buffer): KeyType = value.asInstanceOf[KeyType]
  @scala.inline
  implicit def apply(value: String): KeyType = value.asInstanceOf[KeyType]
}

