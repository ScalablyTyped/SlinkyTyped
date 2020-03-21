package typingsSlinky.webpackConfigUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.production
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.prod
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.test
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.development
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.dev
*/
trait EnvVars extends js.Object

object EnvVars {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dev: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.dev = this.cast("dev")
  @scala.inline
  def development: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.development = this.cast("development")
  @scala.inline
  def prod: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.prod = this.cast("prod")
  @scala.inline
  def production: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.production = this.cast("production")
  @scala.inline
  def test: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.test = this.cast("test")
}

