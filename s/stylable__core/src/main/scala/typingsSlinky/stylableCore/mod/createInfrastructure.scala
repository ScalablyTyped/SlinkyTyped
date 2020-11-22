package typingsSlinky.stylableCore.mod

import typingsSlinky.stylableCore.anon.OmitTimedCacheOptionscrea
import typingsSlinky.stylableCore.cachedProcessFileMod.MinimalFS
import typingsSlinky.stylableCore.createInfraStructureMod.StylableInfrastructure
import typingsSlinky.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "createInfrastructure")
@js.native
object createInfrastructure extends js.Object {
  
  def apply(
    projectRoot: String,
    fileSystem: MinimalFS,
    onProcess: js.UndefOr[
      js.Function2[
        /* meta */ typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta, 
        /* path */ String, 
        typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
      ]
    ],
    resolveOptions: js.UndefOr[js.Any],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    createDiagnostics: js.UndefOr[
      js.Function1[/* from */ String, typingsSlinky.stylableCore.diagnosticsMod.Diagnostics]
    ]
  ): StylableInfrastructure = js.native
}
