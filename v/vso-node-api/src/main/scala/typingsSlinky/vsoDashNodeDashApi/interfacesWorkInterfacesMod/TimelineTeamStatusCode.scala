package typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineTeamStatusCode extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineTeamStatusCode")
@js.native
object TimelineTeamStatusCode extends js.Object {
  /**
    * Backlog does not exist or is missing crucial information.
    */
  @js.native
  sealed trait BacklogInError extends TimelineTeamStatusCode
  
  /**
    * Team does not exist or access is denied.
    */
  @js.native
  sealed trait DoesntExistOrAccessDenied extends TimelineTeamStatusCode
  
  /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamFieldsExceeded extends TimelineTeamStatusCode
  
  /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamsExceeded extends TimelineTeamStatusCode
  
  /**
    * Team field value is not set for this team. No team data will be returned for this team
    */
  @js.native
  sealed trait MissingTeamFieldValue extends TimelineTeamStatusCode
  
  /**
    * Team does not have a single iteration with date range.
    */
  @js.native
  sealed trait NoIterationsExist extends TimelineTeamStatusCode
  
  /**
    * No error - all data for team is good.
    */
  @js.native
  sealed trait OK extends TimelineTeamStatusCode
  
  /* 4 */ val BacklogInError: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.BacklogInError with Double = js.native
  /* 1 */ val DoesntExistOrAccessDenied: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.DoesntExistOrAccessDenied with Double = js.native
  /* 3 */ val MaxTeamFieldsExceeded: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamFieldsExceeded with Double = js.native
  /* 2 */ val MaxTeamsExceeded: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamsExceeded with Double = js.native
  /* 5 */ val MissingTeamFieldValue: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MissingTeamFieldValue with Double = js.native
  /* 6 */ val NoIterationsExist: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.NoIterationsExist with Double = js.native
  /* 0 */ val OK: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.OK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineTeamStatusCode with Double] = js.native
}

