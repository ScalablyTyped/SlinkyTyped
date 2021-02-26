package typingsSlinky.stylableCore

import typingsSlinky.stylableCore.anon.OmitTimedCacheOptionscrea
import typingsSlinky.stylableCore.cachedProcessFileMod.FileProcessor
import typingsSlinky.stylableCore.cachedProcessFileMod.MinimalFS
import typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
import typingsSlinky.stylableCore.parserMod.CssParser
import typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
import typingsSlinky.stylableCore.typesMod.ModuleResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInfraStructureMod {
  
  @JSImport("@stylable/core/cjs/create-infra-structure", "createInfrastructure")
  @js.native
  def createInfrastructure(
    projectRoot: String,
    fileSystem: MinimalFS,
    onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]],
    resolveOptions: js.UndefOr[js.Any],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser],
    createDiagnostics: js.UndefOr[js.Function1[/* from */ String, Diagnostics]]
  ): StylableInfrastructure = js.native
  
  @js.native
  trait StylableInfrastructure extends StObject {
    
    var fileProcessor: FileProcessor[StylableMeta] = js.native
    
    def resolvePath(context: js.UndefOr[scala.Nothing], path: String): String = js.native
    def resolvePath(context: String, path: String): String = js.native
  }
}
