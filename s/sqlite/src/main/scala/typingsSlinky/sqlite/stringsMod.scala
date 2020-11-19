package typingsSlinky.sqlite

import typingsSlinky.sqlite.interfacesMod.ISqlite.SqlObj
import typingsSlinky.sqlite.interfacesMod.ISqlite.SqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqlite/build/utils/strings", JSImport.Namespace)
@js.native
object stringsMod extends js.Object {
  
  def toSqlParams(sql: SqlType): SqlObj = js.native
  def toSqlParams(sql: SqlType, params: js.Array[_]): SqlObj = js.native
}
