package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid features that are installable on RegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.xregexpStrings.astral
  - typingsSlinky.xregexp.xregexpStrings.namespacing
*/
trait Feature extends FeatureOptions

object Feature {
  @scala.inline
  def astral: typingsSlinky.xregexp.xregexpStrings.astral = "astral".asInstanceOf[typingsSlinky.xregexp.xregexpStrings.astral]
  @scala.inline
  def namespacing: typingsSlinky.xregexp.xregexpStrings.namespacing = "namespacing".asInstanceOf[typingsSlinky.xregexp.xregexpStrings.namespacing]
}

