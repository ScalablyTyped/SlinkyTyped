package typingsSlinky.typedGithubApi.apiFetchMod

import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.typedGithubApiStrings.`thor-preview`
import typingsSlinky.typedGithubApi.typedGithubApiStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends OptionsOrRef {
  var oAuthToken: js.UndefOr[String] = js.undefined
  var userAgent: String
  var version: js.UndefOr[v3 | `thor-preview`] = js.undefined
}

object Options {
  @scala.inline
  def apply(userAgent: String, oAuthToken: String = null, version: v3 | `thor-preview` = null): Options = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    if (oAuthToken != null) __obj.updateDynamic("oAuthToken")(oAuthToken.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

