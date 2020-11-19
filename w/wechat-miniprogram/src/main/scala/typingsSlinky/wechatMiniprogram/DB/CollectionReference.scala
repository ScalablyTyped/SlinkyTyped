package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.OQ
import typingsSlinky.wechatMiniprogram.anon.RQIAddDocumentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionReference extends Query {
  
  def add(options: OQ[IAddDocumentOptions]): Unit = js.native
  def add(options: RQIAddDocumentOptions): js.Promise[IAddResult] = js.native
  
  val collectionName: String = js.native
  
  def doc(docId: String): DocumentReference = js.native
  def doc(docId: Double): DocumentReference = js.native
}
