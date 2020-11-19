package typingsSlinky.seamlessImmutable.mod.ImmutableArray

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.seamlessImmutable.mod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Merging this into Overrides breaks stuff, so this is split out */
@js.native
trait ReadOnlyIndexer[T]
  extends /* key */ NumberDictionary[Immutable[T, js.Object]]
object ReadOnlyIndexer {
  
  @scala.inline
  def apply[T](): ReadOnlyIndexer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnlyIndexer[T]]
  }
}
