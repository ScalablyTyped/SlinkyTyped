package typingsSlinky.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerStats.swaggerStatsStrings.GET
  - typingsSlinky.swaggerStats.swaggerStatsStrings.POST
  - typingsSlinky.swaggerStats.swaggerStatsStrings.PUT
  - typingsSlinky.swaggerStats.swaggerStatsStrings.DELETE
*/
trait HTTPMethodSubset extends js.Object

object HTTPMethodSubset {
  @scala.inline
  def DELETE: typingsSlinky.swaggerStats.swaggerStatsStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.swaggerStats.swaggerStatsStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsSlinky.swaggerStats.swaggerStatsStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.swaggerStats.swaggerStatsStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

