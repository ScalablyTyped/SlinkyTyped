package typingsSlinky.winrt.global.Windows

import typingsSlinky.winrt.Windows.Management.Core.IApplicationDataManager
import typingsSlinky.winrt.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management")
@js.native
object Management extends js.Object {
  @js.native
  object Core extends js.Object {
    @js.native
    class ApplicationDataManager () extends IApplicationDataManager
    
    /* static members */
    @js.native
    object ApplicationDataManager extends js.Object {
      def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
    }
    
  }
  
  @js.native
  object Deployment extends js.Object {
    @js.native
    class DeploymentResult ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.DeploymentResult
    
    @js.native
    class PackageManager ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.PackageManager
    
    @js.native
    class PackageUserInformation ()
      extends typingsSlinky.winrt.Windows.Management.Deployment.PackageUserInformation
    
    @js.native
    object DeploymentOptions extends js.Object {
      /* 2 */ val developmentMode: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
      /* 1 */ val forceApplicationShutdown: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
      /* 0 */ val none: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Management.Deployment.DeploymentOptions with Double] = js.native
    }
    
    @js.native
    object DeploymentProgressState extends js.Object {
      /* 1 */ val processing: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
      /* 0 */ val queued: typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Management.Deployment.DeploymentProgressState with Double
          ] = js.native
    }
    
    @js.native
    object PackageInstallState extends js.Object {
      /* 2 */ val installed: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
      /* 0 */ val notInstalled: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
      /* 1 */ val staged: typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.Management.Deployment.PackageInstallState with Double
          ] = js.native
    }
    
    @js.native
    object PackageState extends js.Object {
      /* 1 */ val licenseInvalid: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
      /* 2 */ val modified: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.modified with Double = js.native
      /* 0 */ val normal: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.normal with Double = js.native
      /* 3 */ val tampered: typingsSlinky.winrt.Windows.Management.Deployment.PackageState.tampered with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Management.Deployment.PackageState with Double] = js.native
    }
    
  }
  
}

