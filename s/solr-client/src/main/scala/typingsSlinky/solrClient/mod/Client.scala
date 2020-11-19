package typingsSlinky.solrClient.mod

import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  def add(docs: js.Array[js.Object]): ClientRequest = js.native
  def add(
    docs: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def add(docs: js.Array[js.Object], options: Options): ClientRequest = js.native
  def add(
    docs: js.Array[js.Object],
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def addRemoteResource(options: AddRemoteResourceOptions): ClientRequest = js.native
  def addRemoteResource(
    options: AddRemoteResourceOptions,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def atomicUpdate(doc: js.Object): ClientRequest = js.native
  def atomicUpdate(doc: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def basicAuth(username: String, password: String): Client = js.native
  
  def commit(): ClientRequest = js.native
  def commit(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def commit(options: Options): ClientRequest = js.native
  def commit(options: Options, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def delete(field: String, text: String): ClientRequest = js.native
  def delete(
    field: String,
    text: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def delete(field: String, text: String, options: Options): ClientRequest = js.native
  def delete(
    field: String,
    text: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def deleteAll(): ClientRequest = js.native
  def deleteAll(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteAll(options: Options): ClientRequest = js.native
  def deleteAll(options: Options, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def deleteByID(id: String): ClientRequest = js.native
  def deleteByID(
    id: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByID(id: String, options: Options): ClientRequest = js.native
  def deleteByID(
    id: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByID(id: Double): ClientRequest = js.native
  def deleteByID(
    id: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByID(id: Double, options: Options): ClientRequest = js.native
  def deleteByID(
    id: Double,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def deleteByQuery(query: String): ClientRequest = js.native
  def deleteByQuery(
    query: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByQuery(query: String, options: Options): ClientRequest = js.native
  def deleteByQuery(
    query: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def deleteByRange(field: String, start: String, stop: String): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: String,
    stop: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: String, stop: String, options: js.Object): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: String,
    stop: String,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: String, stop: js.Date): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: String,
    stop: js.Date,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: String, stop: js.Date, options: js.Object): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: String,
    stop: js.Date,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: js.Date, stop: String): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: js.Date,
    stop: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: js.Date, stop: String, options: js.Object): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: js.Date,
    stop: String,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: js.Date, stop: js.Date): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: js.Date,
    stop: js.Date,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def deleteByRange(field: String, start: js.Date, stop: js.Date, options: js.Object): ClientRequest = js.native
  def deleteByRange(
    field: String,
    start: js.Date,
    stop: js.Date,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def escapeSpecialChars(s: String): String = js.native
  
  def executeCollection(collection: String): ClientRequest = js.native
  def executeCollection(collection: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  def executeCollection(collection: js.Object): ClientRequest = js.native
  def executeCollection(collection: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  def executeCollection(collection: Query): ClientRequest = js.native
  def executeCollection(collection: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def get(handler: String, query: String): ClientRequest = js.native
  def get(
    handler: String,
    query: String,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def get(handler: String, query: js.Object): ClientRequest = js.native
  def get(
    handler: String,
    query: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def get(handler: String, query: Query): ClientRequest = js.native
  def get(
    handler: String,
    query: Query,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def optimize(options: js.Object): ClientRequest = js.native
  def optimize(options: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def post(handler: String, query: String): ClientRequest = js.native
  def post(
    handler: String,
    query: String,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def post(handler: String, query: js.Object): ClientRequest = js.native
  def post(
    handler: String,
    query: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def post(handler: String, query: Query): ClientRequest = js.native
  def post(
    handler: String,
    query: Query,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def prepareCommit(): ClientRequest = js.native
  def prepareCommit(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def query(): Query = js.native
  
  def realTimeGet(ids: String): ClientRequest = js.native
  def realTimeGet(
    ids: String,
    query: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def realTimeGet(ids: String, query: Query): ClientRequest = js.native
  def realTimeGet(ids: String, query: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  def realTimeGet(ids: js.Array[String]): ClientRequest = js.native
  def realTimeGet(
    ids: js.Array[String],
    query: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def realTimeGet(ids: js.Array[String], query: Query): ClientRequest = js.native
  def realTimeGet(
    ids: js.Array[String],
    query: Query,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  
  def rollback(): ClientRequest = js.native
  def rollback(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def search(query: Query): ClientRequest = js.native
  def search(query: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def searchAll(): ClientRequest = js.native
  def searchAll(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def searchAsync(query: Query): js.Promise[js.Object] = js.native
  
  def softCommit(): ClientRequest = js.native
  def softCommit(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
  
  def unauth(): Client = js.native
  
  def update(data: js.Object): ClientRequest = js.native
  def update(
    data: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
  def update(data: js.Object, options: js.Object): ClientRequest = js.native
  def update(
    data: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
  ): ClientRequest = js.native
}
