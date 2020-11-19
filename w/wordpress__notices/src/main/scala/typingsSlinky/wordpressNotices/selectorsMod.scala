package typingsSlinky.wordpressNotices

import typingsSlinky.wordpressNotices.mod.Notice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/notices/store/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  
  def getNotices(): js.Array[Notice] = js.native
  def getNotices(context: String): js.Array[Notice] = js.native
}
