package typingsSlinky.tsLoader.anon

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedProjectReference
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
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
