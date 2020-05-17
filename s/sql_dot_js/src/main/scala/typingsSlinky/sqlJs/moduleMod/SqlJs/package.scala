package typingsSlinky.sqlJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlJs {
  type ParamsCallback = js.Function1[/* obj */ typingsSlinky.sqlJs.moduleMod.SqlJs.ParamsObject, scala.Unit]
  type ParamsObject = typingsSlinky.std.Record[java.lang.String, typingsSlinky.sqlJs.moduleMod.SqlJs.ValueType]
}
