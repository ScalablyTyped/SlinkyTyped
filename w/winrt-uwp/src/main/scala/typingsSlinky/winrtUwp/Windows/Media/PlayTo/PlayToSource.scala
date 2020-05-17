package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media element to connect to a Play To target. */
@js.native
trait PlayToSource extends js.Object {
  /** Gets the connection to the Play To target. */
  var connection: PlayToConnection = js.native
  /** Gets or sets the next Play To source element. */
  var next: PlayToSource = js.native
  /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
  var preferredSourceUri: Uri = js.native
  /** Connects the next Play To source element to the Play To target. */
  def playNext(): Unit = js.native
}

object PlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit, preferredSourceUri: Uri): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext), preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSource]
  }
  @scala.inline
  implicit class PlayToSourceOps[Self <: PlayToSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: PlayToConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: PlayToSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreferredSourceUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredSourceUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

