package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ModuleResolutionCache
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.mod.ResolvedProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.nodeModuleNameResolver")
@js.native
object nodeModuleNameResolver extends js.Object {
  
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: js.UndefOr[scala.Nothing],
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
}
