package typingsSlinky.umzug.mod

import typingsSlinky.mongodb.mod.Collection
import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.DefaultSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDBStorageOptions extends Storage {
  /**
    * The to be used Mongo collection cursor.
    * Defaults to collection created from collectionName attribute.
    */
  var collection: js.UndefOr[Collection[DefaultSchema]] = js.native
  /**
    * The name of the collection used by the connection.
    * Defaults to 'migrations'
    */
  var collectionName: js.UndefOr[String] = js.native
  /**
    * The MongoDB database connection instance.
    */
  var connection: js.UndefOr[Db] = js.native
}

object MongoDBStorageOptions {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit]
  ): MongoDBStorageOptions = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    __obj.asInstanceOf[MongoDBStorageOptions]
  }
  @scala.inline
  implicit class MongoDBStorageOptionsOps[Self <: MongoDBStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: Collection[DefaultSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: Db): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
  }
  
}

