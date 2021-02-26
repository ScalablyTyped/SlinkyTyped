package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildReportMetadata extends StObject {
  
  /**
    * The Id of the build.
    */
  var buildId: Double = js.native
  
  /**
    * The content of the report.
    */
  var content: String = js.native
  
  /**
    * The type of the report.
    */
  var `type`: String = js.native
}
object BuildReportMetadata {
  
  @scala.inline
  def apply(buildId: Double, content: String, `type`: String): BuildReportMetadata = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReportMetadata]
  }
  
  @scala.inline
  implicit class BuildReportMetadataMutableBuilder[Self <: BuildReportMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
