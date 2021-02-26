package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestQuery extends StObject {
  
  /**
    * The queries to perform.
    */
  var queries: js.Array[GitPullRequestQueryInput] = js.native
  
  /**
    * The results of the queries. This matches the QueryInputs list so Results[n] are the results of QueryInputs[n]. Each entry in the list is a dictionary of commit->pull requests.
    */
  var results: js.Array[StringDictionary[js.Array[GitPullRequest]]] = js.native
}
object GitPullRequestQuery {
  
  @scala.inline
  def apply(
    queries: js.Array[GitPullRequestQueryInput],
    results: js.Array[StringDictionary[js.Array[GitPullRequest]]]
  ): GitPullRequestQuery = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestQuery]
  }
  
  @scala.inline
  implicit class GitPullRequestQueryMutableBuilder[Self <: GitPullRequestQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueries(value: js.Array[GitPullRequestQueryInput]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: GitPullRequestQueryInput*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[StringDictionary[js.Array[GitPullRequest]]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: StringDictionary[js.Array[GitPullRequest]]*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
