package typingsSlinky.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexerOption extends js.Object
@JSGlobal("Windows.Storage.Search.IndexerOption")
@js.native
object IndexerOption extends js.Object {
  
  @js.native
  sealed trait doNotUseIndexer extends IndexerOption
  
  @js.native
  sealed trait onlyUseIndexer extends IndexerOption
  
  @js.native
  sealed trait useIndexerWhenAvailable extends IndexerOption
}
