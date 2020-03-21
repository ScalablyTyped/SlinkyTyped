package typingsSlinky.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vexdb.vexdbStrings.events
  - typingsSlinky.vexdb.vexdbStrings.teams
  - typingsSlinky.vexdb.vexdbStrings.matches
  - typingsSlinky.vexdb.vexdbStrings.rankings
  - typingsSlinky.vexdb.vexdbStrings.season_rankings
  - typingsSlinky.vexdb.vexdbStrings.awards
  - typingsSlinky.vexdb.vexdbStrings.skills
*/
trait Endpoint extends js.Object

object Endpoint {
  @scala.inline
  def awards: typingsSlinky.vexdb.vexdbStrings.awards = this.cast("awards")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def events: typingsSlinky.vexdb.vexdbStrings.events = this.cast("events")
  @scala.inline
  def matches: typingsSlinky.vexdb.vexdbStrings.matches = this.cast("matches")
  @scala.inline
  def rankings: typingsSlinky.vexdb.vexdbStrings.rankings = this.cast("rankings")
  @scala.inline
  def season_rankings: typingsSlinky.vexdb.vexdbStrings.season_rankings = this.cast("season_rankings")
  @scala.inline
  def skills: typingsSlinky.vexdb.vexdbStrings.skills = this.cast("skills")
  @scala.inline
  def teams: typingsSlinky.vexdb.vexdbStrings.teams = this.cast("teams")
}

