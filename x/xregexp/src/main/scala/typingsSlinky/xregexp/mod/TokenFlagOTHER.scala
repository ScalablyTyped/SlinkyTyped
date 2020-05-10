package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid non-letter and non-number characters that can be used as a flag for when adding a new token to XRegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.xregexpStrings._underscore
  - typingsSlinky.xregexp.xregexpStrings.$
*/
trait TokenFlagOTHER extends js.Object

object TokenFlagOTHER {
  @scala.inline
  def $: typingsSlinky.xregexp.xregexpStrings.$ = "$".asInstanceOf[typingsSlinky.xregexp.xregexpStrings.$]
  @scala.inline
  def _underscore: typingsSlinky.xregexp.xregexpStrings._underscore = "_".asInstanceOf[typingsSlinky.xregexp.xregexpStrings._underscore]
}

