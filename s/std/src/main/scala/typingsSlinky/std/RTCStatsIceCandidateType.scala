package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.host
  - typings.std.stdStrings.serverreflexive
  - typings.std.stdStrings.peerreflexive
  - typings.std.stdStrings.relayed
*/
trait RTCStatsIceCandidateType extends js.Object

object RTCStatsIceCandidateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def host: typingsSlinky.std.stdStrings.host = this.cast("host")
  @scala.inline
  def peerreflexive: typingsSlinky.std.stdStrings.peerreflexive = this.cast("peerreflexive")
  @scala.inline
  def relayed: typingsSlinky.std.stdStrings.relayed = this.cast("relayed")
  @scala.inline
  def serverreflexive: typingsSlinky.std.stdStrings.serverreflexive = this.cast("serverreflexive")
}

