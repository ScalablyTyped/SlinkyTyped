package typingsSlinky.webtorrent

import org.scalajs.dom.raw.File
import typingsSlinky.webtorrent.webtorrentMod.Torrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[File]
  var length: Double
  var torrent: Torrent
}

object Anon_Files {
  @scala.inline
  def apply(files: js.Array[File], length: Double, torrent: Torrent): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Files]
  }
}

