package typingsSlinky.unzipper.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.unzipper.AnonCompressedSize
import typingsSlinky.unzipper.AnonDisknum
import typingsSlinky.unzipper.AnonPath
import typingsSlinky.unzipper.TransformpromisePromisevo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends Transform {
  var extra: AnonDisknum = js.native
  var path: String = js.native
  var props: AnonPath = js.native
  var `type`: String = js.native
  var vars: AnonCompressedSize = js.native
  def autodrain(): TransformpromisePromisevo = js.native
  def buffer(): js.Promise[Buffer] = js.native
}

