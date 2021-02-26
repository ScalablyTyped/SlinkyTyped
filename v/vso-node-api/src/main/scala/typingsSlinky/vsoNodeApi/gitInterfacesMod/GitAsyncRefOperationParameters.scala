package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAsyncRefOperationParameters extends StObject {
  
  /**
    * Proposed target branch name for the cherry pick or revert operation.
    */
  var generatedRefName: String = js.native
  
  /**
    * The target branch for the cherry pick or revert operation.
    */
  var ontoRefName: String = js.native
  
  /**
    * The git repository for the cherry pick or revert operation.
    */
  var repository: GitRepository = js.native
  
  /**
    * Details about the source of the cherry pick or revert operation (e.g. A pull request or a specific commit).
    */
  var source: GitAsyncRefOperationSource = js.native
}
object GitAsyncRefOperationParameters {
  
  @scala.inline
  def apply(
    generatedRefName: String,
    ontoRefName: String,
    repository: GitRepository,
    source: GitAsyncRefOperationSource
  ): GitAsyncRefOperationParameters = {
    val __obj = js.Dynamic.literal(generatedRefName = generatedRefName.asInstanceOf[js.Any], ontoRefName = ontoRefName.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationParameters]
  }
  
  @scala.inline
  implicit class GitAsyncRefOperationParametersMutableBuilder[Self <: GitAsyncRefOperationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratedRefName(value: String): Self = StObject.set(x, "generatedRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntoRefName(value: String): Self = StObject.set(x, "ontoRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: GitAsyncRefOperationSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
