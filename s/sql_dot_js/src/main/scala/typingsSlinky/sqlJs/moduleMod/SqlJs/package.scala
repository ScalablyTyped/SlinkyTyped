package typingsSlinky.sqlJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SqlJs {
  
  type ParamsCallback = js.Function1[/* obj */ typingsSlinky.sqlJs.moduleMod.SqlJs.ParamsObject, scala.Unit]
  
  type ParamsObject = typingsSlinky.std.Record[java.lang.String, typingsSlinky.sqlJs.moduleMod.SqlJs.ValueType]
  
  type ValueType = scala.Double | java.lang.String | js.typedarray.Uint8Array | scala.Null
}
