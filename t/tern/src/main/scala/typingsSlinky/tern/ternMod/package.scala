package typingsSlinky.tern

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ternMod {
  
  type ConstructorOptions = typingsSlinky.tern.ternMod.CtorOptions with (typingsSlinky.tern.ternMod.SyncConstructorOptions | typingsSlinky.tern.ternMod.ASyncConstructorOptions)
  
  type QueryResult[Q /* <: typingsSlinky.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
  
  @scala.inline
  def Server: typingsSlinky.tern.ternMod.TernConstructor = typingsSlinky.tern.ternMod.^.asInstanceOf[js.Dynamic].selectDynamic("Server").asInstanceOf[typingsSlinky.tern.ternMod.TernConstructor]
  
  @scala.inline
  def defineQueryType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: typingsSlinky.tern.ternMod.Desc[T]): scala.Unit = (typingsSlinky.tern.ternMod.^.asInstanceOf[js.Dynamic].applyDynamic("defineQueryType")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerPlugin(
    name: java.lang.String,
    init: js.Function2[
      /* server */ typingsSlinky.tern.ternMod.Server, 
      /* options */ js.UndefOr[typingsSlinky.tern.ternMod.ConstructorOptions], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.tern.ternMod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.tern.ternMod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
