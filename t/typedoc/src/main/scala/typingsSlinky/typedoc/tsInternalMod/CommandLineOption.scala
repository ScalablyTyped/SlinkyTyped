package typingsSlinky.typedoc.tsInternalMod

import typingsSlinky.std.Map
import typingsSlinky.typedoc.typedocStrings.boolean
import typingsSlinky.typedoc.typedocStrings.list
import typingsSlinky.typedoc.typedocStrings.number
import typingsSlinky.typedoc.typedocStrings.object_
import typingsSlinky.typedoc.typedocStrings.string
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
  def CommandLineOptionOfCustomType(name: String, `type`: Map[Double | String, _]): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfPrimitiveType(name: String, `type`: string | number | boolean): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def TsConfigOnlyOption(name: String, `type`: object_): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfListType(
    element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
    name: String,
    `type`: list
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
}

