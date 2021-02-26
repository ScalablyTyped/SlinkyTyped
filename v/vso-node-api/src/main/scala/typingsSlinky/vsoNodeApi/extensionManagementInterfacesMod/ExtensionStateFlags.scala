package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStateFlags extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionStateFlags")
@js.native
object ExtensionStateFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStateFlags with Double] = js.native
  
  /**
    * Error performing auto-upgrade. For example, if the new version has demands not supported the extension cannot be auto-upgraded.
    */
  @js.native
  sealed trait AutoUpgradeError extends ExtensionStateFlags
  /* 256 */ val AutoUpgradeError: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.AutoUpgradeError with Double = js.native
  
  /**
    * Extension is a built in
    */
  @js.native
  sealed trait BuiltIn extends ExtensionStateFlags
  /* 2 */ val BuiltIn: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.BuiltIn with Double = js.native
  
  /**
    * Extension is disabled
    */
  @js.native
  sealed trait Disabled extends ExtensionStateFlags
  /* 1 */ val Disabled: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Disabled with Double = js.native
  
  /**
    * Extension is currently in an error state
    */
  @js.native
  sealed trait Error extends ExtensionStateFlags
  /* 64 */ val Error: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Error with Double = js.native
  
  /**
    * Extension has multiple versions
    */
  @js.native
  sealed trait MultiVersion extends ExtensionStateFlags
  /* 4 */ val MultiVersion: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.MultiVersion with Double = js.native
  
  /**
    * Extension scopes have changed and the extension requires re-authorization
    */
  @js.native
  sealed trait NeedsReauthorization extends ExtensionStateFlags
  /* 128 */ val NeedsReauthorization: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.NeedsReauthorization with Double = js.native
  
  /**
    * No flags set
    */
  @js.native
  sealed trait None extends ExtensionStateFlags
  /* 0 */ val None: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.None with Double = js.native
  
  /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
  @js.native
  sealed trait Trusted extends ExtensionStateFlags
  /* 32 */ val Trusted: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Trusted with Double = js.native
  
  /**
    * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
    */
  @js.native
  sealed trait UnInstalled extends ExtensionStateFlags
  /* 8 */ val UnInstalled: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.UnInstalled with Double = js.native
  
  /**
    * Error performing version check
    */
  @js.native
  sealed trait VersionCheckError extends ExtensionStateFlags
  /* 16 */ val VersionCheckError: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.VersionCheckError with Double = js.native
  
  /**
    * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
    */
  @js.native
  sealed trait Warning extends ExtensionStateFlags
  /* 512 */ val Warning: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Warning with Double = js.native
}
