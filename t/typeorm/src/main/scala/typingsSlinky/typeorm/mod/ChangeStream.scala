package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.ChangeStreamOptions
import typingsSlinky.typeorm.mongodbTypingsMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "ChangeStream")
@js.native
class ChangeStream protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.ChangeStream {
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typingsSlinky.typeorm.mongodbTypingsMod.Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typingsSlinky.typeorm.mongodbTypingsMod.MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(
    changeDomain: typingsSlinky.typeorm.mongodbTypingsMod.Db,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
  def this(
    changeDomain: typingsSlinky.typeorm.mongodbTypingsMod.MongoClient,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
}
