package typingsSlinky.webpackBugsnagPlugins.anon

import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`bitbucket-server`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`github-enterprise`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`gitlab-onpremise`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.bitbucket
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.github
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.gitlab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  /**
    *  The source control provider.
    */
  var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server` = js.native
  /**
    * A URL (git/ssh/https) pointing to the repository, or webpage representing
    * the repository
    */
  var repository: String = js.native
  /**
    * The unique identifier for the commit (e.g. git SHA)
    */
  var revision: String = js.native
}

object Provider {
  @scala.inline
  def apply(
    provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
    repository: String,
    revision: String
  ): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

