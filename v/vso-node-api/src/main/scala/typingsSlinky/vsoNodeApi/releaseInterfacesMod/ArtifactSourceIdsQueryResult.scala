package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSourceIdsQueryResult extends StObject {
  
  var artifactSourceIds: js.Array[ArtifactSourceId] = js.native
}
object ArtifactSourceIdsQueryResult {
  
  @scala.inline
  def apply(artifactSourceIds: js.Array[ArtifactSourceId]): ArtifactSourceIdsQueryResult = {
    val __obj = js.Dynamic.literal(artifactSourceIds = artifactSourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceIdsQueryResult]
  }
  
  @scala.inline
  implicit class ArtifactSourceIdsQueryResultMutableBuilder[Self <: ArtifactSourceIdsQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactSourceIds(value: js.Array[ArtifactSourceId]): Self = StObject.set(x, "artifactSourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactSourceIdsVarargs(value: ArtifactSourceId*): Self = StObject.set(x, "artifactSourceIds", js.Array(value :_*))
  }
}
