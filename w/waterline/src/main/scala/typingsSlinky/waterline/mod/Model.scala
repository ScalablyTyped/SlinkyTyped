package typingsSlinky.waterline.mod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends ModelInstance {
  
  def count(criteria: js.Any): WaterlinePromise[Double] = js.native
  def count(criteria: js.Array[_]): WaterlinePromise[Double] = js.native
  
  def create(params: js.Any): CRUDBuilder[_] = js.native
  def create(params: js.Any, cb: Callback[_]): CRUDBuilder[_] = js.native
  def create(params: js.Array[_]): CRUDBuilder[js.Array[_]] = js.native
  def create(params: js.Array[_], cb: Callback[_]): CRUDBuilder[js.Array[_]] = js.native
  
  def createEach(params: js.Array[_]): CRUDBuilder[js.Array[_]] = js.native
  def createEach(params: js.Array[_], cb: Callback[_]): CRUDBuilder[js.Array[_]] = js.native
  
  def destroy(criteria: js.Any): CRUDBuilder[js.Array[_]] = js.native
  def destroy(criteria: js.Any, cb: Callback[_]): CRUDBuilder[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_]): CRUDBuilder[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_], cb: Callback[js.Array[_]]): CRUDBuilder[js.Array[_]] = js.native
  
  def destroyOne(criteria: js.Any): CRUDBuilder[_] = js.native
  def destroyOne(criteria: js.Any, cb: Callback[_]): CRUDBuilder[_] = js.native
  
  def find(): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.UndefOr[scala.Nothing], cb: Callback[js.Array[_]]): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any, cb: Callback[js.Array[_]]): QueryBuilder[js.Array[_]] = js.native
  
  def findOne(): QueryBuilder[_] = js.native
  def findOne(criteria: js.UndefOr[scala.Nothing], cb: Callback[_]): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  
  def findOrCreate(): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.UndefOr[scala.Nothing], values: js.UndefOr[scala.Nothing], cb: Callback[_]): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.UndefOr[scala.Nothing], values: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.UndefOr[scala.Nothing], values: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.UndefOr[scala.Nothing], cb: Callback[_]): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  
  def native(cb: js.Function2[/* err */ js.Error, /* collection */ js.Any, Unit]): Unit = js.native
  
  def query(sqlQuery: String, cb: Callback[_]): Unit = js.native
  def query(sqlQuery: String, data: js.Any, cb: Callback[_]): Unit = js.native
  
  def stream(criteria: js.Any, writeEnd: js.Any): WritableStream | js.Error = js.native
  
  def update(criteria: js.Any): UpdateBuilder[_] = js.native
  def update(criteria: js.Any, changes: js.UndefOr[scala.Nothing], cb: Callback[_ | js.Array[_]]): UpdateBuilder[_] = js.native
  def update(criteria: js.Any, changes: js.Any): UpdateBuilder[_] = js.native
  def update(criteria: js.Any, changes: js.Any, cb: Callback[_]): UpdateBuilder[_] = js.native
  def update(criteria: js.Any, changes: js.Array[_]): UpdateBuilder[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Array[_], cb: Callback[js.Array[_]]): UpdateBuilder[js.Array[_]] = js.native
  
  def updateOne(criteria: js.Any): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.UndefOr[scala.Nothing], cb: js.UndefOr[scala.Nothing], meta: js.Any): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.UndefOr[scala.Nothing], cb: Callback[_]): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.UndefOr[scala.Nothing], cb: Callback[_], meta: js.Any): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.Any): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: js.UndefOr[scala.Nothing], meta: js.Any): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: Callback[_]): UpdateBuilder[_] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: Callback[_], meta: js.Any): UpdateBuilder[_] = js.native
}
