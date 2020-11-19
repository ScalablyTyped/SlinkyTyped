package typingsSlinky.tarantoolDriver.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TarantoolConnection extends EventEmitter {
  
  def call(functionName: String, args: js.Any*): js.Promise[_] = js.native
  
  /* Connection */
  def connect(): js.Promise[Unit] = js.native
  
  def delete(spaceId: String, indexId: String, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: String, indexId: Double, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: Double, indexId: String, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: Double, indexId: Double, key: js.Array[_]): js.Promise[_] = js.native
  
  def destroy(): Unit = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(reconnect: Boolean): Unit = js.native
  
  def eval(expression: String, args: js.Any*): js.Promise[_] = js.native
  
  def flushQueue(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def insert(spaceId: String, tuple: js.Array[_]): js.Promise[_] = js.native
  def insert(spaceId: Double, tuple: js.Array[_]): js.Promise[_] = js.native
  
  def replace(spaceId: String, tuple: js.Array[_]): js.Promise[_] = js.native
  def replace(spaceId: Double, tuple: js.Array[_]): js.Promise[_] = js.native
  
  def select(
    spaceId: String,
    indexId: String,
    limit: Double,
    offset: Double,
    iterator: String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  def select(
    spaceId: String,
    indexId: Double,
    limit: Double,
    offset: Double,
    iterator: String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  def select(
    spaceId: Double,
    indexId: String,
    limit: Double,
    offset: Double,
    iterator: String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  /* Commands */
  def select(
    spaceId: Double,
    indexId: Double,
    limit: Double,
    offset: Double,
    iterator: String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  
  def update(spaceId: String, indexId: String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: String, indexId: Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: Double, indexId: String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: Double, indexId: Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  
  def upsert(spaceId: String, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
  def upsert(spaceId: Double, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
}
