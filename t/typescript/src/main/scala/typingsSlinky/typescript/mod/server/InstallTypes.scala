package typingsSlinky.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallTypes extends ProjectResponse {
  
  val eventId: Double = js.native
  
  @JSName("kind")
  val kind_InstallTypes: EventBeginInstallTypes | EventEndInstallTypes = js.native
  
  val packagesToInstall: js.Array[String] = js.native
  
  val typingsInstallerVersion: String = js.native
}
object InstallTypes {
  
  @scala.inline
  def apply(
    eventId: Double,
    kind: EventBeginInstallTypes | EventEndInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): InstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallTypes]
  }
  
  @scala.inline
  implicit class InstallTypesMutableBuilder[Self <: InstallTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: EventBeginInstallTypes | EventEndInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesToInstall(value: js.Array[String]): Self = StObject.set(x, "packagesToInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesToInstallVarargs(value: String*): Self = StObject.set(x, "packagesToInstall", js.Array(value :_*))
    
    @scala.inline
    def setTypingsInstallerVersion(value: String): Self = StObject.set(x, "typingsInstallerVersion", value.asInstanceOf[js.Any])
  }
}
