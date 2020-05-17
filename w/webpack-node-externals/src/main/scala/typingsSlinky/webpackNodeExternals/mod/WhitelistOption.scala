package typingsSlinky.webpackNodeExternals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.webpackNodeExternals.mod.WhitelistFunctionType
*/
trait WhitelistOption extends js.Object

object WhitelistOption {
  @scala.inline
  implicit def apply(value: js.RegExp): WhitelistOption = value.asInstanceOf[WhitelistOption]
  @scala.inline
  implicit def apply(value: String): WhitelistOption = value.asInstanceOf[WhitelistOption]
  @scala.inline
  implicit def apply(value: WhitelistFunctionType): WhitelistOption = value.asInstanceOf[WhitelistOption]
}

