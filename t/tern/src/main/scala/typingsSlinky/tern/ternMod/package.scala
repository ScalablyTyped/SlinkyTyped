package typingsSlinky.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ternMod {
  type ConstructorOptions = typingsSlinky.tern.ternMod.CtorOptions with (typingsSlinky.tern.ternMod.SyncConstructorOptions | typingsSlinky.tern.ternMod.ASyncConstructorOptions)
  type Query = /* import warning: importer.ImportType#apply Failed type conversion: tern.AnonResult | tern.AnonQueryResult | tern.AnonQueryRefsQuery | tern.AnonQueryRenameQuery | tern.AnonQueryDefinitionQuery | tern.AnonQueryCompletionsQuery | tern.AnonQueryPropertiesQuery | tern.AnonQueryDocumentationQuery['query'] */ js.Any
  type QueryResult[Q /* <: typingsSlinky.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
