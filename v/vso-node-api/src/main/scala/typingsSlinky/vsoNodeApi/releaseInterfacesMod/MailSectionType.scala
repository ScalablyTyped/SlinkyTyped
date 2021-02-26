package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MailSectionType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailSectionType with Double] = js.native
  
  @js.native
  sealed trait Details extends MailSectionType
  /* 0 */ val Details: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.Details with Double = js.native
  
  @js.native
  sealed trait Environments extends MailSectionType
  /* 1 */ val Environments: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.Environments with Double = js.native
  
  @js.native
  sealed trait Issues extends MailSectionType
  /* 2 */ val Issues: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.Issues with Double = js.native
  
  @js.native
  sealed trait ReleaseInfo extends MailSectionType
  /* 5 */ val ReleaseInfo: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.ReleaseInfo with Double = js.native
  
  @js.native
  sealed trait TestResults extends MailSectionType
  /* 3 */ val TestResults: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.TestResults with Double = js.native
  
  @js.native
  sealed trait WorkItems extends MailSectionType
  /* 4 */ val WorkItems: typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailSectionType.WorkItems with Double = js.native
}
