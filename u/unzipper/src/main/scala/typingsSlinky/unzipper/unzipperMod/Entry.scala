package typingsSlinky.unzipper.unzipperMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.unzipper.Anon_CompressedSize
import typingsSlinky.unzipper.Anon_CompressedSizeDisknum
import typingsSlinky.unzipper.Anon_Path
import typingsSlinky.unzipper.Anon_Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends Transform {
  var extra: Anon_CompressedSizeDisknum = js.native
  var path: String = js.native
  var props: Anon_Path = js.native
  var `type`: String = js.native
  var vars: Anon_CompressedSize = js.native
  def autodrain(): Transform with Anon_Promise = js.native
  def buffer(): js.Promise[Buffer] = js.native
}

