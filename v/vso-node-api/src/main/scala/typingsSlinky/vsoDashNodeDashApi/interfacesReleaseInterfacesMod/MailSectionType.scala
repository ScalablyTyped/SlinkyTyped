package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailSectionType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends js.Object {
  @js.native
  sealed trait Details extends MailSectionType
  
  @js.native
  sealed trait Environments extends MailSectionType
  
  @js.native
  sealed trait Issues extends MailSectionType
  
  @js.native
  sealed trait ReleaseInfo extends MailSectionType
  
  @js.native
  sealed trait TestResults extends MailSectionType
  
  @js.native
  sealed trait WorkItems extends MailSectionType
  
  /* 0 */ val Details: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.Details with Double = js.native
  /* 1 */ val Environments: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.Environments with Double = js.native
  /* 2 */ val Issues: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.Issues with Double = js.native
  /* 5 */ val ReleaseInfo: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.ReleaseInfo with Double = js.native
  /* 3 */ val TestResults: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.TestResults with Double = js.native
  /* 4 */ val WorkItems: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.MailSectionType.WorkItems with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailSectionType with Double] = js.native
}

