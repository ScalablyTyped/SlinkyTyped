package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region types
/**
  * Valid token scopes used as an argument to the token handler closure passed to `XRegExp.addToken`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.xregexpStrings.default
  - typingsSlinky.xregexp.xregexpStrings.`class`
*/
trait TokenScope extends js.Object
object TokenScope {
  
  @scala.inline
  def `class`: typingsSlinky.xregexp.xregexpStrings.`class` = "class".asInstanceOf[typingsSlinky.xregexp.xregexpStrings.`class`]
  
  @scala.inline
  def default: typingsSlinky.xregexp.xregexpStrings.default = "default".asInstanceOf[typingsSlinky.xregexp.xregexpStrings.default]
}
