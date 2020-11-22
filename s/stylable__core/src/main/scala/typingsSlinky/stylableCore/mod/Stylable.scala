package typingsSlinky.stylableCore.mod

import typingsSlinky.stylableCore.anon.OmitTimedCacheOptionscrea
import typingsSlinky.stylableCore.cachedProcessFileMod.MinimalFS
import typingsSlinky.stylableCore.stylableCoreStrings.development
import typingsSlinky.stylableCore.stylableCoreStrings.production
import typingsSlinky.stylableCore.stylableMod.StylableConfig
import typingsSlinky.stylableCore.stylableTransformerMod.TransformHooks
import typingsSlinky.stylableCore.typesMod.IStylableOptimizer
import typingsSlinky.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "Stylable")
@js.native
class Stylable protected ()
  extends typingsSlinky.stylableCore.stylableMod.Stylable {
  def this(
    projectRoot: String,
    fileSystem: MinimalFS,
    requireModule: js.Function1[/* path */ String, _],
    delimiter: js.UndefOr[String],
    onProcess: js.UndefOr[
        js.Function2[
          /* meta */ typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta, 
          /* path */ String, 
          typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
        ]
      ],
    diagnostics: js.UndefOr[typingsSlinky.stylableCore.diagnosticsMod.Diagnostics],
    hooks: js.UndefOr[TransformHooks],
    resolveOptions: js.UndefOr[js.Any],
    optimizer: js.UndefOr[IStylableOptimizer],
    mode: js.UndefOr[production | development],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver]
  ) = this()
}
/* static members */
@JSImport("@stylable/core", "Stylable")
@js.native
object Stylable extends js.Object {
  
  def create(config: StylableConfig): typingsSlinky.stylableCore.stylableMod.Stylable = js.native
}
