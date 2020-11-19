package typingsSlinky.wordwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In "soft" mode, split chunks by `/(\S+\s+/` and don't break up chunks
  * which are longer than `stop - start`, in "hard" mode, split chunks with
  * `/\b/` and break up chunks longer than `stop - start`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordwrap.wordwrapStrings.soft
  - typingsSlinky.wordwrap.wordwrapStrings.hard
*/
trait Mode extends js.Object
object Mode {
  
  @scala.inline
  def hard: typingsSlinky.wordwrap.wordwrapStrings.hard = "hard".asInstanceOf[typingsSlinky.wordwrap.wordwrapStrings.hard]
  
  @scala.inline
  def soft: typingsSlinky.wordwrap.wordwrapStrings.soft = "soft".asInstanceOf[typingsSlinky.wordwrap.wordwrapStrings.soft]
}
