package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedProjectReference
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.resolveTypeReferenceDirective")
@js.native
object resolveTypeReferenceDirective extends js.Object {
  
  def apply(
    typeReferenceDirectiveName: String,
    containingFile: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def apply(
    typeReferenceDirectiveName: String,
    containingFile: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  /**
    * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
    * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
    * is assumed to be the same as root directory of the project.
    */
  def apply(
    typeReferenceDirectiveName: String,
    containingFile: String,
    options: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def apply(
    typeReferenceDirectiveName: String,
    containingFile: String,
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
}
