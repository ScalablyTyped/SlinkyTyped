package typingsSlinky.winrt.global.Windows

import typingsSlinky.winrt.Windows.Management.Core.IApplicationDataManager
import typingsSlinky.winrt.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  object Core {
    
    @JSGlobal("Windows.Management.Core.ApplicationDataManager")
    @js.native
    class ApplicationDataManager () extends IApplicationDataManager
    /* static members */
    object ApplicationDataManager {
      
      @JSGlobal("Windows.Management.Core.ApplicationDataManager.createForPackageFamily")
      @js.native
      def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
    }
  }
  
  object Deployment {
    
    @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
    @js.native
    object DeploymentOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions with Double] = js.native
      
      /* 2 */ val developmentMode: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
      
      /* 1 */ val forceApplicationShutdown: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
      
      /* 0 */ val none: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
    @js.native
    object DeploymentProgressState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState with Double
          ] = js.native
      
      /* 1 */ val processing: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
      
      /* 0 */ val queued: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentResult")
    @js.native
    class DeploymentResult ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.DeploymentResult
    
    @JSGlobal("Windows.Management.Deployment.PackageInstallState")
    @js.native
    object PackageInstallState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState with Double
          ] = js.native
      
      /* 2 */ val installed: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
      
      /* 0 */ val notInstalled: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
      
      /* 1 */ val staged: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageManager")
    @js.native
    class PackageManager ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.PackageManager
    
    @JSGlobal("Windows.Management.Deployment.PackageState")
    @js.native
    object PackageState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Management.Deployment.PackageState with Double] = js.native
      
      /* 1 */ val licenseInvalid: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
      
      /* 2 */ val modified: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.modified with Double = js.native
      
      /* 0 */ val normal: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.normal with Double = js.native
      
      /* 3 */ val tampered: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.tampered with Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageUserInformation")
    @js.native
    class PackageUserInformation ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.PackageUserInformation
  }
}
