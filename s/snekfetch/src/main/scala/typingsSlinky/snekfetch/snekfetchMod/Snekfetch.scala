package typingsSlinky.snekfetch.snekfetchMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snekfetch extends Readable {
  var data: js.Any = js.native
  var request: ClientRequest = js.native
  val response: SnekfetchResponse | Null = js.native
  def attach(name: String, data: String): Snekfetch = js.native
  def attach(name: String, data: String, filename: String): Snekfetch = js.native
  def attach(name: String, data: js.Object): Snekfetch = js.native
  def attach(name: String, data: js.Object, filename: String): Snekfetch = js.native
  def attach(name: String, data: Buffer): Snekfetch = js.native
  def attach(name: String, data: Buffer, filename: String): Snekfetch = js.native
  def `catch`(rejector: js.Function1[/* err */ js.Error, _]): js.Promise[SnekfetchResponse] = js.native
  def end(): js.Promise[SnekfetchResponse] = js.native
  def end[T](cb: js.Function2[/* err */ js.Error | Null, /* res */ SnekfetchResponse | js.Error | Null, T]): js.Promise[T] = js.native
  def query(name: String): Snekfetch = js.native
  def query(name: String, value: String): Snekfetch = js.native
  def query(name: StringDictionary[js.Any]): Snekfetch = js.native
  def query(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
  def send(): Snekfetch = js.native
  def send(data: String): Snekfetch = js.native
  def send(data: js.Object): Snekfetch = js.native
  def send(data: Buffer): Snekfetch = js.native
  def set(name: String): Snekfetch = js.native
  def set(name: String, value: String): Snekfetch = js.native
  def set(name: StringDictionary[js.Any]): Snekfetch = js.native
  def set(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
  def `then`(): js.Promise[SnekfetchResponse] = js.native
  def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T]): js.Promise[T] = js.native
  def `then`[T](
    resolver: js.Function1[/* res */ SnekfetchResponse, T],
    rejector: js.Function1[/* err */ js.Error, _]
  ): js.Promise[T] = js.native
}

