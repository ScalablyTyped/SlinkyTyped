package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstalledExtensionStateIssueType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "InstalledExtensionStateIssueType")
@js.native
object InstalledExtensionStateIssueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstalledExtensionStateIssueType with Double] = js.native
  
  /**
    * Represents an installation error, for example an explicit demand not supported
    */
  @js.native
  sealed trait Error extends InstalledExtensionStateIssueType
  /* 1 */ val Error: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionStateIssueType.Error with Double = js.native
  
  /**
    * Represents an installation warning, for example an implicit demand not supported
    */
  @js.native
  sealed trait Warning extends InstalledExtensionStateIssueType
  /* 0 */ val Warning: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionStateIssueType.Warning with Double = js.native
}
