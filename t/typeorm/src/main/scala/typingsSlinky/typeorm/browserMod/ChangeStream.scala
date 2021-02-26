package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.typingsMod.ChangeStreamOptions
import typingsSlinky.typeorm.typingsMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ChangeStream")
@js.native
class ChangeStream protected ()
  extends typingsSlinky.typeorm.typingsMod.ChangeStream {
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typingsSlinky.typeorm.typingsMod.Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typingsSlinky.typeorm.typingsMod.MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(
    changeDomain: typingsSlinky.typeorm.typingsMod.Db,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
  def this(
    changeDomain: typingsSlinky.typeorm.typingsMod.MongoClient,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
}
