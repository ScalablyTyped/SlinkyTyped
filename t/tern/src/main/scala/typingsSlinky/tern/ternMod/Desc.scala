package typingsSlinky.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desc[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */] extends StObject {
  
  @JSName("run")
  def run_query(
    Server: typingsSlinky.tern.ternMod.Server,
    query: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['query'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['result'] */ js.Any = js.native
  @JSName("run")
  def run_query(
    Server: typingsSlinky.tern.ternMod.Server,
    query: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['query'] */ js.Any,
    file: File
  ): /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['result'] */ js.Any = js.native
  
  var takesFile: js.UndefOr[Boolean] = js.native
}
