package typingsSlinky.ydnDb.global.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ydn.db.IndexValueIterator")
@js.native
class IndexValueIterator protected ()
  extends typingsSlinky.ydnDb.ydn.db.Iterator {
  def this(store_name: String, index_name: String) = this()
  def this(store_name: String, index_name: String, key_range: js.Any) = this()
  def this(store_name: String, index_name: String, key_range: js.UndefOr[scala.Nothing], reverse: Boolean) = this()
  def this(store_name: String, index_name: String, key_range: js.Any, reverse: Boolean) = this()
}
/* static members */
@JSGlobal("ydn.db.IndexValueIterator")
@js.native
object IndexValueIterator extends js.Object {
  
  def where(
    store_name: String,
    index_name: String,
    op: typingsSlinky.ydnDb.ydn.db.Op,
    value: js.Any,
    op2: typingsSlinky.ydnDb.ydn.db.Op,
    value2: js.Any
  ): js.Any = js.native
}
