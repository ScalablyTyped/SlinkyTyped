package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfficeVersion extends StObject {
  
  var assemblyVersion: String = js.native
  
  var majorBuildVersion: Double = js.native
  
  var majorVersion: String = js.native
  
  var majorVersionDotZero: String = js.native
  
  var previousMajorBuildVersion: Double = js.native
  
  var previousVersion: String = js.native
  
  var previousVersionDotZero: String = js.native
  
  var wssMajorVersion: String = js.native
}
object OfficeVersion {
  
  @scala.inline
  def apply(
    assemblyVersion: String,
    majorBuildVersion: Double,
    majorVersion: String,
    majorVersionDotZero: String,
    previousMajorBuildVersion: Double,
    previousVersion: String,
    previousVersionDotZero: String,
    wssMajorVersion: String
  ): OfficeVersion = {
    val __obj = js.Dynamic.literal(assemblyVersion = assemblyVersion.asInstanceOf[js.Any], majorBuildVersion = majorBuildVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], majorVersionDotZero = majorVersionDotZero.asInstanceOf[js.Any], previousMajorBuildVersion = previousMajorBuildVersion.asInstanceOf[js.Any], previousVersion = previousVersion.asInstanceOf[js.Any], previousVersionDotZero = previousVersionDotZero.asInstanceOf[js.Any], wssMajorVersion = wssMajorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeVersion]
  }
  
  @scala.inline
  implicit class OfficeVersionMutableBuilder[Self <: OfficeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssemblyVersion(value: String): Self = StObject.set(x, "assemblyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorBuildVersion(value: Double): Self = StObject.set(x, "majorBuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersionDotZero(value: String): Self = StObject.set(x, "majorVersionDotZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMajorBuildVersion(value: Double): Self = StObject.set(x, "previousMajorBuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousVersionDotZero(value: String): Self = StObject.set(x, "previousVersionDotZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWssMajorVersion(value: String): Self = StObject.set(x, "wssMajorVersion", value.asInstanceOf[js.Any])
  }
}
