package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object uniApp {
  
  type AnyObject = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.uniApp.uniAppStrings.KVInfer with org.scalablytyped.runtime.TopLevel[T]
  
  type Void[T] = js.UndefOr[T | scala.Null]
}
