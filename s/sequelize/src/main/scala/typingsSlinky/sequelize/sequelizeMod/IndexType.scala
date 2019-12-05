package typingsSlinky.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sequelize.sequelizeStrings.UNIQUE
  - typings.sequelize.sequelizeStrings.FULLTEXT
  - typings.sequelize.sequelizeStrings.SPATIAL
*/
trait IndexType extends js.Object

object IndexType {
  @scala.inline
  def FULLTEXT: typingsSlinky.sequelize.sequelizeStrings.FULLTEXT = this.cast("FULLTEXT")
  @scala.inline
  def SPATIAL: typingsSlinky.sequelize.sequelizeStrings.SPATIAL = this.cast("SPATIAL")
  @scala.inline
  def UNIQUE: typingsSlinky.sequelize.sequelizeStrings.UNIQUE = this.cast("UNIQUE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

