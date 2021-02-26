package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.GridFSBucketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "GridFSBucket")
@js.native
class GridFSBucket protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.GridFSBucket {
  /**
    *
    * @param db A db handle.
    * @param options Optional settings.
    */
  def this(db: typingsSlinky.typeorm.mongodbTypingsMod.Db) = this()
  def this(db: typingsSlinky.typeorm.mongodbTypingsMod.Db, options: GridFSBucketOptions) = this()
}
