package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactFilter extends StObject {
  
  var sourceBranch: String = js.native
  
  var tags: js.Array[String] = js.native
  
  var useBuildDefinitionBranch: Boolean = js.native
}
object ArtifactFilter {
  
  @scala.inline
  def apply(sourceBranch: String, tags: js.Array[String], useBuildDefinitionBranch: Boolean): ArtifactFilter = {
    val __obj = js.Dynamic.literal(sourceBranch = sourceBranch.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], useBuildDefinitionBranch = useBuildDefinitionBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
  
  @scala.inline
  implicit class ArtifactFilterMutableBuilder[Self <: ArtifactFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceBranch(value: String): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUseBuildDefinitionBranch(value: Boolean): Self = StObject.set(x, "useBuildDefinitionBranch", value.asInstanceOf[js.Any])
  }
}
