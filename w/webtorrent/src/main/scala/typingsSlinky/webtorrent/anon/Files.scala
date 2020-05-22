package typingsSlinky.webtorrent.anon

import org.scalajs.dom.raw.File
import typingsSlinky.webtorrent.mod.Torrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: js.Array[File]
  var length: Double
  var torrent: Torrent
}

object Files {
  @scala.inline
  def apply(files: js.Array[File], length: Double, torrent: Torrent): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

