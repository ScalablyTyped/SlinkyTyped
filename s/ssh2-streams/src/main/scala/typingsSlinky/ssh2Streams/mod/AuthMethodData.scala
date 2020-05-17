package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.ssh2Streams.mod.PublicKeyAuthMethodData
  - typingsSlinky.ssh2Streams.mod.HostbasedAuthMethodData
*/
trait AuthMethodData extends js.Object

object AuthMethodData {
  @scala.inline
  implicit def apply(value: HostbasedAuthMethodData): AuthMethodData = value.asInstanceOf[AuthMethodData]
  @scala.inline
  implicit def apply(value: PublicKeyAuthMethodData): AuthMethodData = value.asInstanceOf[AuthMethodData]
  @scala.inline
  implicit def apply(value: String): AuthMethodData = value.asInstanceOf[AuthMethodData]
}

