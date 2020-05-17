package typingsSlinky.typedGithubApi.githubRefMod

import typingsSlinky.typedGithubApi.apiFetchMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGithubApi.apiFetchMod.Options
  - typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
*/
trait OptionsOrRef extends js.Object

object OptionsOrRef {
  @scala.inline
  implicit def apply(value: GitHubRef): OptionsOrRef = value.asInstanceOf[OptionsOrRef]
  @scala.inline
  implicit def apply(value: Options): OptionsOrRef = value.asInstanceOf[OptionsOrRef]
}

