package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType with Double] = js.native
  
  @js.native
  sealed trait ActionRequired extends ExtensionUpdateType
  /* 6 */ val ActionRequired: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionRequired with Double = js.native
  
  @js.native
  sealed trait ActionResolved extends ExtensionUpdateType
  /* 7 */ val ActionResolved: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionResolved with Double = js.native
  
  @js.native
  sealed trait Disabled extends ExtensionUpdateType
  /* 4 */ val Disabled: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Disabled with Double = js.native
  
  @js.native
  sealed trait Enabled extends ExtensionUpdateType
  /* 3 */ val Enabled: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Enabled with Double = js.native
  
  @js.native
  sealed trait Installed extends ExtensionUpdateType
  /* 1 */ val Installed: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Installed with Double = js.native
  
  @js.native
  sealed trait Uninstalled extends ExtensionUpdateType
  /* 2 */ val Uninstalled: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Uninstalled with Double = js.native
  
  @js.native
  sealed trait VersionUpdated extends ExtensionUpdateType
  /* 5 */ val VersionUpdated: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.VersionUpdated with Double = js.native
}
