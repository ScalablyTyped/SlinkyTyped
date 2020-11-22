package typingsSlinky.stylableCore.mod

import typingsSlinky.stylableCore.cachedProcessFileMod.FileProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "StylableResolver")
@js.native
class StylableResolver protected ()
  extends typingsSlinky.stylableCore.stylableResolverMod.StylableResolver {
  def this(
    fileProcessor: FileProcessor[typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta],
    requireModule: js.Function1[/* modulePath */ String, _]
  ) = this()
}
