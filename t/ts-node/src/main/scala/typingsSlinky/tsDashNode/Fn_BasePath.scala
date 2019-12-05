package typingsSlinky.tsDashNode

import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.ExtendedConfigCacheEntry
import typingsSlinky.typescript.typescriptMod.FileExtensionInfo
import typingsSlinky.typescript.typescriptMod.Map
import typingsSlinky.typescript.typescriptMod.ParseConfigHost
import typingsSlinky.typescript.typescriptMod.ParsedCommandLine
import typingsSlinky.typescript.typescriptMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BasePath extends js.Object {
  def apply(json: js.Any, host: ParseConfigHost, basePath: String): ParsedCommandLine = js.native
  def apply(json: js.Any, host: ParseConfigHost, basePath: String, existingOptions: CompilerOptions): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
}

