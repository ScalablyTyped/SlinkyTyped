package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledExtensionState extends StObject {
  
  /**
    * States of an installed extension
    */
  var flags: ExtensionStateFlags = js.native
  
  /**
    * List of installation issues
    */
  var installationIssues: js.Array[InstalledExtensionStateIssue] = js.native
  
  /**
    * The time at which this installation was last updated
    */
  var lastUpdated: js.Date = js.native
}
object InstalledExtensionState {
  
  @scala.inline
  def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: js.Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionState]
  }
  
  @scala.inline
  implicit class InstalledExtensionStateMutableBuilder[Self <: InstalledExtensionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: ExtensionStateFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIssues(value: js.Array[InstalledExtensionStateIssue]): Self = StObject.set(x, "installationIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIssuesVarargs(value: InstalledExtensionStateIssue*): Self = StObject.set(x, "installationIssues", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
  }
}
