package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.Collection
import typingsSlinky.typeorm.mongodbTypingsMod.GridFSBucketReadStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "GridFSBucketReadStream")
@js.native
class GridFSBucketReadStream protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.GridFSBucketReadStream {
  /**
    *
    * @param chunks Handle for chunks collection.
    * @param files Handle for files collection.
    * @param readPreference The read preference to use.
    * @param filter The query to use to find the file document.
    * @param options Optional settings.
    */
  def this(chunks: Collection[_], files: Collection[_], readPreference: js.Object, filter: js.Object) = this()
  def this(
    chunks: Collection[_],
    files: Collection[_],
    readPreference: js.Object,
    filter: js.Object,
    options: GridFSBucketReadStreamOptions
  ) = this()
}
