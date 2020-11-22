package typingsSlinky.stylableCore.mod

import typingsSlinky.stylableCore.cachedProcessFileMod.FileProcessor
import typingsSlinky.stylableCore.cachedProcessFileMod.MinimalFS
import typingsSlinky.stylableCore.cachedProcessFileMod.processFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "cachedProcessFile")
@js.native
object cachedProcessFile extends js.Object {
  
  def apply[T](
    processor: processFn[T],
    fs: MinimalFS,
    resolvePath: js.Function2[/* path */ String, /* context */ js.UndefOr[String], String]
  ): FileProcessor[T] = js.native
}
