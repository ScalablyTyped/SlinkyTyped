package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSource extends StObject {
  
  @JSName("package")
  var _package: scala.Double = js.native
  
  var artifactSource: scala.Double = js.native
  
  var containerImage: scala.Double = js.native
  
  var pullRequest: scala.Double = js.native
  
  var schedule: scala.Double = js.native
  
  var sourceRepo: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object ArtifactSource {
  
  @scala.inline
  def apply(
    _package: scala.Double,
    artifactSource: scala.Double,
    containerImage: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
  
  @scala.inline
  implicit class ArtifactSourceMutableBuilder[Self <: ArtifactSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactSource(value: scala.Double): Self = StObject.set(x, "artifactSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImage(value: scala.Double): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequest(value: scala.Double): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: scala.Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepo(value: scala.Double): Self = StObject.set(x, "sourceRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: scala.Double): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
