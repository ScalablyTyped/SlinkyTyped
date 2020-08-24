package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ExtendedConfigCacheEntry
import typingsSlinky.typescript.mod.FileExtensionInfo
import typingsSlinky.typescript.mod.Map
import typingsSlinky.typescript.mod.ParseConfigFileHost
import typingsSlinky.typescript.mod.ParsedCommandLine
import typingsSlinky.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getParsedCommandLineOfConfigFile")
@js.native
object getParsedCommandLineOfConfigFile extends js.Object {
  def apply(configFileName: String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: js.UndefOr[scala.Nothing],
    watchOptionsToExtend: js.UndefOr[scala.Nothing],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: js.UndefOr[scala.Nothing],
    watchOptionsToExtend: WatchOptions
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: js.UndefOr[scala.Nothing],
    watchOptionsToExtend: WatchOptions,
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry],
    watchOptionsToExtend: js.UndefOr[scala.Nothing],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry],
    watchOptionsToExtend: WatchOptions
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry],
    watchOptionsToExtend: WatchOptions,
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): js.UndefOr[ParsedCommandLine] = js.native
}

