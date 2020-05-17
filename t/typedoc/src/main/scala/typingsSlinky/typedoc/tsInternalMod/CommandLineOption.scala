package typingsSlinky.typedoc.tsInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedoc.tsInternalMod.CommandLineOptionOfCustomType
  - typingsSlinky.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType
  - typingsSlinky.typedoc.tsInternalMod.TsConfigOnlyOption
  - typingsSlinky.typedoc.tsInternalMod.CommandLineOptionOfListType
*/
trait CommandLineOption extends js.Object

object CommandLineOption {
  @scala.inline
  implicit def apply(value: CommandLineOptionOfCustomType): CommandLineOption = value.asInstanceOf[CommandLineOption]
  @scala.inline
  implicit def apply(value: CommandLineOptionOfListType): CommandLineOption = value.asInstanceOf[CommandLineOption]
  @scala.inline
  implicit def apply(value: CommandLineOptionOfPrimitiveType): CommandLineOption = value.asInstanceOf[CommandLineOption]
  @scala.inline
  implicit def apply(value: TsConfigOnlyOption): CommandLineOption = value.asInstanceOf[CommandLineOption]
}

