package typingsSlinky.stompit.channelMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - js.Function0[typingsSlinky.node.streamMod.Readable]
*/
trait Body extends js.Object

object Body {
  @scala.inline
  implicit def apply(value: Buffer): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: js.Function0[Readable]): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: String): Body = value.asInstanceOf[Body]
}

