package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ExtendedConfigCacheEntry
import typingsSlinky.typescript.mod.FileExtensionInfo
import typingsSlinky.typescript.mod.Map
import typingsSlinky.typescript.mod.ParseConfigHost
import typingsSlinky.typescript.mod.ParsedCommandLine
import typingsSlinky.typescript.mod.Path
import typingsSlinky.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.parseJsonConfigFileContent")
@js.native
object parseJsonConfigFileContent extends js.Object {
  
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: js.UndefOr[CompilerOptions],
    configFileName: js.UndefOr[String],
    resolutionStack: js.UndefOr[js.Array[Path]],
    extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
    extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
    existingWatchOptions: js.UndefOr[WatchOptions]
  ): ParsedCommandLine = js.native
}
