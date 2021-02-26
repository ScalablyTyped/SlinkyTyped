package typingsSlinky.sqlite

import typingsSlinky.sqlite.interfacesMod.ISqlite.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite", "Database")
  @js.native
  class Database[Driver /* <: typingsSlinky.sqlite.sqlite3Mod.Database */, Stmt /* <: typingsSlinky.sqlite.sqlite3Mod.Statement */] protected ()
    extends typingsSlinky.sqlite.databaseMod.Database[Driver, Stmt] {
    def this(config: Config) = this()
  }
  
  @JSImport("sqlite", "Statement")
  @js.native
  class Statement[S /* <: typingsSlinky.sqlite.sqlite3Mod.Statement */] protected ()
    extends typingsSlinky.sqlite.statementMod.Statement[S] {
    def this(stmt: S) = this()
  }
  
  /**
    * Opens a database for manipulation. Most users will call this to get started.
    */
  @JSImport("sqlite", "open")
  @js.native
  def open[Driver /* <: typingsSlinky.sqlite.sqlite3Mod.Database */, Stmt /* <: typingsSlinky.sqlite.sqlite3Mod.Statement */](config: Config): js.Promise[
    typingsSlinky.sqlite.databaseMod.Database[
      typingsSlinky.sqlite.sqlite3Mod.Database, 
      typingsSlinky.sqlite.sqlite3Mod.Statement
    ]
  ] = js.native
}
