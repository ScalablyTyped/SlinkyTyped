package typingsSlinky.wildstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wildstring", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var caseSensitive: Boolean = js.native
  
  def `match`(pattern: String, string: String): Boolean = js.native
  
  def replace(pattern: String, strings: String): String = js.native
  def replace(pattern: String, strings: js.Array[String]): String = js.native
  
  var wildcard: String = js.native
}
