package typingsSlinky.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vexdb.requestObjectsMod.TeamsRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.EventsRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.MatchesRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.RankingsRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
  - typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
*/
trait RequestObject extends js.Object

object RequestObject {
  @scala.inline
  implicit def apply(value: AwardsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: EventsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: MatchesRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: RankingsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: SeasonRankingsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: SkillsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
  @scala.inline
  implicit def apply(value: TeamsRequestObject): RequestObject = value.asInstanceOf[RequestObject]
}

