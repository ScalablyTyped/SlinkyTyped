package typingsSlinky.typedoc.tsInternalMod

import typingsSlinky.std.Map
import typingsSlinky.typedoc.typedocStrings.boolean
import typingsSlinky.typedoc.typedocStrings.list
import typingsSlinky.typedoc.typedocStrings.number
import typingsSlinky.typedoc.typedocStrings.object_
import typingsSlinky.typedoc.typedocStrings.string
import typingsSlinky.typescript.mod.DiagnosticMessage
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
  def CommandLineOptionOfCustomType(
    name: String,
    `type`: Map[Double | String, _],
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.get.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfPrimitiveType(
    name: String,
    `type`: string | number | boolean,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.get.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def TsConfigOnlyOption(
    name: String,
    `type`: object_,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.get.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfListType(
    element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
    name: String,
    `type`: list,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.get.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
}

