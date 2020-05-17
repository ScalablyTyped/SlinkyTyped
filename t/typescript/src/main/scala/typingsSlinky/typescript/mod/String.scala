package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.EscapedIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String with typingsSlinky.typescript.anon.EscapedIdentifier
  - scala.Unit with typingsSlinky.typescript.anon.EscapedIdentifier
  - typingsSlinky.typescript.mod.InternalSymbolName
*/
trait String extends js.Object

object String {
  @scala.inline
  implicit def apply(value: Unit with EscapedIdentifier): String = value.asInstanceOf[String]
  @scala.inline
  implicit def apply(value: java.lang.String with EscapedIdentifier): String = value.asInstanceOf[String]
  @scala.inline
  implicit def apply(value: InternalSymbolName): String = value.asInstanceOf[String]
}

