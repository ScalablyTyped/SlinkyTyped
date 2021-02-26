package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.apiFetchMod.Options
import typingsSlinky.typedGithubApi.apiFetchMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object githubRefMod {
  
  @JSImport("typed-github-api/dist/github-ref", "GitHubRef")
  @js.native
  class GitHubRef protected () extends OptionsOrRef {
    protected def this(options: OptionsOrRef) = this()
    
    def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
    
    def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    
    def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    
    val options: Options = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedGithubApi.apiFetchMod.Options
    - typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
  */
  trait OptionsOrRef extends StObject
}
