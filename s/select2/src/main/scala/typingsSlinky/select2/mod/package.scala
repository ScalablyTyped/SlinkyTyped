package typingsSlinky.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JQueryAjaxSettingsBase = typingsSlinky.std.Pick[
    typingsSlinky.jquery.JQueryAjaxSettings, 
    typingsSlinky.select2.mod.Sub[java.lang.String, typingsSlinky.select2.select2Strings.url]
  ]
  type JQueryEventHandlerBase[TContext, T] = js.ThisFunction2[
    /* this */ TContext, 
    /* t */ T, 
    /* repeated */ js.Any, 
    scala.Unit | typingsSlinky.select2.select2Booleans.`false`
  ]
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Sub[O /* <: java.lang.String */, D /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in O ]: std.Record<D, never> & std.Record<string, K>[K]}[O] */ js.Any
}
