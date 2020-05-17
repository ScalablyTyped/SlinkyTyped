package typingsSlinky.semanticRelease.mod

import typingsSlinky.semanticRelease.anon.Commits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object with details of the release if a release was published, or
	 * false if no release was published.
	 */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.semanticRelease.semanticReleaseBooleans.`false`
  - typingsSlinky.semanticRelease.anon.Commits
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def `false`: typingsSlinky.semanticRelease.semanticReleaseBooleans.`false` = false.asInstanceOf[typingsSlinky.semanticRelease.semanticReleaseBooleans.`false`]
  @scala.inline
  implicit def apply(value: Commits): Result = value.asInstanceOf[Result]
}

