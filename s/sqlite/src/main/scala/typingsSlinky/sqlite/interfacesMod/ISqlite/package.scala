package typingsSlinky.sqlite.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ISqlite {
  
  /**
    * Allows for input of a normal SQL string or
    * `sql-template-strings` object
    */
  type SqlType = typingsSlinky.sqlite.sqlTemplateStringsMod.SQLStatement | java.lang.String
}
