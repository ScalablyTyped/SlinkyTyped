package typingsSlinky.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnorderedBulkOperation extends js.Object {
  
  /**
    * Execute the ordered bulk operation.
    * @param options optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/UnorderedBulkOperation.html#execute
    */
  def execute(): js.Promise[BulkWriteResult] = js.native
  /**
    * Execute the ordered bulk operation.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/UnorderedBulkOperation.html#execute
    */
  def execute(callback: MongoCallback[BulkWriteResult]): Unit = js.native
  def execute(options: FSyncOptions): js.Promise[BulkWriteResult] = js.native
  /**
    * Execute the ordered bulk operation.
    * @param options Optional settings.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/UnorderedBulkOperation.html#execute
    */
  def execute(options: FSyncOptions, callback: MongoCallback[BulkWriteResult]): Unit = js.native
  
  /**
    * Initiate a find operation for an update/updateOne/remove/removeOne/replaceOne.
    * @param selector The selector for the bulk operation.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/UnorderedBulkOperation.html#find
    */
  def find(selector: js.Object): FindOperatorsUnordered = js.native
  
  /**
    * Add a single insert document to the bulk operation.
    * @param doc The document to insert.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/UnorderedBulkOperation.html#insert
    */
  def insert(doc: js.Object): UnorderedBulkOperation = js.native
  
  /**
    * Get the number of operations in the bulk.
    */
  var length: scala.Double = js.native
}
