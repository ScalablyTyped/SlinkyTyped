package typingsSlinky.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JQueryAjaxSettingsBase = typingsSlinky.std.Pick[
    typingsSlinky.jquery.JQueryAjaxSettings, 
    typingsSlinky.select2.mod.Sub[
      /* keyof jquery.JQueryAjaxSettings */ typingsSlinky.select2.select2Strings.url | typingsSlinky.select2.select2Strings.accepts | typingsSlinky.select2.select2Strings.async | typingsSlinky.select2.select2Strings.beforeSend | typingsSlinky.select2.select2Strings.cache | typingsSlinky.select2.select2Strings.complete | typingsSlinky.select2.select2Strings.contents | typingsSlinky.select2.select2Strings.contentType | typingsSlinky.select2.select2Strings.context | typingsSlinky.select2.select2Strings.converters | typingsSlinky.select2.select2Strings.crossDomain | typingsSlinky.select2.select2Strings.data | typingsSlinky.select2.select2Strings.dataFilter | typingsSlinky.select2.select2Strings.dataType | typingsSlinky.select2.select2Strings.enctype | typingsSlinky.select2.select2Strings.error | typingsSlinky.select2.select2Strings.global | typingsSlinky.select2.select2Strings.headers | typingsSlinky.select2.select2Strings.ifModified | typingsSlinky.select2.select2Strings.isLocal | typingsSlinky.select2.select2Strings.jsonp | typingsSlinky.select2.select2Strings.jsonpCallback | typingsSlinky.select2.select2Strings.method | typingsSlinky.select2.select2Strings.mimeType | typingsSlinky.select2.select2Strings.password | typingsSlinky.select2.select2Strings.processData | typingsSlinky.select2.select2Strings.scriptCharset | typingsSlinky.select2.select2Strings.statusCode | typingsSlinky.select2.select2Strings.success | typingsSlinky.select2.select2Strings.timeout | typingsSlinky.select2.select2Strings.traditional | typingsSlinky.select2.select2Strings.`type` | typingsSlinky.select2.select2Strings.username | typingsSlinky.select2.select2Strings.xhr | typingsSlinky.select2.select2Strings.xhrFields, 
      typingsSlinky.select2.select2Strings.url
    ]
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
