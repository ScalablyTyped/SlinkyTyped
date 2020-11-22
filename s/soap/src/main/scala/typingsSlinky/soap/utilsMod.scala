package typingsSlinky.soap

import typingsSlinky.soap.anon.Name
import typingsSlinky.soap.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val TNS_PREFIX: /* "__tns__" */ String = js.native
  
  def findPrefix(xmlnsMapping: js.Any, nsURI: js.Any): String = js.native
  
  def passwordDigest(nonce: String, created: String, password: String): String = js.native
  
  def splitQName[T](nsName: T): Name[T] | Prefix = js.native
  
  def xmlEscape(obj: js.Any): js.Any = js.native
}
