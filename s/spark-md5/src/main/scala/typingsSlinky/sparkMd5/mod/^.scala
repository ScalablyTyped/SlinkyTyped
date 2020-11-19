package typingsSlinky.sparkMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("spark-md5", JSImport.Namespace)
@js.native
class ^ () extends SparkMD5
@JSImport("spark-md5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def hash(str: String): String = js.native
  def hash(str: String, raw: Boolean): String = js.native
  
  def hashBinary(content: String): String = js.native
  def hashBinary(content: String, raw: Boolean): String = js.native
}
