package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportRepositoryValidation extends StObject {
  
  var gitSource: GitImportGitSource = js.native
  
  var password: String = js.native
  
  var tfvcSource: GitImportTfvcSource = js.native
  
  var username: String = js.native
}
object ImportRepositoryValidation {
  
  @scala.inline
  def apply(gitSource: GitImportGitSource, password: String, tfvcSource: GitImportTfvcSource, username: String): ImportRepositoryValidation = {
    val __obj = js.Dynamic.literal(gitSource = gitSource.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportRepositoryValidation]
  }
  
  @scala.inline
  implicit class ImportRepositoryValidationMutableBuilder[Self <: ImportRepositoryValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGitSource(value: GitImportGitSource): Self = StObject.set(x, "gitSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvcSource(value: GitImportTfvcSource): Self = StObject.set(x, "tfvcSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
