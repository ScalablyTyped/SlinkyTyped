package typingsSlinky.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vexdb.responseObjectsMod.TeamsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.EventsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.MatchesResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.RankingsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.SeasonRankingsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.AwardsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.SkillsResponseObject
*/
trait ResponseObject extends js.Object

object ResponseObject {
  @scala.inline
  implicit def apply(value: AwardsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: EventsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: MatchesResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: RankingsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: SeasonRankingsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: SkillsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
  @scala.inline
  implicit def apply(value: TeamsResponseObject): ResponseObject = value.asInstanceOf[ResponseObject]
}

