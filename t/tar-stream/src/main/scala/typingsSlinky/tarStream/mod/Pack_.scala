package typingsSlinky.tarStream.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pack_ extends Readable {
  /**
    * To create a pack stream use tar.pack() and call pack.entry(header, [callback]) to add tar entries.
    */
  def entry(headers: Headers): Writable = js.native
  def entry(headers: Headers, buffer: js.UndefOr[scala.Nothing], callback: Callback): Writable = js.native
  def entry(headers: Headers, buffer: String): Writable = js.native
  def entry(headers: Headers, buffer: String, callback: Callback): Writable = js.native
  def entry(headers: Headers, buffer: Buffer): Writable = js.native
  def entry(headers: Headers, buffer: Buffer, callback: Callback): Writable = js.native
  def entry(headers: Headers, callback: Callback): Writable = js.native
}

