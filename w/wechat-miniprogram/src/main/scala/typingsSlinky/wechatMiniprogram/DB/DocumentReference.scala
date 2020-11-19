package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.OQ
import typingsSlinky.wechatMiniprogram.anon.RQIGetDocumentOptions
import typingsSlinky.wechatMiniprogram.anon.RQIRemoveSingleDocumentOp
import typingsSlinky.wechatMiniprogram.anon.RQISetSingleDocumentOptio
import typingsSlinky.wechatMiniprogram.anon.RQIUpdateSingleDocumentOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference extends js.Object {
  
  def field(`object`: js.Object): this.type = js.native
  
  def get(): js.Promise[IQuerySingleResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): js.Promise[IQuerySingleResult] = js.native
  
  def remove(): js.Promise[IRemoveResult] = js.native
  def remove(options: OQ[IRemoveSingleDocumentOptions]): Unit = js.native
  def remove(options: RQIRemoveSingleDocumentOp): js.Promise[IRemoveResult] = js.native
  
  def set(): js.Promise[ISetResult] = js.native
  def set(options: OQ[ISetSingleDocumentOptions]): Unit = js.native
  def set(options: RQISetSingleDocumentOptio): js.Promise[ISetResult] = js.native
  
  def update(): js.Promise[IUpdateResult] = js.native
  def update(options: OQ[IUpdateSingleDocumentOptions]): Unit = js.native
  def update(options: RQIUpdateSingleDocumentOp): js.Promise[IUpdateResult] = js.native
  
  def watch(options: IWatchOptions): RealtimeListener = js.native
}
