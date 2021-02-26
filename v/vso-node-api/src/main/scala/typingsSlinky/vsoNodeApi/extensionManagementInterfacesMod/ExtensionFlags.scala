package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionFlags extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionFlags")
@js.native
object ExtensionFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionFlags with Double] = js.native
  
  /**
    * A built-in extension is installed for all VSTS accounts by default
    */
  @js.native
  sealed trait BuiltIn extends ExtensionFlags
  /* 1 */ val BuiltIn: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionFlags.BuiltIn with Double = js.native
  
  /**
    * The extension comes from a fully-trusted publisher
    */
  @js.native
  sealed trait Trusted extends ExtensionFlags
  /* 2 */ val Trusted: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionFlags.Trusted with Double = js.native
}
