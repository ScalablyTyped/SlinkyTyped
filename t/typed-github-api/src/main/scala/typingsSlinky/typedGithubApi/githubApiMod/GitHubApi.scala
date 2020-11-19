package typingsSlinky.typedGithubApi.githubApiMod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.distOrganizationMod.OrganizationSummaryClass
import typingsSlinky.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.ownerRefMod.OwnerRef
import typingsSlinky.typedGithubApi.typedGithubApiStrings.`best match`
import typingsSlinky.typedGithubApi.typedGithubApiStrings.`private`
import typingsSlinky.typedGithubApi.typedGithubApiStrings.all
import typingsSlinky.typedGithubApi.typedGithubApiStrings.assigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.collaborator
import typingsSlinky.typedGithubApi.typedGithubApiStrings.comments
import typingsSlinky.typedGithubApi.typedGithubApiStrings.created
import typingsSlinky.typedGithubApi.typedGithubApiStrings.forks
import typingsSlinky.typedGithubApi.typedGithubApiStrings.full_name
import typingsSlinky.typedGithubApi.typedGithubApiStrings.mentioned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
import typingsSlinky.typedGithubApi.typedGithubApiStrings.organization_member
import typingsSlinky.typedGithubApi.typedGithubApiStrings.owner
import typingsSlinky.typedGithubApi.typedGithubApiStrings.public
import typingsSlinky.typedGithubApi.typedGithubApiStrings.pushed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.stars
import typingsSlinky.typedGithubApi.typedGithubApiStrings.subscribed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/github-api", "GitHubApi")
@js.native
class GitHubApi protected () extends GitHubRef {
  def this(options: OptionsOrRef) = this()
  
  /* private */ def getAllSearchPagesAsync[TApiData](uri: js.Any): js.Any = js.native
  
  /* private */ def getIssue(issue: js.Any): js.Any = js.native
  
  /**
    * @deprecated Use getOwner instead
    */
  def getOrganization(login: String): OwnerRefClass = js.native
  
  def getOwner(login: String): OwnerRef = js.native
  
  /* private */ def getRepository(repository: js.Any): js.Any = js.native
  
  /**
    * @deprecated Use getOwner instead
    */
  def getUser(login: String): OwnerRefClass = js.native
  
  def loadIssuesAsync(
    filter: js.UndefOr[assigned | created | mentioned | subscribed | all],
    state: js.UndefOr[open | closed | all],
    labels: js.UndefOr[js.Array[String]],
    sort: js.UndefOr[created | updated | comments],
    ascending: js.UndefOr[Boolean],
    updatedSince: js.UndefOr[Moment]
  ): js.Promise[js.Array[Issue]] = js.native
  
  def loadMyOrganizationsAsync(): js.Promise[js.Array[OrganizationSummaryClass]] = js.native
  
  def loadMyRepositoriesAsync(
    visibility: all | public | `private`,
    affiliation: js.UndefOr[js.Array[owner | collaborator | organization_member]],
    sort: js.UndefOr[created | updated | pushed | full_name],
    ascending: js.UndefOr[Boolean]
  ): js.Promise[js.Array[Repository]] = js.native
  
  /* private */ def searchAsync[TData, TApiData](uri: js.Any, query: js.Any, sort: js.Any, ascending: js.Any, perPage: js.Any, mapping: js.Any): js.Any = js.native
  
  /**
    * Loads issues matching search query.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of issues that match the query
    */
  def searchIssuesAsync(query: String): js.Promise[js.Array[Issue]] = js.native
  def searchIssuesAsync(
    query: String,
    sort: js.UndefOr[scala.Nothing],
    ascending: js.UndefOr[scala.Nothing],
    perPage: Double
  ): js.Promise[js.Array[Issue]] = js.native
  def searchIssuesAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  def searchIssuesAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  
  /**
    * Loads issues matching search query with a score as to how well they matched.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of issues that match the query with a score as to how well they matched
    */
  def searchIssuesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  def searchIssuesWithScoreAsync(
    query: String,
    sort: js.UndefOr[scala.Nothing],
    ascending: js.UndefOr[scala.Nothing],
    perPage: Double
  ): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  def searchIssuesWithScoreAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  def searchIssuesWithScoreAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  
  /**
    * Loads repositories matching search query.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of repositories that match the query
    */
  def searchRepositoriesAsync(query: String): js.Promise[js.Array[Repository]] = js.native
  def searchRepositoriesAsync(
    query: String,
    sort: js.UndefOr[scala.Nothing],
    ascending: js.UndefOr[scala.Nothing],
    perPage: Double
  ): js.Promise[js.Array[Repository]] = js.native
  def searchRepositoriesAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def searchRepositoriesAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  
  /**
    * Loads repositories matching search query with a score as to how well they matched.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of repositories that match the query with a score as to how well they matched
    */
  def searchRepositoriesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  def searchRepositoriesWithScoreAsync(
    query: String,
    sort: js.UndefOr[scala.Nothing],
    ascending: js.UndefOr[scala.Nothing],
    perPage: Double
  ): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  def searchRepositoriesWithScoreAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  def searchRepositoriesWithScoreAsync(query: String, sort: js.UndefOr[scala.Nothing], ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated, ascending: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
}
